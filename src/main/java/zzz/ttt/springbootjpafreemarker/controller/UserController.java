package zzz.ttt.springbootjpafreemarker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import zzz.ttt.springbootjpafreemarker.enity.User;
import zzz.ttt.springbootjpafreemarker.service.UserService;

import java.util.List;


@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping
    public String index(){
        return "index";
    }


    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello_world";
    }

    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    public String listAll(Model model) {
        List<User> userList = this.userService.getUserList();
        model.addAttribute("userList", userList);
        return "user/listAll";
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public String getOne(@PathVariable("id") Long id, Model model) {
        User user = this.userService.getUserById(id);
        model.addAttribute("user", user);
        return "user/get";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return "user/edit";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addPost(@ModelAttribute("user") User user) {
        this.userService.save(user);
        return "redirect:/listAll";
    }


    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String update(@PathVariable("id") Long id, Model model) {
        model.addAttribute("action","../update");
        model.addAttribute("user", this.userService.getUserById(id));
        return "user/edit";
    }


    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updatePost(@ModelAttribute("user") User user) {
        User user1 = this.userService.save(user);
        return "redirect:/listAll";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable("id")Long id) {
        this.userService.delete(id);
        return "redirect:/listAll";
    }
}
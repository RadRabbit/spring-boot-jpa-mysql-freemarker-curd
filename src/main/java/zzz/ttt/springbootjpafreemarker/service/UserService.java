package zzz.ttt.springbootjpafreemarker.service;


import zzz.ttt.springbootjpafreemarker.enity.User;

import java.util.List;

public interface UserService {
    User getUserByname(String name);

    User saveUser(String name, String age);

    User getUserById(Long id);

    User save(User user);

    List<User> getUserList();

    void delete(Long id);
}
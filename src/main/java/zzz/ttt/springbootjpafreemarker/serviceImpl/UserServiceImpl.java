package zzz.ttt.springbootjpafreemarker.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zzz.ttt.springbootjpafreemarker.repository.UserDao;
import zzz.ttt.springbootjpafreemarker.service.UserService;
import zzz.ttt.springbootjpafreemarker.enity.User;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getUserByname(String name) {
        User user = userDao.findByName(name);
        return user;
    }
    @Override
    public User getUserById(Long id) {
        User user = userDao.findById(id);
        return user;
    }

    public User saveUser(String name, String age) {
        User user = new User();
        user.setName(name);
        user.setAge(name);
        userDao.save(user);
        return user;
    }

    @Override
    public List<User> getUserList(){
        List<User> userList = userDao.findAll();
        return userList;

    }

    @Override
    public void delete(Long id) {
        this.userDao.deleteById(id);
    }

    @Override

    public User save(User user) {
        return this.userDao.save(user);
    }

}
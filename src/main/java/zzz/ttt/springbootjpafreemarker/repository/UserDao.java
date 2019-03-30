package zzz.ttt.springbootjpafreemarker.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import zzz.ttt.springbootjpafreemarker.enity.User;

import javax.transaction.Transactional;


public interface UserDao extends JpaRepository<User, String> {
    User findByName(String name);

    User findById(Long id);

    @Transactional
    void deleteById(Long id);
}
package com.shenchangxin.community.service;


import com.shenchangxin.community.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User findUserByName(String username);
    User findUserById(Integer id);
    void deleteUserById(Integer id);
    void updateUser(User user);
    void addUser(User user);
}

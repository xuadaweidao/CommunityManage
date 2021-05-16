package com.shenchangxin.community.mapper;

import com.shenchangxin.community.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    void saveUser(User user);
    void deleteUserById(Integer id);
    User findUserById(Integer id);
    void updateUser(User user);
    User findUserByUsername(String username);

}

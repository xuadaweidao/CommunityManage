package com.shenchangxin.community.controller;

import com.shenchangxin.community.entity.Result;
import com.shenchangxin.community.entity.StatusCode;
import com.shenchangxin.community.pojo.User;
import com.shenchangxin.community.service.UserService;
import com.shenchangxin.community.utils.FormatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private FormatUtil formatUtil;

    @PostMapping("/register")
    public Result register(User user) {
        if (!formatUtil.checkStringNull(
                user.getName(),
                user.getUsername(),
                user.getPassword())){
            return Result.create(StatusCode.ERROR, "注册失败，字段不完整");
        }
        try {
            userService.saveUser(user);
            return Result.create(StatusCode.OK, "注册成功");
        } catch (RuntimeException e) {
            return Result.create(StatusCode.ERROR, "注册失败，" + e.getMessage());
        }
    }

}

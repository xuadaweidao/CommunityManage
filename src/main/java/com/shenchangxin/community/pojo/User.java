package com.shenchangxin.community.pojo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {


    private Integer id;
    private String username;
    private String password;
    private String department;
    private String name;
    private String phone;
    private String image;
    private String grade;
    private String sex;
    private String period;

}

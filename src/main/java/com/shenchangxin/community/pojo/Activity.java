package com.shenchangxin.community.pojo;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Activity {

    private Integer id;
    private String title;
    private String comment;
    private String content;
    private Integer views;
    private String communityId;
    private String userId;
    private User user;
    private Community community;
}

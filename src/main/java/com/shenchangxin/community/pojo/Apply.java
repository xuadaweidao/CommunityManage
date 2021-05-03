package com.shenchangxin.community.pojo;


import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class Apply {

    private Integer id;
    private Date createTime;
    private String communityId;
    private int state;
    private String content;
    private String userId;


}

package com.shenchangxin.community.dto;


import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;

@Data
@ToString
@Entity
public class ActivityRequestDTO {

    private String name;
    private String content;
    private String communityName;
}

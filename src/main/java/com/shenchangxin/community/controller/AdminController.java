package com.shenchangxin.community.controller;

import com.shenchangxin.community.entity.Result;
import com.shenchangxin.community.entity.StatusCode;
import com.shenchangxin.community.pojo.Community;
import com.shenchangxin.community.service.CommunityService;
import com.shenchangxin.community.utils.FormatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private CommunityService communityService;

    @Autowired
    private FormatUtil formatUtil;

    @GetMapping()
    public Result addCommunity(Community community){
        if(!formatUtil.checkObjectNull(community)){
            return Result.create(StatusCode.ERROR,"Community为空,添加失败");
        }else {
            communityService.saveCommunity(community);
            return Result.create(StatusCode.OK,"添加成功");
        }

    }


}

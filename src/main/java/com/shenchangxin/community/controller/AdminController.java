package com.shenchangxin.community.controller;

import com.shenchangxin.community.entity.Result;
import com.shenchangxin.community.entity.StatusCode;
import com.shenchangxin.community.pojo.Community;
import com.shenchangxin.community.service.CommunityService;
import com.shenchangxin.community.utils.FormatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private CommunityService communityService;

    @Autowired
    private FormatUtil formatUtil;

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @PostMapping("/addCommunity")
    public Result addCommunity(Community community){

        if(!formatUtil.checkObjectNull(community)){
            return Result.create(StatusCode.ERROR,"Community为空,添加失败");
        }else {
            communityService.saveCommunity(community);
            return Result.create(StatusCode.OK,"添加成功");
        }

    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @DeleteMapping("/deleteCommunity")
    public Result deleteCommunity(Integer id){

        if(!formatUtil.checkPositive(id)){
            return Result.create(StatusCode.ERROR,"id值不合法，删除失败");
        }else{
            communityService.deleteCommunityById(id);
            return Result.create(StatusCode.OK,"删除成功");
        }
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @PostMapping("/updateCommunity")
    public Result updateCommunity(Community community){
        if(!formatUtil.checkObjectNull(community)){
            return Result.create(StatusCode.ERROR,"Community为空,修改失败");
        }else {
            communityService.saveCommunity(community);
            return Result.create(StatusCode.OK,"修改成功");
        }
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping("/findCommunity")
    public Result findCommunity(Integer id){

        if(!formatUtil.checkPositive(id)){
            return Result.create(StatusCode.ERROR,"id值不合法,查找失败");
        }else{
            Community community = communityService.findCommunityById(id);
            return Result.create(StatusCode.OK,"操作成功",community);
        }

    }


}

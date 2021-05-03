package com.shenchangxin.community.service.impl;

import com.shenchangxin.community.mapper.CommunityMapper;
import com.shenchangxin.community.pojo.Community;
import com.shenchangxin.community.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommunityServiceImpl implements CommunityService {

    @Autowired
    private CommunityMapper communityMapper;

    @Override
    public void deleteCommunityById(Integer id) {
        communityMapper.deleteCommunityById(id);
    }

    @Override
    public Community findCommunityById(Integer id) {
        return communityMapper.findCommunityById(id);
    }

    @Override
    public void saveCommunity(Community community) {
        communityMapper.AddCommunity(community);
    }

    @Override
    public void updateCommunity(Community community) {
        communityMapper.updateCommunity(community);
    }
}

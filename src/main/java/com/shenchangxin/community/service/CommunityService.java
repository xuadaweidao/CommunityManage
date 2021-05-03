package com.shenchangxin.community.service;

import com.shenchangxin.community.pojo.Community;
import org.springframework.stereotype.Service;

@Service
public interface CommunityService {

    void deleteCommunityById(Integer id);

    Community findCommunityById(Integer id);

    void saveCommunity(Community community);

    void updateCommunity(Community community);
}

package com.shenchangxin.community.service.impl;

import com.shenchangxin.community.mapper.CommunityMapper;
import com.shenchangxin.community.pojo.Community;
import com.shenchangxin.community.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CommunityServiceImpl implements CommunityService {

    @Autowired
    private CommunityMapper communityMapper;

    /**
     * 根据id删除社团
     * @param id
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void deleteCommunityById(Integer id) {
        communityMapper.deleteCommunityById(id);
    }

    /**
     * 根据id查找社团
     * @param id
     * @return
     */
    @Override
    public Community findCommunityById(Integer id) {
        return communityMapper.findCommunityById(id);
    }

    /**
     * 保存社团
     * @param community
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void saveCommunity(Community community) {
        communityMapper.AddCommunity(community);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void updateCommunity(Community community) {
        communityMapper.updateCommunity(community);
    }
}

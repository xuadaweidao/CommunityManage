package com.shenchangxin.community.mapper;

import com.shenchangxin.community.pojo.Community;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CommunityMapper {

    void AddCommunity(Community community);

    void deleteCommunityById(Integer communityId);

    void updateCommunity(Community community);

    Community findCommunityById(Integer communityId);


}

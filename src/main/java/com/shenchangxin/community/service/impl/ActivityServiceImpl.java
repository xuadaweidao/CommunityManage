package com.shenchangxin.community.service.impl;

import com.shenchangxin.community.mapper.ActivityMapper;
import com.shenchangxin.community.pojo.Activity;
import com.shenchangxin.community.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityMapper activityMapper;


    @Override
    public List<Activity> getActivity() {
        return activityMapper.getAllActivity();
    }

    @Override
    public Activity findActivityById(Integer id) {
        return activityMapper.findActivityById(id);
    }

    @Override
    public void addActivity(Activity activity) {
        activityMapper.saveActivity(activity);
    }

    @Override
    public void deleteActivityById(Integer id) {
        activityMapper.deleteActivityById(id);
    }

    @Override
    public void updateActivity(Integer id, String name, String content, Integer views) {
        activityMapper.updateActivity(id,name,content,views);
    }


}

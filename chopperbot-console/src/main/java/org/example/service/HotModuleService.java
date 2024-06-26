package org.example.service;

import org.example.api.HeatRecommendApi;
import org.example.api.HotModuleApi;
import org.example.api.HotModuleGuardApi;
import org.example.api.LiverFollowApi;
import org.example.bean.HotModule;
import org.example.bean.hotmodule.HotModuleList;
import org.springframework.stereotype.Service;

import java.util.List;


public interface HotModuleService {



    HotModuleApi hotModuleApi();
    LiverFollowApi liverFollowApi();

    HotModuleGuardApi hotModuleGuardApi();

    HeatRecommendApi heatRecommendApi();
}

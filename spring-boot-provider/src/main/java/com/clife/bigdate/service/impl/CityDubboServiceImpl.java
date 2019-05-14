package com.clife.bigdate.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.clife.bigdata.common.model.City;
import com.clife.bigdata.common.service.CityDubboService;

/**
 * 城市业务 Dubbo 服务层实现层
 *
 * Created by Jaycekon on 20/09/2017.
 */
// 注册为 Dubbo 服务
@Service
public class CityDubboServiceImpl implements CityDubboService {

    public City findCityByName(String cityName) {
        System.out.println(cityName);
        return new City(1L,2L,"guangzhou","my honmetown!");
    }
}

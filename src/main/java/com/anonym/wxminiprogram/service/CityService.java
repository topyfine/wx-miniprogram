package com.anonym.wxminiprogram.service;

import com.anonym.wxminiprogram.dao.CityMapper;
import com.anonym.wxminiprogram.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 杨帆
 * @date 2018/6/25 17:47
 * @desc v1.0.0
 */
@Service
public class CityService {

    @Autowired
    private CityMapper cityMapper;

    public City get() {
        return cityMapper.findByState("CA");
    }

    @Transactional(rollbackFor = Exception.class)
    public void add(City city) {
        cityMapper.insert(city);
        // id相同，测试回滚
        cityMapper.insert(city);
    }
}

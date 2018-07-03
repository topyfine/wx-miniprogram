package com.anonym.wxminiprogram.customer.side.service.impl;

import com.alibaba.fastjson.JSON;
import com.anonym.wxminiprogram.customer.side.dao.FeePacketMapper;
import com.anonym.wxminiprogram.customer.side.domain.FeePacket;
import com.anonym.wxminiprogram.customer.side.service.FeePacketService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shipfly
 * @version V1.0
 * @date 2018/7/3 21:01
 * @apiNote 费率套餐服务接口实现
 */
@Service
@Slf4j
public class FeePacketServiceImpl implements FeePacketService {
    @Autowired
    private FeePacketMapper feePacketMapper;

    /**
     * 查询费率套餐列表
     * @return List<FeePacket>
     */
    @Override
    public List<FeePacket> listFeePacket() {
        log.info(">>> 查询费率套餐列表..");
        try {
            List<FeePacket> packetList = feePacketMapper.selectFeePacket();
            log.info(">>> 查询结果：{}", JSON.toJSONString(packetList));
            return packetList;
        } catch (Exception e) {
            // sql异常不可自动恢复，使用error级别日志
            log.error(">>> 查询费率套餐列表失败，{}", e.getLocalizedMessage(), e);
            return null;
        }
    }
}

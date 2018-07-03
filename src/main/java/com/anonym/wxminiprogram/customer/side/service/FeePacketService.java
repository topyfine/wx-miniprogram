package com.anonym.wxminiprogram.customer.side.service;

import com.anonym.wxminiprogram.customer.side.domain.FeePacket;

import java.util.List;

/**
 * @author shipfly
 * @version V1.0
 * @date 2018/7/3 20:58
 * @apiNote 费率套餐服务接口
 */
public interface FeePacketService {
    /**
     * 查询费率套餐列表
     *
     * @return List<FeePacket>
     */
    List<FeePacket> listFeePacket();
}

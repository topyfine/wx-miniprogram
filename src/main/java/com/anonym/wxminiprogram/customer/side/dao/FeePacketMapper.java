package com.anonym.wxminiprogram.customer.side.dao;

import com.anonym.wxminiprogram.customer.side.domain.FeePacket;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author shipfly
 * @version V1.0
 * @date 2018/7/3 20:51
 * @apiNote sql查询操作
 */
@Mapper
public interface FeePacketMapper {
    /**
     * 查询费率列表
     * @return 费率列表，按照费率类型排序
     */
    @Select("SELECT * FROM `fee_packet` ORDER BY type ASC")
    List<FeePacket> selectFeePacket();
}

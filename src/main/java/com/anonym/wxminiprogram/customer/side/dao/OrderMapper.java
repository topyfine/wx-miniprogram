package com.anonym.wxminiprogram.customer.side.dao;

import com.anonym.wxminiprogram.customer.side.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author shipfly
 * @version V1.0
 * @date 2018/7/4 21:22
 * @apiNote sql查询操作
 */
@Mapper
public interface OrderMapper {
    /**
     * 分页查询用户订单
     * @param memberId 用户id
     * @param offset 起始位置
     * @param size 分页大小
     * @return 订单列表，按照下单时间降序排列
     */
    @Select("SELECT * FROM `order` WHERE create_id = #{memberId} ORDER BY create_time DESC LIMIT #{offset}, #{size}")
    List<Order> selectOrderByPage(@Param("memberId") Long memberId,
                                  @Param("offset") int offset, @Param("size") int size);

    /**
     * 统计用户订单数量
     * @param memberId 用户id
     * @return 订单数量
     */
    @Select("SELECT count(1) FROM `order` WHERE create_id = #{memberId}")
    Integer countOrder(Long memberId);
}

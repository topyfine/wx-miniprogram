package com.anonym.wxminiprogram.customer.side.controller;

import com.anonym.wxminiprogram.common.consts.Constants;
import com.anonym.wxminiprogram.common.vo.ResultCodeEnum;
import com.anonym.wxminiprogram.common.vo.ResultList;
import com.anonym.wxminiprogram.customer.side.controller.vo.FeePacketVO;
import com.anonym.wxminiprogram.customer.side.domain.FeePacket;
import com.anonym.wxminiprogram.customer.side.service.FeePacketService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/**
 * @author shipfly
 * @version V1.0
 * @date 2018/7/3 21:40
 * @apiNote 费率套餐API
 */
@RestController
@RequestMapping(Constants.API_CUSTOMER + "/feepacket")
@Slf4j
public class FeePacketController {
    @Autowired
    private FeePacketService feePacketService;

    /**
     * 加载费率套餐列表
     * @return ResultList<FeePacketVO>
     */
    @RequestMapping("/list")
    public ResultList<FeePacketVO> loadFeePacketList() {
        log.info(">>> 准备加载费率套餐列表..");
        ResultList<FeePacketVO> vo = new ResultList<>();
        // 查询列表
        List<FeePacket> packetList = feePacketService.listFeePacket();
        if (CollectionUtils.isEmpty(packetList)) {
            vo.setCode(ResultCodeEnum.EMPTY_DATA.getCode());
            vo.setMsg(ResultCodeEnum.EMPTY_DATA.getMsg());
            return vo;
        }
        try {
            // 结果组装
            List<FeePacketVO> results = new ArrayList<>(packetList.size());
            for (FeePacket packet : packetList) {
                FeePacketVO packetVO = new FeePacketVO();
                // 套餐id
                packetVO.setPacketId(String.valueOf(packet.getId()));
                // 标题
                packetVO.setTitle(packet.getTitle());
                // 描述信息
                packetVO.setDetail(packet.getDetail());
                // 价格分-->元，保留2位小数
                BigDecimal decimal = new BigDecimal(packet.getPrice()).divide(new BigDecimal(100), 2, RoundingMode.HALF_UP);
                packetVO.setPrice(decimal.toString());
                results.add(packetVO);
            }
            vo.setResults(results);
            vo.setCode(ResultCodeEnum.NORMAL.getCode());
            vo.setMsg(ResultCodeEnum.NORMAL.getMsg());
        } catch (Exception e) {
            log.error(">>> 加载费率套餐列表失败，{}", e.getLocalizedMessage(), e);
            vo.setCode(ResultCodeEnum.ERROR.getCode());
            vo.setMsg(ResultCodeEnum.ERROR.getMsg());
        }
        return vo;
    }
}

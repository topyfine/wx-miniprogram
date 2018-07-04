package com.anonym.wxminiprogram.common.util;

/**
 * @author shipfly
 * @version V1.0
 * @date 2018/7/4 22:04
 * @apiNote 分页工具类
 */
public class PageUtils {
    private static final int DEFAULT_PAGE_NO = 1;
    private static final int DEFAULT_PAGE_SIZE = 10;

    /**
     * 计算分页起始位置
     * @param pageNo 页码
     * @param pageSize 每页大小
     * @return 分页起始位置
     */
    public static int getOffset(int pageNo, int pageSize) {
        if (pageNo <= 0) {
            pageNo = DEFAULT_PAGE_NO;
        }
        if (pageSize <= 0) {
            pageSize = DEFAULT_PAGE_SIZE;
        }
        return (pageNo - 1) * pageSize;
    }
}

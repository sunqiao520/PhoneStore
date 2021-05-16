package com.sq.phonestore.vo;

import lombok.Data;

import java.util.List;

/**
 * @author SunQiao
 * @create 2021-05-16 14:17
 */
@Data
public class SkuVO {
    private List<TreeVO> tree;
    private List<PhoneSpecsCasVO> list;
    private String price;
    private Integer stock_num;
    private Boolean none_sku = false;
    private Boolean hide_stock = false;
}

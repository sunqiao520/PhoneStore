package com.sq.phonestore.vo;

import lombok.Data;

import java.util.Map;

/**
 * @author SunQiao
 * @create 2021-05-16 14:16
 */
@Data
public class SpecsPackageVO {
    private Map<String,String> goods;
    private SkuVO sku;
}

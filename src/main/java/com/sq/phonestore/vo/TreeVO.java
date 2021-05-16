package com.sq.phonestore.vo;

import lombok.Data;

import java.util.List;

/**
 * @author SunQiao
 * @create 2021-05-16 14:19
 */
@Data
public class TreeVO {
    private String k = "规格";
    private List<PhoneSpecsVO> v;
    private String k_s = "s1";
}

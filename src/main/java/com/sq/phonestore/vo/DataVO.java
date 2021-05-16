package com.sq.phonestore.vo;

import lombok.Data;

import java.util.List;

/**
 * @author SunQiao
 * @create 2021-05-16 11:00
 */
@Data
public class DataVO {
    private List<PhoneCategoryVO> categories;
    private List<PhoneInfoVO> phones;
}

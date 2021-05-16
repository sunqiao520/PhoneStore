package com.sq.phonestore.enums;

import lombok.Getter;

/**
 * @author SunQiao
 * @create 2021-05-16 15:16
 */
@Getter
public enum PayStatusEnum {
    UNPIAD(0,"未支付"),
    PAID(1,"已支付");

    private Integer code;
    private String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}

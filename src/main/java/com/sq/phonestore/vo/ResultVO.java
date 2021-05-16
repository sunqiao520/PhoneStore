package com.sq.phonestore.vo;

import lombok.Data;

/**
 * @author SunQiao
 * @create 2021-05-16 15:38
 */
@Data
public class ResultVO<T> {
    private Integer code;
    private String msg;
    private T data;
}

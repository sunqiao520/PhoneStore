package com.sq.phonestore.exception;

import com.sq.phonestore.enums.ResultEnum;

/**
 * @author SunQiao
 * @create 2021-05-16 14:43
 */
public class PhoneException extends RuntimeException{
    public PhoneException(ResultEnum resultEnum){ super(resultEnum.getMsg());}
    public PhoneException(String error) {super(error);}
}

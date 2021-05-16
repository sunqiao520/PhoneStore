package com.sq.phonestore.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author SunQiao
 * @create 2021-05-16 15:50
 */
@Data
public class OrderForm {
    @NotEmpty(message = "姓名不能为空")
    private String name;
    @NotEmpty(message = "电话不能为空")
    private String tel;
    @NotEmpty(message = "地址不能为空")
    private String address;
    @NotNull(message = "规格不能为空")
    private Integer specsId;
    @NotNull(message = "数量不能为空")
    private Integer quantity;
}

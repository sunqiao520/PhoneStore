package com.sq.phonestore.dto;

import lombok.Data;

/**
 * @author SunQiao
 * @create 2021-05-16 15:08
 */
@Data
public class OrderDTO {
    private String orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    private Integer specsId;
    private Integer phoneQuantity;
}

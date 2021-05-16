package com.sq.phonestore.service;

import com.sq.phonestore.dto.OrderDTO;
import com.sq.phonestore.vo.OrderDetailVO;

/**
 * @author SunQiao
 * @create 2021-05-16 15:07
 */
public interface OrderService {
    public OrderDTO create(OrderDTO orderDTO);
    public OrderDetailVO findOrderDetailByOrderId(String orderId);
    public String pay(String orderId);
}

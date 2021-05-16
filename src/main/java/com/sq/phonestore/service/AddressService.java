package com.sq.phonestore.service;

import com.sq.phonestore.form.AddressForm;
import com.sq.phonestore.vo.AddressVO;

import java.util.List;

/**
 * @author SunQiao
 * @create 2021-05-16 14:52
 */
public interface AddressService {
    public List<AddressVO> findAll();
    public void saveOrUpdate(AddressForm addressForm);
}

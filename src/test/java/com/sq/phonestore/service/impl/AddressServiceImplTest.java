package com.sq.phonestore.service.impl;

import com.sq.phonestore.form.AddressForm;
import com.sq.phonestore.service.AddressService;
import com.sq.phonestore.vo.AddressVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author SunQiao
 * @create 2021-05-16 14:59
 */
@SpringBootTest
class AddressServiceImplTest {

    @Autowired
    private AddressService addressService;
    @Test
    void findAll() {
        List<AddressVO> list = addressService.findAll();
        int id = 0;
    }

    @Test
    void saveOrUpdate() {
        AddressForm addressForm = new AddressForm();
        addressForm.setId(6);
        addressForm.setName("王二狗");
        addressForm.setTel("13612344321");
        addressForm.setProvince("北京市");
        addressForm.setCity("北京市");
        addressForm.setCounty("东城区");
        addressForm.setAreaCode("110101");
        addressForm.setAddressDetail("168号606室");
        addressService.saveOrUpdate(addressForm);
    }
}
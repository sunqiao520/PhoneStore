package com.sq.phonestore.service.impl;

import com.sq.phonestore.service.PhoneService;
import com.sq.phonestore.vo.DataVO;
import com.sq.phonestore.vo.PhoneInfoVO;
import com.sq.phonestore.vo.SpecsPackageVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author SunQiao
 * @create 2021-05-16 11:31
 */
@SpringBootTest
class PhoneServiceImplTest {
    @Autowired
    private PhoneService phoneService;

    @Test
    void findDataVO() {
        DataVO dataVO = phoneService.findDataVO();
        int id = 0;
    }

    @Test
    void findPhoneInfoVOByCategoryType(){
        List<PhoneInfoVO> list = phoneService.findPhoneInfoVOByCategoryType(2);
        int id = 0;
    }

    @Test
    void findSku(){
        SpecsPackageVO specsPackageVO = phoneService.findSpecsByPhoneId(1);
        int id = 0;
    }

    @Test
    void subStock(){
        phoneService.subStock(1,1);
    }
}
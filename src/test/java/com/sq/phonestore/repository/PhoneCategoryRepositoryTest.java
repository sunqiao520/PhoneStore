package com.sq.phonestore.repository;

import com.sq.phonestore.entity.PhoneCategory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author SunQiao
 * @create 2021-05-16 9:45
 */
@SpringBootTest
class PhoneCategoryRepositoryTest {
    @Autowired
    private PhoneCategoryRepository phoneCategoryRepository;

    @Test
    void findAll(){
        List<PhoneCategory> list = phoneCategoryRepository.findAll();
        for (PhoneCategory phoneCategory : list) {
            System.out.println(phoneCategory);
        }
    }

    @Test
    void findByCategoryType(){
        PhoneCategory phoneCategory = phoneCategoryRepository.findByCategoryType(1);
        System.out.println(phoneCategory);
    }
}
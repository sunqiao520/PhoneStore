package com.sq.phonestore.repository;

import com.sq.phonestore.entity.PhoneInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author SunQiao
 * @create 2021-05-16 10:03
 */
public interface PhoneInfoRepository extends JpaRepository<PhoneInfo,Integer> {
    public List<PhoneInfo> findAllByCategoryType(Integer categoryType);
}

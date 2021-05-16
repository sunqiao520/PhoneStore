package com.sq.phonestore.repository;

import com.sq.phonestore.entity.PhoneCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author SunQiao
 * @create 2021-05-16 9:44
 */
public interface PhoneCategoryRepository extends JpaRepository<PhoneCategory,Integer> {
    public PhoneCategory findByCategoryType(Integer categoryType);
}

package com.sq.phonestore.repository;

import com.sq.phonestore.entity.PhoneSpecs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author SunQiao
 * @create 2021-05-16 10:10
 */
public interface PhoneSpecsRepository extends JpaRepository<PhoneSpecs,Integer> {
    public List<PhoneSpecs> findAllByPhoneId(Integer phoneId);
}

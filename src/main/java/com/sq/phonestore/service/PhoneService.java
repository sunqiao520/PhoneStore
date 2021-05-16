package com.sq.phonestore.service;

import com.sq.phonestore.vo.DataVO;
import com.sq.phonestore.vo.PhoneInfoVO;
import com.sq.phonestore.vo.SpecsPackageVO;

import java.util.List;

/**
 * @author SunQiao
 * @create 2021-05-16 10:44
 */
public interface PhoneService {
    public DataVO findDataVO();
    public List<PhoneInfoVO> findPhoneInfoVOByCategoryType(Integer categoryType);
    public SpecsPackageVO findSpecsByPhoneId(Integer phoneId);
    public void subStock(Integer specsId,Integer quantity);
}

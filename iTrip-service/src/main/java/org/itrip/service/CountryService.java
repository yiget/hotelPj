package org.itrip.service;

import org.itrip.pojo.country;
import org.springframework.stereotype.Service;
@Service
public interface CountryService {
    int deleteByPrimaryKey(Integer id);

    int insert(country record);

    int insertSelective(country record);

    country selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(country record);

    int updateByPrimaryKey(country record);
}

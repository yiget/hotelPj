package org.itrip.mapper;

import org.itrip.pojo.country;

public interface CountryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(country record);

    int insertSelective(country record);

    country selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(country record);

    int updateByPrimaryKey(country record);
}
package org.itrip.service.impl;

import org.itrip.mapper.CountryMapper;
import org.itrip.pojo.country;
import org.itrip.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;

public class CountryServiceImpl implements CountryService{
	@Autowired
	CountryMapper countryMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return countryMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(country record) {
		// TODO Auto-generated method stub
		return countryMapper.insert(record);
	}

	@Override
	public int insertSelective(country record) {
		// TODO Auto-generated method stub
		return countryMapper.insertSelective(record);
	}

	@Override
	public country selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return countryMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(country record) {
		// TODO Auto-generated method stub
		return countryMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(country record) {
		// TODO Auto-generated method stub
		return countryMapper.updateByPrimaryKey(record);
	}

}

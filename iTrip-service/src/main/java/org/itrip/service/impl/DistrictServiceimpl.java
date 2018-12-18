package org.itrip.service.impl;

import java.util.List;

import org.itrip.mapper.DistrictMapper;
import org.itrip.pojo.District;
import org.itrip.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DistrictServiceimpl implements DistrictService{
	@Autowired
	DistrictMapper districtMapper;
	@Override
	public List<District> getCtid() {
		// TODO Auto-generated method stub
		return districtMapper.getCtid();
	}

}

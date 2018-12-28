package org.itrip.service.impl;

import java.util.List;

import org.itrip.mapper.HotelMapper;
import org.itrip.mapper.HouseMapper;
import org.itrip.pojo.Hotel;
import org.itrip.pojo.House;
import org.itrip.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class HouseServiceimpl implements HouseService{

	@Autowired
	HouseMapper houseMapper;
	@Override
	public List<House> querybyid(int id) {
		// TODO Auto-generated method stub
		return houseMapper.querybyid(id);
	}
	@Override
	public List<House> querybyhotel(Hotel hotel) {
		// TODO Auto-generated method stub
		return houseMapper.querybyhotel(hotel);
	}

}

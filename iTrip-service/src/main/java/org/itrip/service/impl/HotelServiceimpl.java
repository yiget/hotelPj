package org.itrip.service.impl;

import java.util.List;

import org.itrip.mapper.HotelMapper;
import org.itrip.pojo.Hotel;
import org.itrip.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class HotelServiceimpl implements HotelService{

	@Autowired
	HotelMapper hotelMapper;
	
	@Override
	public List<Hotel> getRecommend() {
		// TODO Auto-generated method stub
		return hotelMapper.getRecommend();
	}

	@Override
	public List<Hotel> gethotel(Hotel hotel) {
		// TODO Auto-generated method stub
		return hotelMapper.gethotel(hotel);
	}

	@Override
	public List<Hotel> selectByPrimaryKey(int id) {
		// TODO Auto-generated method stub
		return hotelMapper.selectByPrimaryKey(id);
	}

}

package org.itrip.service;

import java.util.List;

import org.itrip.pojo.Hotel;

public interface HotelService {
	List<Hotel> getRecommend();
	List<Hotel> gethotel(Hotel hotel);
	List<Hotel>	selectByPrimaryKey(int id);
}

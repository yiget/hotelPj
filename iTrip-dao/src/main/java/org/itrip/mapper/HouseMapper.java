package org.itrip.mapper;

import java.util.List;

import org.itrip.pojo.Hotel;
import org.itrip.pojo.House;

public interface HouseMapper {
	List<House> querybyid(int id);
	List<House> querybyhotel(Hotel hotel);
	
}

package org.itrip.mapper;

import java.util.List;

import org.itrip.pojo.Hotel;
import org.springframework.stereotype.Component;

@Component
public interface HotelMapper {
	List<Hotel> getRecommend();
}

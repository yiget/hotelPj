package org.itrip.mapper;

import java.util.List;

import org.itrip.pojo.District;

public interface DistrictMapper {
	/**
	 * 查询省下的城市
	 */
	
	List<District> getCtid();
}

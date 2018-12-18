package org.itrip.service;

import java.util.List;

import org.itrip.pojo.District;

public interface DistrictService {
	/**
	 * 查询省下的城市
	 */
	
	List<District> getCtid();
}

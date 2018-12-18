package org.itrip.service;

import java.util.List;

import org.itrip.pojo.Dictionarytype;

public interface DictionarytypeService {
	/**
	 * 查询字典表下的酒店类型
	 * @return
	 */
	List<Dictionarytype> getHotelType();
	/**
	 * 查询字典表的价格
	 * @return
	 */
	List<Dictionarytype> getPrice();
}

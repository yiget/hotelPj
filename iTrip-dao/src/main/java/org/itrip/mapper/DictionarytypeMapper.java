package org.itrip.mapper;

import java.util.List;

import org.itrip.pojo.Dictionarytype;

public interface DictionarytypeMapper {
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

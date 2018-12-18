package org.itrip.service.impl;

import java.util.List;
import org.itrip.mapper.DictionarytypeMapper;
import org.itrip.pojo.Dictionarytype;
import org.itrip.service.DictionarytypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DictionarytypeServiceimpl implements DictionarytypeService{
	@Autowired
	DictionarytypeMapper DictionarytypeMapper;
	@Override
	public List<Dictionarytype> getHotelType() {
		// TODO Auto-generated method stub
		return DictionarytypeMapper.getHotelType();
	}

	@Override
	public List<Dictionarytype> getPrice() {
		// TODO Auto-generated method stub
		return DictionarytypeMapper.getPrice();
	}

}

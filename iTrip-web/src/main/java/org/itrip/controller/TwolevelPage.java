package org.itrip.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.itrip.pojo.Dictionarytype;
import org.itrip.pojo.District;
import org.itrip.service.DictionarytypeService;
import org.itrip.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TwolevelPage {
	

	@Autowired
	DictionarytypeService dictionarytypeService;
	
	
	@Autowired
	DistrictService districtService;
	
	@RequestMapping("accommodation")
	public String accommodation(HttpServletRequest request) {
		List<District> ctid=districtService.getCtid();
		List<Dictionarytype> hotelType=dictionarytypeService.getHotelType();
		List<Dictionarytype> price=dictionarytypeService.getPrice();
		request.setAttribute("ctid", ctid);
		request.setAttribute("hotelType", hotelType);
		request.setAttribute("price", price);
		return "accommodation";
	}

}

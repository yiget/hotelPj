package org.itrip.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.itrip.pojo.Dictionarytype;
import org.itrip.pojo.District;
import org.itrip.pojo.Hotel;
import org.itrip.pojo.country;
import org.itrip.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TwolevelPage {
	

	@Autowired
	DictionarytypeService dictionarytypeService;
	
	
	@Autowired
	HotelService hotelService;
	
	@Autowired
	UserService userService;
	
	@Autowired
	DistrictService districtService;
	
	@RequestMapping("accommodation")
	public String accommodation(HttpServletRequest request) {
		List<District> ctid=districtService.getCtid();
		List<Dictionarytype> hotelType=dictionarytypeService.getHotelType();
		List<Dictionarytype> price=dictionarytypeService.getPrice();
		String name =request.getParameter("from");
		Hotel ho=new Hotel();
		Map<String, Object> map=new HashMap<>();
		List<country> list = userService.querycity(map);
		country countr=new country();
		
		System.out.println(name);
		for (int i = 0; i < list.size(); i++) {
			if(name.equals(list.get(i).getName()))
			{
				ho.setCityid(list.get(i).getId());
			}
		}
		System.out.println(ho.getCityid());
		List<Hotel> hotels=hotelService.gethotel(ho);
		System.out.println(hotels.size());
		request.setAttribute("hotel", hotels);
		request.setAttribute("ctid", ctid);
		request.setAttribute("hotelType", hotelType);
		request.setAttribute("price", price);
		return "accommodation";
		
	}
	
	@RequestMapping("action")
	public String action(HttpServletRequest request,int id) {
		Hotel hotel =  hotelService.selectByPrimaryKey(id).get(0);
		System.out.println(id);
		request.setAttribute("hotel", hotel);
		return "hotel_details";
	}

}

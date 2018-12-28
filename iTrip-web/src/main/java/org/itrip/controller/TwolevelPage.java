package org.itrip.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.itrip.pojo.Dictionarytype;
import org.itrip.pojo.District;
import org.itrip.pojo.Hotel;
import org.itrip.pojo.House;
import org.itrip.pojo.country;
import org.itrip.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSON;

@Controller
public class TwolevelPage {
	

	@Autowired
	HouseService houseService;
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
		
		List<Dictionarytype> hotelType=dictionarytypeService.getHotelType();
		List<Dictionarytype> price=dictionarytypeService.getPrice();
		String name =request.getParameter("from");
		Hotel ho=new Hotel();
		Map<String, Object> map=new HashMap<>();
		List<country> list = userService.querycity(map);
		country countr=new country();
		
		for (int i = 0; i < list.size(); i++) {
			if(name.equals(list.get(i).getName()))
			{
				ho.setCityid(list.get(i).getId());
			}
		}
		
		
		List<Hotel> hotels=hotelService.gethotel(ho);
		List<District> ctid=new ArrayList<>();
		
		for (int i = 0; i < hotels.size(); i++) {
			hotels.get(i).setHouses(houseService.querybyid(hotels.get(i).getId())) ;
		
		}
		request.setAttribute("hotel", hotels);
		request.setAttribute("mansize", hotels.size());
		
		request.setAttribute("list", list);
		request.setAttribute("ctid", ctid);
		request.setAttribute("hotelType", hotelType);
		request.setAttribute("price", price);
		request.setAttribute("froms", name);
		return "accommodation";
		
	}
	
	@RequestMapping("action")
	public String action(HttpServletRequest request,int id) {
		Hotel hotel =  hotelService.selectByPrimaryKey(id).get(0);
		hotel.setHouses(houseService.querybyid(hotel.getId())) ;
		request.setAttribute("hotel", hotel);
		return "hotel_details";
	}

	
	/**
	 * 二级页面查询
	 * 
	 * 
	 */
	
	 @RequestMapping(value="/Xishuangbanna")
	 
	public String Xishuangbanna(HttpServletRequest request,String from) {
		String prices=request.getParameter("price");
		Hotel ho=new Hotel();
		System.out.println(JSON.toJSON(from));
		String type=request.getParameter("zice");
		
		String starttime =request.getParameter("starttime");
		String endtime =request.getParameter("endtime");
		String name =request.getParameter("name");
		String names =request.getParameter("names");
		String types =request.getParameter("types");
		String types1=request.getParameter("types1");
		
		
		
		List<Dictionarytype> hotelType=dictionarytypeService.getHotelType();
		List<Dictionarytype> price=dictionarytypeService.getPrice();
		System.out.println(types+"types1="+types1+"names="+names+"type="+type);
		if(types!=null) {
			
			if(types.equals("type")) {
				ho.setHoteltype(Integer.valueOf(types1));
			}
		}

		Map<String, Object> map=new HashMap<>();
		List<country> list = userService.querycity(map);
		List<District> ctid=new ArrayList<>();
		if(name!=null || name.equals("")) {
			ho.setHotelname(name);
		}
		for (int i = 0; i < list.size(); i++) {
			if(from.equals(list.get(i).getName()))
			{
				ho.setCityid(list.get(i).getId());
				
			}
		}
		List<Hotel> hotels=hotelService.gethotel(ho);
		for (int i = 0; i < hotels.size(); i++) {
			Hotel hotel= hotels.get(i);
//			System.out.println(names.equals(null));
			if(names!=null) {
			if(names.equals("price")) {
				if(type.equals("100")) {
					hotel.setHotellevel(1);
					hotel.setRoomPrice1(Integer.valueOf(type));
				}else if(type.equals("500") || type.equals("0")) {
					hotel.setHotellevel(2);
					hotel.setRoomPrice1(Integer.valueOf(type));
				}else {
					String[] nasod=type.split("-");
					hotel.setRoomPrice1(Integer.valueOf(nasod[0]));
					hotel.setRoomPrice2(Integer.valueOf(nasod[1]));
					request.setAttribute("price1", Integer.valueOf(nasod[0]));
					request.setAttribute("price2", Integer.valueOf(nasod[1]));
					hotel.setHotellevel(3);
				}
			}
			
			}
			hotels.get(i).setHouses(houseService.querybyhotel(hotel)) ;
			
			}
		
		
		System.out.println(type);
		request.setAttribute("type",type);
		request.setAttribute("types",types1);
//		System.out.println("hotels"+hotels.get(0).getHotelname());
		request.setAttribute("hotel", hotels);
		request.setAttribute("prices", type);
		request.setAttribute("list", list);
		request.setAttribute("hotelType", hotelType);
		request.setAttribute("price", price);
		request.setAttribute("froms", from);
		request.setAttribute("ctid", ctid);
		request.setAttribute("mansize", hotels.size());
		return "accommodation";
	}
}

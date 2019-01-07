package org.itrip.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.itrip.mapper.CountryMapper;
import org.itrip.pojo.Dictionarytype;
import org.itrip.pojo.District;
import org.itrip.pojo.Hotel;
import org.itrip.pojo.country;
import org.itrip.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

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
	
	@Autowired
	CountryMapper countryService;
	
	@RequestMapping("accommodation")
	public String accommodation(HttpServletRequest request) {
		String pagenum=request.getParameter("pagenum");
		List<Dictionarytype> hotelType=dictionarytypeService.getHotelType();
		List<Dictionarytype> price=dictionarytypeService.getPrice();
		String name =request.getParameter("from");
		Hotel ho=new Hotel();
		pagenum=(null==pagenum)?"1":pagenum;
		Map<String, Object> map=new HashMap<>();
		List<country> list = userService.querycity(map);
		country countr=new country();
			PageHelper.startPage(Integer.valueOf(pagenum),5);
		
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
		
		PageInfo<Hotel> page=new PageInfo<Hotel>(hotels);

		request.getSession().removeAttribute("type");
		request.getSession().removeAttribute("types");
		request.setAttribute("hotel", hotels);
		request.setAttribute("pagenum", pagenum);
		request.setAttribute("mansize", hotels.size());
		//分页结果
		request.setAttribute("page", page);
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
		country conutry1 =  countryService.selectByPrimaryKey(hotel.getCityid());
		request.setAttribute("hotel", hotel);
		request.setAttribute("conutry", conutry1);
		return "hotel_details";
	}

	
	/**
	 * 二级页面查询
	 * 
	 * 
	 */
	
	 @RequestMapping(value="/Xishuangbanna")
	 
	public String Xishuangbanna(HttpServletRequest request,String from) {
		 String pagenum=request.getParameter("pagenum");
		String prices=request.getParameter("price");
		System.out.println(pagenum);
		Hotel ho=new Hotel();
		System.out.println(JSON.toJSON(from));
		String type=null;
		pagenum=(null==pagenum)?"1":pagenum;
		String types1=null;
		System.out.println((String) request.getSession().getAttribute("types"));
		
		try {
			type = request.getParameter("zice")==""?
				(String) request.getSession().getAttribute("type"):request.getParameter("zice");
			types1 = request.getParameter("types1")==""?
				(String) request.getSession().getAttribute("types"):request.getParameter("types1");
		}catch (Exception e) {
			System.out.println("空");
		}
		String starttime =request.getParameter("starttime");
		String endtime =request.getParameter("endtime");
		String name =request.getParameter("name");
		String names =request.getParameter("names");
		String types =request.getParameter("types");
		
		
		
		
		List<Dictionarytype> hotelType=dictionarytypeService.getHotelType();
		List<Dictionarytype> price=dictionarytypeService.getPrice();
		System.out.println(types+"types1="+types1+"names="+names+"type="+type);
		if(types1!=null) {
			ho.setHoteltype(Integer.valueOf(types1));
		}
		Map<String, Object> map=new HashMap<>();
		List<country> list = userService.querycity(map);
		List<District> ctid=new ArrayList<>();
		if(name!=null && !"".equals(name)) {
			ho.setHotelname(name);
		}
		for (int i = 0; i < list.size(); i++) {
			if(from.equals(list.get(i).getName()))
			{
				ho.setCityid(list.get(i).getId());
				
			}
		}
		PageHelper.startPage(Integer.valueOf(pagenum),5);
		List<Hotel> hotels=hotelService.gethotel(ho);
		for (int i = 0; i < hotels.size(); i++) {
			Hotel hotel= hotels.get(i);
//			System.out.println(names.equals(null));
			if(type!=null) {
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
			hotels.get(i).setHouses(houseService.querybyhotel(hotel)) ;
			
			}
	
		PageInfo<Hotel> page=new PageInfo<Hotel>(hotels);
		System.out.println(page.getEndRow());
		System.out.println(JSON.toJSONString(page.getNavigatepageNums()));
		request.getSession().setAttribute("type",type);
		request.getSession().setAttribute("types",types1);
//		System.out.println("hotels"+hotels.get(0).getHotelname());
		request.setAttribute("hotel", hotels);
		request.setAttribute("prices", type);
		request.setAttribute("list", list);
		request.setAttribute("hotelType", hotelType);
		request.setAttribute("price", price);
		request.setAttribute("froms", from);
		request.setAttribute("ctid", ctid); 
		request.setAttribute("pagenum", pagenum);
		request.setAttribute("mansize", hotels.size());
		request.setAttribute("page", page);
		
		return "accommodation";
	}
}

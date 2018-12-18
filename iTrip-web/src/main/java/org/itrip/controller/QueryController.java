package org.itrip.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.itrip.pojo.country;
import org.itrip.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

@Controller
public class QueryController {
	@Autowired
	UserService userService;
	
	@RequestMapping("querycity")
	public String querycity(HttpServletRequest request) {
		System.out.println();
		Map<String, Object> map=new HashMap<>();
		List<country> list = userService.querycity(map);
		System.out.println(JSON.toJSONString(list));
		request.setAttribute("list", list);
		return "home";
	}
	
	@RequestMapping("iquerycity")
	@ResponseBody
	public String iquerycity(HttpServletRequest request,int id) {
		System.out.println(id);
		Map<String, Object> map=new HashMap<>();
		map.put("status", id);
		List<country> list = userService.querycity(map);
		System.out.println(JSON.toJSONString(list));
		request.setAttribute("list", list);
		return JSON.toJSONString(list);
	}
}

package org.itrip.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.itrip.pojo.Hotel;
import org.itrip.pojo.User;
import org.itrip.service.HotelService;
import org.itrip.service.UserService;
import org.itrip.utils.ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yaml.snakeyaml.external.biz.base64Coder.Base64Coder;

import com.alibaba.fastjson.JSON;

@Controller
public class UserRegistration {
	@Autowired
	UserService userService;
	@Autowired
	HotelService hotelService;

	/**
	 * 跳转到注册页面	
	 */
	@RequestMapping("relos")
	public String relos() {
		return"register";
	}
	
	/**
	 * 注册提交到数据库
	 * @throws IOException 
	 */
	@RequestMapping("register.ydd")
	public String register(User user,HttpServletRequest request) throws IOException {
		//获取session生成的验证码
		String yzm=(String) request.getSession().getAttribute("code");
		//获取手动输入的验证码
		String verifycode=request.getParameter("verifycode");
		//判断验证码不区分大小写
		if(!verifycode.equalsIgnoreCase(yzm)) {
			//验证码不正确返回账号密码
			request.setAttribute("username", user.getUsername());
			request.setAttribute("password", user.getPassword());
			return "register";
		}
		//验证码输入正确后才能注册
		userService.getQueryUserName(user);
		request.getSession().setAttribute("user", user);
/*		loginContext.index(request, user.getUsername(), user.getPassword());
*/		return "home";
	}
	
	@RequestMapping("name.ydd")
	@ResponseBody
	public String getName(String name) {
		
		User user=new User();
		user.setUsername(name);
		User us=userService.getRegister(user);
		String ams = null;
		if(us==null) {
			return ams="false";
		}else {
			return ams="true";
		}
			
		
		
	}
	
	/**
	 * 图片验证码
	 */
	@RequestMapping("code.do")
    public String getCode(HttpServletRequest request, HttpServletResponse response) throws Exception{
        response.setContentType("image/jpeg");
        //禁止图像缓存
        response.setHeader("Pragma","no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        ImageUtil imageUtil = new ImageUtil(120, 40, 4,30);
        request.getSession().setAttribute("code", imageUtil.getCode());
        imageUtil.write(response.getOutputStream());
        return null;
	}
	/**
	 * 推荐酒店
	 */
	@RequestMapping("getRecommend.ydd")
	@ResponseBody
	public String getRecommend() {
		List<Hotel> hotel=hotelService.getRecommend();
		String str = JSON.toJSONString(hotel);
		return str;
	}

}

package org.itrip.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.itrip.pojo.User;
import org.itrip.service.UserService;
import org.itrip.utils.ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yaml.snakeyaml.external.biz.base64Coder.Base64Coder;

@Controller
public class UserRegistration {
	@Autowired
	UserService userService;
	@Autowired
	LoginContext loginContext;

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
		String yzm=(String) request.getSession().getAttribute("code");
		String verifycode=request.getParameter("verifycode");
		System.out.println(yzm+verifycode);
		if(!verifycode.equalsIgnoreCase(yzm)) {
			request.setAttribute("username", user.getUsername());
			request.setAttribute("password", user.getPassword());
			return "register";
		}
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
		System.out.println(user);
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




}

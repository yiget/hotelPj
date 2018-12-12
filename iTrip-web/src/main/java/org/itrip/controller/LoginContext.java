package org.itrip.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.itrip.pojo.User;
import org.itrip.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yaml.snakeyaml.external.biz.base64Coder.Base64Coder;

import com.alibaba.fastjson.JSONObject;

@Controller
public class LoginContext {
	@Autowired
	UserService userService;
	
	/**
	 * 登陆验证
	 * @param req 
	 * @return 验证信息
	 * @throws IOException
	 */
	@RequestMapping("Login")
	@ResponseBody
	public String index(HttpServletRequest request ,String ajaxloginemail,String ajaxloginpassword64) throws IOException {
		System.out.println("Login...........................");
		String verifyfailed="";
		User user = new User();
		user.setUsername(ajaxloginemail);
		//登陆判断
		if(userService.getLogin(user).size()==0) {	//用户名错误
			verifyfailed = "failemail";
		}else{
			String encoded = Base64Coder.decodeString(ajaxloginpassword64);
			user.setPassword(encoded);
			System.out.println(encoded);
			if(userService.getLogin(user).size()==0) { //密码错误
				verifyfailed = "failpwd";
			}else {		//登陆成功
				//request.getSession().setAttribute("", value);
				verifyfailed = "verifyfailed";
			}
		}
		return verifyfailed;
	}
}

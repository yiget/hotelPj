package org.itrip.service;



import java.util.List;
import java.util.Map;

import org.itrip.pojo.User;
import org.itrip.pojo.country;

public interface UserService {
	/**
	 * 登陆模块
	 * @param user
	 * @return
	 */
	public List<User> getLogin(User user);
	/**
	 * 注册模块
	 * @param user
	 * @return
	 */
	User getRegister(User user);
	/**
	 * 查询用户
	 * @param user
	 * @return
	 */
	
	
	int getQueryUserName(User user);
	
	/**
	 * 查询城市
	 * @return
	 */
	List<country> querycity(Map<String, Object> map);

}

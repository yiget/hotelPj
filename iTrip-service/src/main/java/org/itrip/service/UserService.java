package org.itrip.service;



import java.util.List;

import org.itrip.pojo.User;

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

}

package org.itrip.mapper;



import java.util.List;
import java.util.Map;

import org.itrip.pojo.User;
import org.itrip.pojo.country;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {
	/**
	 * 登陆
	 * @param user
	 * @return
	 */
	List<User> getLogin(User user);
	/**
	 * 注册模块
	 * @param user
	 * @return
	 */
	User getRegister(User user);
	
	/**
	 * 注册用户
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

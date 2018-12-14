package org.itrip.service.impl;



import java.util.List;

import org.itrip.mapper.UserMapper;
import org.itrip.pojo.User;
import org.itrip.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	
	@Override
	public List<User> getLogin(User user) {
		return userMapper.getLogin(user);
	}

	@Override
	public User getRegister(User user) {
		// TODO Auto-generated method stub
		return userMapper.getRegister(user);
	}

	@Override
	public int getQueryUserName(User user) {
		// TODO Auto-generated method stub
		return userMapper.getQueryUserName(user);
	}

}

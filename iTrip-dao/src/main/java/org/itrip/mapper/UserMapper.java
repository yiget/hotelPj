package org.itrip.mapper;



import java.util.List;

import org.itrip.pojo.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {
	List<User> getLogin(User user);
}

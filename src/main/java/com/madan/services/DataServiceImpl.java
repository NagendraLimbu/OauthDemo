package com.madan.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.madan.models.User;
/**
 * @author Madan
 *
 */
@Service
public class DataServiceImpl implements DataService {

	@Override
	public List<User> getUserList() {
		
		// preparing user list with few hard coded values
		List<User> userList = new ArrayList<User>();
		
		userList.add(new User(1, "madan", "m@s.com", "1111111111"));
		userList.add(new User(2, "Shree", "s@r.com", "2222222222222"));
		userList.add(new User(3, "Govinda", "g@b.com", "3333333333333"));
		
		return userList;
	}

}

package com.user.service;

import org.springframework.stereotype.Service;

import com.user.entity.User;
@Service
public class UserServiceImpl implements UserServiceInt {

	
	
	@Override
	public User save(User user) {
		user =new User("naresh", 1, "n@gmail.com", 566565);
		return user;
	}

	@Override
	public String addData(int n1, int n2) {
		int c=n1+n2;
		return "Result::: "+c;
	}

	@Override
	public String age(int n1) {
		if(n1 < 18) {
		return "Minor::"+n1;
		}else {
			return "Major::"+n1;
		}
	}

	@Override
	public String delete(int n1) 
	{
		
		return "Result::";
	}
	
}

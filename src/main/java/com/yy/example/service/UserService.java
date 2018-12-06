package com.yy.example.service;

import com.yy.example.bean.User;
import com.yy.example.dao.UserDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;


@Service
public class UserService {
	

	@Autowired
	private UserDao userDao;
	@Async
	public List<User> getById(Integer id) {
		//User user11=new User();
	/*	for(int i=0;i<30000;i++){
		userDao.create(user1);
		}*/
		List<User> user = userDao.getById();
		//userDao.create(user);
		return user;
	}
	

}
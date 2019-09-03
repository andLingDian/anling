package com.emp.service.impl;

import java.util.Set;

import javax.annotation.Resource;

import com.emp.dao.UserDao;
import com.emp.entity.User;
import com.emp.service.UserService;

public class UserServiceImp  implements UserService{

	//◊¢»ÎDao∂‘œÛ
	@Resource
	private UserDao userDao;
	
	 
	@Override
	public User queryUser(String username) {
		User user =userDao.queryByUserName(username);
		return user;
	}

	@Override
	public Set<String>querRoles(String username) {
		Set<String> role=userDao.queryRole(username);
		return role;
	}

	@Override
	public Set<String> queryPermissions(String username) {
		Set<String>perm=userDao.querPermissions(username);
		return null;
	}
 
}

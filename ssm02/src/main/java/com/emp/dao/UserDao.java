package com.emp.dao;

import java.util.Set;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.emp.entity.User;

public interface UserDao {
	
	/**
	 * 依据用户名查询用户
	 */
	@Select("select id.username.password.role_id"
			+"from s_userwhere username=#{username}")
	 User queryByUserName(@Param("username")String user);
	/**
	 * 依据用户名查询用户所有的角色
	 */
	@Select(" select r.rolename from s_user u inner join s_role r"
			+"on u.role_id=r.id"
			+"where u.username=#{username}")
	 Set<String>queryRole(@Param("username")String user);
	/**
	 * 依据用户名查询用户所有的权限
	 */
	@Select(" select p.permission_name"
			+ " from s_user u inner join s_role r"
			+ " on u.role_id=r.id"
			+ " inner join s_permission p"
			+ " on p.role_id=r.id"
			+ " where u.username=#{username} ")
    Set<String>querPermissions(@Param("username")String username);
}

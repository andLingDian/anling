package com.emp.dao;

import java.util.Set;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.emp.entity.User;

public interface UserDao {
	
	/**
	 * �����û�����ѯ�û�
	 */
	@Select("select id.username.password.role_id"
			+"from s_userwhere username=#{username}")
	 User queryByUserName(@Param("username")String user);
	/**
	 * �����û�����ѯ�û����еĽ�ɫ
	 */
	@Select(" select r.rolename from s_user u inner join s_role r"
			+"on u.role_id=r.id"
			+"where u.username=#{username}")
	 Set<String>queryRole(@Param("username")String user);
	/**
	 * �����û�����ѯ�û����е�Ȩ��
	 */
	@Select(" select p.permission_name"
			+ " from s_user u inner join s_role r"
			+ " on u.role_id=r.id"
			+ " inner join s_permission p"
			+ " on p.role_id=r.id"
			+ " where u.username=#{username} ")
    Set<String>querPermissions(@Param("username")String username);
}

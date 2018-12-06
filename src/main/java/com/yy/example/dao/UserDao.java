package com.yy.example.dao;


import com.yy.example.bean.User;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserDao {
	 @Select("SELECT u.* FROM user u ORDER  by id DESC") 
	List<User> getByMap(Map<String, Object> map);
	List<User> getByRoleId(Map<String, Object> map);
	 @Select("SELECT * FROM \"user\"")  
	List<User> getById();
	//void create2();
	 @Insert("INSERT INTO \"user\" VALUES(1,'1','1','1','1','1','1','1','1',1)")
	Integer create(User user);
	 @Update({"<script>",
		    "UPDATE user set",
		    "<when test=\"cnname != null and cnname != ''\">",
		    "cnname = #{cnname}",
		    "</when>",
		    "<when test=\"password != null and password != ''\">",
		    "password = #{password}",
		    "</when>",
		    "<when test=\"email != null and email != ''\">",
		    "email = #{email}",
		    "</when>",
		    "<when test=\"telephone != null and telephone != ''\">",
		    "telephone = #{telephone}",
		    "</when>",
		    "<when test=\"mobilePhone != null and mobilePhone != ''\">",
		    "mobile_phone = #{mobilePhone}",
		    "</when>",
		    "</script>"})
	int update(User user);
	 @Select("select u.* from user u where username= #{username}")
	User getByUserName(String userName);
}
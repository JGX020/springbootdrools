package com.yy.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.yy.example.bean.Mail;
import com.yy.example.bean.User;

public interface MailDao {
	 @Insert("INSERT INTO \"mailmessage\" VALUES(#{id},#{from},#{receiveaddress},#{senddate},#{seen},#{priority},#{replysign},#{content})")
		Integer create(Mail mail);
	 @Select("SELECT * FROM \"mailmessage\"")  
		List<Mail> getall();
	 @Delete("delete from  \"mailmessage\"") 
	 int deleteall();
}

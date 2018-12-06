package com.yy.example.dao;

import java.util.List;


import org.apache.ibatis.annotations.Select;


import com.yy.example.bean.urls;

public interface UrlsDao {
	 @Select("SELECT u.* FROM urlsearch u ORDER  by powers DESC") 
		List<urls> geturls();
}

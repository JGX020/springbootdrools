package com.yy.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yy.example.bean.urls;

import com.yy.example.dao.UrlsDao;
@Service
public class urlsService {
	@Autowired
	private UrlsDao urlsdao;
	public List<urls> getall(){
		return urlsdao.geturls();
	}
}

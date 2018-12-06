package com.yy.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yy.example.bean.Mail;
import com.yy.example.bean.urls;
import com.yy.example.service.mailService;
import com.yy.example.service.urlsService;

@RequestMapping(value = "/urls")
@RestController
public class UrlsController {
	@Autowired
    urlsService urlservice;
	@RequestMapping(value = "/getlist", method = RequestMethod.POST)
    @ResponseBody
    public PageInfo<urls> getlist(int startpage) throws Exception {
		PageHelper.startPage(startpage,5);
		List<urls>urllist=urlservice.getall();
		PageInfo<urls> pageInfo=new PageInfo<urls>(urllist);
		return pageInfo;
    }
}

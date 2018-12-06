package com.yy.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yy.example.bean.Mail;
import com.yy.example.service.mailService;

@RequestMapping(value = "/mails")
@RestController
public class MailController {
	@Autowired
    mailService mailservice;
	
	@RequestMapping(value = "/insertlist", method = RequestMethod.GET)
    @ResponseBody
    public Object list() throws Exception {
		mailservice.receive();
		return "Get all mails";
    }
	@RequestMapping(value = "/getlist", method = RequestMethod.GET)
    @ResponseBody
    public PageInfo<Mail> getlist(int startpage) throws Exception {
		PageHelper.startPage(startpage,10);
		List<Mail>maillist=mailservice.getall();
		PageInfo<Mail> pageInfo=new PageInfo<Mail>(maillist);
		return pageInfo;
    }
}

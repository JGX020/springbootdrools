package com.yy.example.service;
import java.util.Date;
import java.util.Queue;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.yy.example.controller.UserController;

/**
 * 
 * spring task简单使用
 *
 */
@Configuration
@EnableScheduling
public class SpringTaskSample {

	/**
	 * 每10秒打印一次:时间取决于运行系统时间
	 */
	int i=0;
	
	@Scheduled(cron = "0/10 * * * * *")
	public void task1() {
		if(UserController.i.size()!=0){
		System.out.println(getClass()+ "----task1" + new Date());
		
		
		System.out.println(UserController.i.poll());
		
		}
	}

	/**
	 * 每1分钟打印一次:时间取决于运行系统时间
	 */
	
}
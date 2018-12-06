package com.yy.example.controller;

import java.util.LinkedList;
import java.util.Queue;

import javax.servlet.http.HttpServletRequest;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yy.example.bean.Message;
import com.yy.example.service.*;

@RequestMapping(value = "/users")
@RestController
public class UserController {
	public static Queue<String> i=new LinkedList<String>();
	@Autowired
    UserService userservice;
	@Autowired
    SpringTaskSample springtasksample;

	@RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Object list() {
		return "Get all User"+userservice.getById(1).toString();
    }

	
	@RequestMapping(value = "/111", method = RequestMethod.GET)
    @ResponseBody
    public Object detail() {
		return "Get a user"+userservice.getById(1).get(0).toString();
    }
	@RequestMapping(value = "/333", method = RequestMethod.GET)
    @ResponseBody
    public Object detail3() {
		for(int j=0;j<10;j++){
		i.offer("aaa");
		}
		springtasksample.task1();
		return "Get a user";
    }
	@RequestMapping(value = "/222", method = RequestMethod.GET)
    @ResponseBody
    public Object detail2() {
		 try {
	            // load up the knowledge base
		        KieServices ks = KieServices.Factory.get();
	    	    KieContainer kContainer = ks.getKieClasspathContainer();
	        	KieSession kSession = kContainer.newKieSession("ksession-rules");

	            // go !
	            Message message = new Message();
	            message.setMessage("1111");
	            message.setStatus(Message.HELLO);
	            kSession.insert(message);
	            kSession.fireAllRules();
	        } catch (Throwable t) {
	            t.printStackTrace();
	        }
		 
		return "Get a user";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Object create(HttpServletRequest request) {
		return "POST a user";
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    public Object update(HttpServletRequest request) {
		return "PUT a user";
    }
   

}
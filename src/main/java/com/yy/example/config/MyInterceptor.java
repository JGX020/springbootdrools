package com.yy.example.config;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

//import ch.qos.logback.classic.Logger;

/**
 * 自定义拦截器2
 *
 * @author   单红宇(365384722)
 * @myblog  http://blog.csdn.net/catoop/
 * @create    2016年1月7日
 */
public class MyInterceptor implements HandlerInterceptor {
	private final Logger logger = LoggerFactory.getLogger(MyInterceptor.class);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
    	 logger.info(">>>MyInterceptor2>>>>>>>this request using(Controller method use before).ip"+request.getRemoteAddr()+" port "+request.getRemotePort());

        return true;// 只有返回true才会继续向下执行，返回false取消当前请求
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
    	logger.info(">>>MyInterceptor2>>>>>>>this request using(Controller method use after).ip"+request.getRemoteAddr()+" port "+request.getRemotePort());
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
    	logger.info(">>>MyInterceptor2>>>>>>>this request using(Controller method use before).ip"+request.getRemoteAddr()+" port "+request.getRemotePort());
    }
   
}

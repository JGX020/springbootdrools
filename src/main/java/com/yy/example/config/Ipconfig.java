package com.yy.example.config;
import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.http.HttpServletRequest;

/**
 * @author kingboy--KingBoyWorld@163.com
 * @date 2017/9/17 下午3:35
 * @desc 配置日志中显示IP.
 */
public class Ipconfig extends ClassicConverter {

    @Override
    public String convert(ILoggingEvent event) {
        try {
            return InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return null;
    }
    

}
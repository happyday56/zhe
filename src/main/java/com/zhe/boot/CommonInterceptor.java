package com.zhe.boot;


import com.zhe.utils.StringHelper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by lgh on 2016/1/12.
 */
public class CommonInterceptor implements HandlerInterceptor {
    private static Log log = LogFactory.getLog(CommonInterceptor.class);

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        try {
            log.info("url:" + request.getRequestURL());
            log.info("referer:" + request.getHeader("Referer"));
            log.info("user-agent:" + request.getHeader("User-Agent"));
            log.info("ip:" + StringHelper.getIp(request));

        } catch (Exception ex) {

        }

        return true;
    }


    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }


    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }


}

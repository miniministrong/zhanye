package com.ebiz.zhanye.commons.interceptor;

import com.ebiz.zhanye.commons.utils.JwtUtils;
import com.ebiz.zhanye.commons.validation.user.Login;
import com.ebiz.zhanye.exception.LoginException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.FilterChain;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author dhl
 * @datetime 2021/8/17  13:53
 */
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        System.out.println("]=================================1111===========================");
        String token = request.getHeader("token");
        System.out.println(token);
        if (StringUtils.isBlank(token)) {
            log.error("token为空或token已过期");
            throw new LoginException(400,"token为空或token已过期");
        }
        if (!JwtUtils.verify(token)) {
            log.error("token不正确");
            throw new LoginException(400, "token不正确");
        }
        return true;

        /*String token = request.getHeader("token");
        if(StringUtils.isNotBlank(token)&& JwtUtils.verify(token)){
            return true;
        }
        throw new LoginException("请重新登录");*/
    }
}
package com.ebiz.zhanye.commons.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author dhl
 * @datetime 2021/8/19  9:36
 */
@Component
public class CROSFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse res = (HttpServletResponse) response;
        res.addHeader("Access-Control-Allow-Origin", "*");
        if (((HttpServletRequest) request).getMethod().equals("OPTIONS")) {
            res.addHeader("Access-Control-Allow-Credentials", "true");
            res.addHeader("Access-Control-Allow-Methods", "GET, POST");
            res.addHeader("Access-Control-Allow-Headers", "Content-Type,token");
            response.getWriter().println("ok");
            return;
        }
        chain.doFilter(request, response);
    }

}
package com.yk.intercept;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * .
 * <p/>
 *
 * @author <a href="mailto:wb-yk449985@alibaba-inc.com">yangkun</a>
 * @version 1.0.0
 * @since 2019-02-22
 */


public class PermissionInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o)
        throws Exception {

        String username = httpServletRequest.getParameter("username");
        String password = httpServletRequest.getParameter("password");

        if("a".equals(username) && "a".equals(password)){
            System.out.println("认证成功");
            return true;
        }
        System.out.println("认证失败");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o,
                           ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                                Object o, Exception e) throws Exception {
        System.out.println("afterCompletion");
    }
}

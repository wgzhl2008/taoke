package com.hongshu.controller.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by zhanglei on 14/12/22.
 */
@Controller
public class BaseController implements ServletContextAware{
    protected ServletContext application;
    @Autowired
    protected HttpSession session;
    @Autowired
    protected HttpServletRequest request;
    @Override
    public void setServletContext(ServletContext arg0) {
        this.application=arg0;
    }

}

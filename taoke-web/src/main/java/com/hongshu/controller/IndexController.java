package com.hongshu.controller;

import com.hongshu.controller.common.BaseController;
import com.hongshu.domain.SalaryDetail;
import com.hongshu.domain.User;
import com.hongshu.service.SalaryDetailService;
import com.hongshu.dubbo.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by zhanglei on 14/11/18.
 */
@Controller
public class IndexController extends BaseController{
    @Autowired
    private SalaryDetailService salaryDetailService;
    @Autowired
    private UserinfoService userinfoService;

    @RequestMapping(value = "index")
    public Object index(HttpServletRequest request,HttpServletResponse response,ModelMap map){
        request.setAttribute("hello","zhanglei");
        map.put("name","浙江");
        List<SalaryDetail> salarys = salaryDetailService.select();
        map.put("salarys",salarys);
        List<User> users = userinfoService.selectUsers();
        System.out.println(users.size());
        return "index";
    }

    @RequestMapping(value = "home")
    public Object home(){
        return "home";
    }

}

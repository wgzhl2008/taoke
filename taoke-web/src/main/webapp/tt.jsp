<%@ page import="com.hongshu.domain.SalaryDetail" %>
<%@ page import="com.hongshu.service.SalaryDetailService" %>
<%@ page import="com.hongshu.service.UserService" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="com.hongshu.dubbo.service.UserinfoService" %>
<%@ page import="com.hongshu.domain.User" %>
<%--
  Created by IntelliJ IDEA.
  User: zhanglei
  Date: 14/11/18
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%

    WebApplicationContext beanFactory = WebApplicationContextUtils.getRequiredWebApplicationContext(application);
    SalaryDetailService salaryDetailService = beanFactory.getBean(SalaryDetailService.class);
    out.println(salaryDetailService);
    List<SalaryDetail> salaryDetails= new ArrayList<SalaryDetail>();
    SalaryDetail salaryDetail = new SalaryDetail();
    salaryDetail.setEmployeeId(100);
    salaryDetail.setMoney(2312123);
    salaryDetail.setTimeId(88888);
    salaryDetailService.insert(salaryDetail);

    List<SalaryDetail> details = salaryDetailService.select();
    UserService userService=beanFactory.getBean(UserService.class);
    userService.insert(121232,"中华子女");
    out.println(details.size());
    UserinfoService userinfoService = beanFactory.getBean(UserinfoService.class);
    List<User> users = userinfoService.selectUsers();
    out.println(users.size());
%>
</body>
</html>

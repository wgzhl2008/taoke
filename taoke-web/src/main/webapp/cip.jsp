<%@ page import="java.util.Random" %>
<%--
  Created by IntelliJ IDEA.
  User: zhanglei
  Date: 14/12/12
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="http://cp.51cailaitest.com:8085/js/common.js"></script>

    <script>
        $(function(){
        });
    </script>
</head>
<body class="body">
<jsp:include page="top.jsp" flush="true" ></jsp:include>

<div class="section">
    <div class="main mg0">
        <!-- ** 步骤 ** -->
        <div class="reg_step">
            <div class="step_number">
                <ul class="clearfix">
                    <li class="step_li"><i class="num_icon num_0 now"></i></li>
                    <li class="step_li"><i class="num_icon num_1"></i></li>
                    <li class="step_li"><i class="num_icon num_2"></i></li>
                </ul>
            </div>
            <div class="step_line"><i class="line_icon pst_0"></i></div>
            <p class="step_cont"><span class="step_txt now">注册账号</span><span class="step_txt">手机验证</span><span class="step_txt">注册成功</span></p>
        </div>
        <div class="reg_main_list">
            <div class="reg_main_ul hg_0">
                <!-- ** 第一步***主要内容 ** -->
                <div class="reg_main_box">
                    <!-- ** 登录 ** -->
                    <div class="reg_login">
                        <i class="reg_lg_icon"></i><span class="reg_lg_txt">快速注册51财来网账号</span><i class="reg_lg_line"></i><span class="reg_lg_txt">已有51财来账号？</span><a href="login.html" class="reg_lg_a">请登录</a>
                    </div>
                    <!-- ** 注册 ** -->
                    <div class="reg_content">
                        <!-- ** 输入框--手机号码 ** -->
                        <div class="reg_ip_box">
                            <ul class="clearfix">
                                <li class="reg_ip_li"><span class="ip_txt">手机号码</span></li>
                                <li class="reg_ip_li">
                                    <div class="input_box">
                                        <input type="text" class="ip_text" id="reg_tel">
                                        <input type="hidden" id="reg_tel_hiddle">
                                        <i class="ip_plhr">请输入您的手机号</i>
                                    </div>
                                </li>
                                <li class="reg_ip_li"><i class="ip_prompt" id="tel_err"></i></li>
                                <li class="reg_ip_li"><span class="ip_prompt_txt"></span></li>
                            </ul>
                        </div>
                        <!-- ** 输入框--设置密码 ** -->
                        <div class="reg_ip_box">
                            <ul class="clearfix">
                                <li class="reg_ip_li"><span class="ip_txt">设置密码</span></li>
                                <li class="reg_ip_li">
                                    <div class="input_box">
                                        <input type="password" class="ip_text" id="reg_pwd">
                                        <i class="ip_plhr">请输入密码</i>
                                    </div>
                                </li>
                                <li class="reg_ip_li"><i class="ip_prompt error dsp_ibk" id="pwd_err"></i></li>
                                <li class="reg_ip_li"><span class="ip_prompt_txt dsp_ibk">6-16位字符，必须包含数字和字母，不能包含空格</span></li>
                            </ul>
                        </div>
                        <!-- ** 输入框--强中弱 ** -->
                        <div class="reg_ip_box pd_tp0">
                            <ul class="clearfix">
                                <li class="reg_ip_li"><span class="ip_txt"></span></li>
                                <li class="reg_ip_li" id="ip_level"><span class="ip_level">弱</span><span class="ip_level">中</span><span class="ip_level">强</span></li>
                            </ul>
                        </div>
                        <!-- ** 输入框--确认密码 ** -->
                        <div class="reg_ip_box">
                            <ul class="clearfix">
                                <li class="reg_ip_li"><span class="ip_txt">确认密码</span></li>
                                <li class="reg_ip_li">
                                    <div class="input_box">
                                        <input type="password" class="ip_text" id="reg_pwd_n">
                                        <i class="ip_plhr">请再次输入您的密码</i>
                                    </div>
                                </li>
                                <li class="reg_ip_li"><i class="ip_prompt" id="pwd_err_n"></i></li>
                                <li class="reg_ip_li"><span class="ip_prompt_txt"></span></li>
                            </ul>
                        </div>
                        <!-- ** 输入框--服务协议 ** -->
                        <div class="reg_ip_box pd_tp0">
                            <ul class="clearfix">
                                <li class="reg_ip_li"><span class="ip_txt"></span></li>
                                <li class="reg_ip_li"><i class="ip_ck" id="ip_ck"></i><i class="ip_ck_ok" id="ip_ck_ok"></i></li>
                                <li class="reg_ip_li"><p class="ip_agree">我已阅读并且同意<a href="http://www.51cailai.com/contract/" target="_blank">《51财来服务协议》</a></p></li>
                            </ul>
                        </div>
                        <!-- ** 按钮--下一步 ** -->
                        <div class="reg_button"><a href="javascript:void(0)" class="reg_submit" id="reg_submit">下一步</a></div>
                    </div>
                </div>
                <!-- ** 第二步***主要内容 ** -->
                <div class="reg_main_box pst_0">
                    <div class="reg_iden">
                        <!-- ** 验证码完成注册 ** -->
                        <p class="iden_tit"><i class="tit_icon"></i><span class="tit_txt">已经向<span id="send_tel_number"></span>发送短信验证码，请输入验证码完成注册！</span></p>
                        <!-- ** 输入框--手机验证码 ** -->
                        <div class="reg_content iden">
                            <div class="reg_ip_box iden">
                                <ul class="clearfix">
                                    <li class="reg_ip_li"><span class="ip_txt iden">手机验证码</span></li>
                                    <li class="reg_ip_li">
                                        <div class="input_box iden">
                                            <input type="text" class="ip_text" id="reg_tel_count">
                                            <i class="ip_plhr iden">请输入验证码</i>
                                        </div>
                                    </li>
                                    <li class="reg_ip_li"><a href="javascript:void(0)" class="post_iden" id="yz_time">发送验证码</a><a href="javascript:void(0)" class="post_iden count" id="yz_null"></a></li>
                                </ul>
                            </div>
                            <p class="count_prompt" id="iden_prompt"><i class="prompt_i error"></i><span class="prompt_txt">验证码错误！</span></p>
                        </div>
                        <!-- ** 底部--按钮 ** -->
                        <div class="iden_button">
                            <a href="javascript:void(0)" class="submit_a" id="iden_submit">下一步</a>
                            <div class="iden_article">
                                <p class="iden_p">1，如一分钟内未收到短信验证码，请重新获取</p>
                                <p class="iden_p">2，如遇到任何问题，请联系客服：<span class="clr_fe">4000-696-051</span></p>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- ** 第三步***主要内容 ** -->
                <div class="reg_main_box pst_1">
                    <div class="reg_suc">
                        <!-- ** 注册成功 ** -->
                        <p class="suc_tit"><i class="suc_i"></i><span class="suc_txt">恭喜您，注册成功！</span></p>
                        <!-- ** 您的手机号 ** -->
                        <div class="suc_top">
                            <p class="suc_top_txt">您的手机号：<span class="clr_fe" id="reg_tel_info">18565612328</span></p>
                            <p class="suc_top_txt">您<b class="txt_b"></b>的<b class="txt_b"></b>昵<b class="txt_b txt_b1"></b>称：<span class="clr_fe" id="reg_nick_info">51cailai2328</span></p>
                            <i class="suc_lt bg_0"></i>
                            <i class="suc_lt bg_1"></i>
                            <i class="suc_lt bg_2"></i>
                            <i class="suc_lt bg_3"></i>
                        </div>
                        <!-- ** 15秒跳转 ** -->
                        <div class="suc_back">为了账户安全，<span class="clr_fe ft20" id="time_down">15</span> 秒后将跳转至个人中心完善资料或<a href="${urlResource['userCenterUrl']}" class="clr_fe">立即跳转</a></div>
                        <input type="hidden" value="${urlResource['userCenterUrl']}" id="user_center_url">
                        <!-- ** 推荐关注用户 ** -->
                        <div class="suc_focus">
                            <span class="fs_tit">推荐关注用户</span>
                            <div class="fs_cont">
                                <ul class="clearfix" id="fs_cont">
                                </ul>
                                <div style="display: none;" id="reloation_template">
                                    <li class="fs_li">
                                        <img src="{headImg}" class="fs_li_pic">
                                        <div class="fs_txt">
                                            <h4 class="fs_txt_h4 sp_clr"><span class="fs_h4_name">{descript}</span><span class="fs_level">{totalPrestige}</span></h4>
                                            <p class="fs_fans">粉丝：{fansCount}</p>
                                            <p class="fs_best">擅长：<span class="sp_clr">{broker}</span></p>
                                        </div>
                                        <i class="fs_check ok"></i>
                                    </li>
                                </div>
                                <div class="fs_select">
                                    <div class="fs_st_box" id="ck_all"><i class="fs_st_i ok"></i><span class="fs_st_txt">全选</span></div>
                                </div>
                            </div>
                        </div>
                        <!-- ** 开始配资 ** -->
                        <div class="suc_begin">
                            <p class="begin_tit"><i class="begin_line"></i><span class="beg_pic"></span></p>
                            <div class="begin_pic">
                                <a href="#" class="beg_a bg_month"></a>
                                <a href="#" class="beg_a bg_pzb"></a>
                                <a href="#" class="beg_a bg_t"></a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</div>
</div>
<jsp:include page="footer.jsp" flush="true" ></jsp:include>
</body>
</html>

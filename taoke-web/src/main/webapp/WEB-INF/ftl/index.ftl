
<html>
<head>
    <title>淘客网</title>
    <#--<link href="/css/reset.css" type="text/css" rel="stylesheet">
    <link href="/css/common.css" type="text/css" rel="stylesheet">
    <link href="/css/home.css" type="text/css" rel="stylesheet">
    <link href="/css/header_footer.css" type="text/css" rel="stylesheet">
    <link href="/css/index.css" type="text/css" rel="stylesheet">-->
    <script src="/js/jquery-1.7.1.min.js" type="text/javascript"></script>
    <#include "common/top.ftl"/>
</head>
<body>
<div id="toptb" class="cl">
    <div class="wp">
        <div class="z">
            <a href="#">收藏本站</a>
            <a href="#">Android 开发</a>
            <a href="#">移动开发SDK</a>
            <a href="#">Android 中文文档</a>
            <a href="#" style="font-weight: bold;color: red;">IOS开发</a>
        </div>
    </div>
</div>
<div id="ma_container">
    <style type="text/css" rel="stylesheet">
        #scbar{
            border:0;background:#fff;
            height:auto;
            margin: 19px 0 0;
        }
        .ma_search{margin:0px;}
    </style>
    <div id="header">
        <div class="header-top">
            <div class="header-top-content">
                <div id="header_logo" class="area header-logo">
                    <a href="#" target="_blank">
                        <img src="http://apkbus.com/template/hl_iuni/images/logo.png">
                    </a>
                </div>

                <div class="header-userinfo">
                    <span class="header-login">
                        <span class="i-login"></span>
                        <a id="showlogin">登录</a>
                    </span>
                    <span class="header-register">
                        <span class="i-register"></span>
                        <a>注册</a>
                    </span>
                </div>
            </div>
        </div>

        <div class="header-menus">
            <div class="header-menus-nav">
                <ul class="header-menus-nav-parent">
                    <li>


                        <a href="javascript:void(0);" onclick="$('showlogin').onclick();" class="header-menus-home">我的家</a>

                        <span class="header-menus-split"></span> </li>
                    <li><a href="http://www.apkbus.com/portal.php" target="_blank" title="安卓开发者门户">首页</a></li>
                    <li> <a href="http://www.apkbus.com/portal.php?mod=topic&amp;topicid=3" target="_blank" title="安卓开发教程_Android开发教程">教程</a>
                        <ul style="top: 60px; left: 157px; display: none;" class="header-menus-nav-sub">
                            <li><a href="http://www.apkbus.com/Android-246-1.html" target="_blank">老罗Android开发视频教程</a></li>
                            <li><a href="http://www.apkbus.com/Android-326-1.html" target="_blank">黑马Android视频教程</a></li>
                            <li><a href="http://www.apkbus.com/Android-335-1.html" target="_blank">unity视频开发教程</a></li>
                            <li><a href="http://www.apkbus.com/Android-248-1.html" target="_blank">mars安卓开发视频教程</a></li>
                        </ul>
                    </li>
                    <li><a href="http://www.apkbus.com/Android-95-1.html" target="_blank" title="Android开发问答">问答</a>
                        <!--   <ul class="header-menus-nav-sub">
                                              <li><a href="" target="_blank">源码大赛</a></li>
                                              <li><a href="" target="_blank">头脑风暴</a></li>
                                              <li><a href="" target="_blank">安卓实验室</a></li>
                                              <li><a href="" target="_blank">大咖专区</a></li>
                                          </ul>-->
                    </li>
                    <li> <a href="javascript: void(0);" target="_blank">资源</a>
                        <ul style="top: 60px; left: 307px; display: none;" class="header-menus-nav-sub">
                            <li><a href="http://www.apkbus.com/Android-44-1.html" target="_blank">Android 代码下载</a></li>
                            <li><a href="http://www.apkbus.com/Android-42-1.html" target="_blank">Android开发资料库</a></li>
                            <li><a href="http://www.apkbus.com/Android-46-1.html" target="_blank">Android 游戏开发</a></li>
                            <li><a href="http://www.apkbus.com/Android-244-1.html" target="_blank">android视频下载区</a></li>
                            <li><a href="http://www.apkbus.com/Android-97-1.html" target="_blank">UI设计学院</a></li>
                            <li><a href="http://www.apkbus.com/Android-43-1.html" target="_blank">Android实例教程</a></li>
                        </ul>
                    </li>
                    <!--<li><a href="http://www.apkbus.com/portal.php?mod=topic&amp;topicid=4" target="_blank" title="安卓开发技术专题">专栏</a></li>
            -->
                    <li><a href="http://salon.apkbus.com/" target="_blank">沙龙</a>
                    </li><li><a href="http://www.apkbus.com/Android-61-1.html" target="_blank">商城</a></li>
                    <li><a href="http://www.apkbus.com/forum.php" target="_blank">论坛</a></li>
                    <li><a href="plugin.php?id=dsu_paulsign:sign" target="_blank">签到</a></li>

                </ul>
                <script>
                    // 下拉菜单效果
                    jQuery( ".header-menus-nav-parent li" ).each( function() {
                        var self = jQuery( this );
                        self.hover( function() {
                            var _self = jQuery( this );
                            _self.find( ".header-menus-nav-sub" ).css( {
                                top: _self.position().top + _self.height() + "px",
                                left: _self.position().left + "px"
                            } ).slideDown( 100 );
                        }, function() {
                            jQuery( this ).find( ".header-menus-nav-sub" ).slideUp( 100 );
                        } );
                    } );
                </script>

                <!--搜索栏-->
                <div id="header_search" class="header-search">
                    <form target="_blank" method="post" action="search.php?searchsubmit=yes">
                        <input name="mod" id="scbar_mod" value="forum" type="hidden">
                        <input name="srchtype" value="title" type="hidden">
          <span class="header-search-mian">
          <input name="srchtxt" class="header-search-keyword" id="scbar_txt" placeholder="搜索您想要的内容" type="text">
          <button type="submit" class="header-search-botton">搜索</button>
          </span>
                    </form>
                    <script>
                        jQuery( function() {
                            jQuery( "#header_search form" ).submit( function() {
                                var keyword = jQuery( "#header_search form .header-search-keyword" );
                                if( ! keyword.val() ) {
                                    keyword.focus();
                                    return false;
                                }
                            } );
                        } );
                    </script>
                </div>
            </div>
        </div>


        <script>
            // 导航栏滚动固定
            jQuery( function() {
                var header = jQuery( "#header" );
                var menusTop = jQuery( ".header-menus" ).offset().top;
                jQuery( window ).scroll( function() {
                    var scrollTop = jQuery( this ).scrollTop();
                    if( menusTop <= scrollTop ) {
                        if( ! header.hasClass( "header-menus-fixed" ) ) {
                            header.addClass( "header-menus-fixed" );
                        }
                    } else {
                        header.removeClass( "header-menus-fixed" );
                    }
                } );
            } );
        </script>
    </div>


    <div>
        fdasdfakjsadjflajds
    </div>
    <div>
        fdasdfakjsadjflajds
    </div><div>
    fdasdfakjsadjflajds
</div><div>
    fdasdfakjsadjflajds
</div><div>
    fdasdfakjsadjflajds
</div><div>
    fdasdfakjsadjflajds
</div><div>
    fdasdfakjsadjflajds
</div><div>
    fdasdfakjsadjflajds
</div><div>
    fdasdfakjsadjflajds
</div><div>
    fdasdfakjsadjflajds
</div><div>
    fdasdfakjsadjflajds
</div><div>
    fdasdfakjsadjflajds
</div><div>
    fdasdfakjsadjflajds
</div><div>
    fdasdfakjsadjflajds
</div><div>
    fdasdfakjsadjflajds
</div><div>
    fdasdfakjsadjflajds
</div><div>
    fdasdfakjsadjflajds
</div><div>
    fdasdfakjsadjflajds
</div><div>
    fdasdfakjsadjflajds
</div><div>
    fdasdfakjsadjflajds
</div><div>
    fdasdfakjsadjflajds
</div><div>
    fdasdfakjsadjflajds
</div><div>
    fdasdfakjsadjflajds
</div><div>
    fdasdfakjsadjflajds
</div><div>
    fdasdfakjsadjflajds
</div><div>
    fdasdfakjsadjflajds
</div><div>
    fdasdfakjsadjflajds
</div><div>
    fdasdfakjsadjflajds
</div><div>
    fdasdfakjsadjflajds
</div><div>
    fdasdfakjsadjflajds
</div><div>
        fdasdfakjsadjflajds
    </div><div>
        fdasdfakjsadjflajds
    </div><div>
        fdasdfakjsadjflajds
    </div><div>
        fdasdfakjsadjflajds
    </div><div>
        fdasdfakjsadjflajds
    </div><div>
        fdasdfakjsadjflajds
    </div><div>
        fdasdfakjsadjflajds
    </div><div>
        fdasdfakjsadjflajds
    </div><div>
        fdasdfakjsadjflajds
    </div><div>
        fdasdfakjsadjflajds
    </div><div>
        fdasdfakjsadjflajds
    </div><div>
        fdasdfakjsadjflajds
    </div><div>
        fdasdfakjsadjflajds
    </div><div>
        fdasdfakjsadjflajds
    </div><div>
        fdasdfakjsadjflajds
    </div><div>
        fdasdfakjsadjflajds
    </div><div>
        fdasdfakjsadjflajds
    </div><div>
        fdasdfakjsadjflajds
    </div>

</div>

</body>
</html>

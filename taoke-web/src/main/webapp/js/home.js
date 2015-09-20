
$(function(){
    // 下拉菜单效果
   $('.header-menus-nav-parent li').each(function(){
       var self = $(this);
       self.hover(function(){
           var _self=$(this);
           _self.find('.header-menus-nav-sub').css({
               top:_self.position().top+_self.height()+"px",
               left:_self.position().left+"px"
           }).slideDown(100);
       },function(){
           $(this).find('.header-menus-nav-sub').slideUp(100);
       });
   });

//    导航栏滚动固定
    var header = $('.header');
    var menusTop = $('.header-menus').offset().top;
    $(window).scroll(function(){
        var scrollTop = $(this).scrollTop();
        if(menusTop<=scrollTop){
            if(!header.hasClass('header-menus-fixed')){
                header.addClass('header-menus-fixed');
            }
        }else{
            header.removeClass('header-menus-fixed');
        }
    });
});


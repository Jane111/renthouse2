<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix ="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="robots" content="all,follow">

    <title>房源管理</title>
    <!-- 网页标题前面的图标 -->
    <!-- <link rel="shortcut icon" href="img/favicon.ico"> -->
    
    <!-- global stylesheets -->
    <link href="https://fonts.googleapis.com/css?family=Roboto+Condensed" rel="stylesheet">
    <link rel="stylesheet" href="cssdyr/bootstrap.min.css">
    <link rel="stylesheet" href="font-awesome-4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="cssdyr/font-icon-style.css">
    <link rel="stylesheet" href="cssdyr/style.default.css" id="theme-stylesheet">

    <!-- Core stylesheets -->
    <!-- <link rel="stylesheet" href="cssdyr/style.css">
    <link rel="stylesheet" href="css/houselist.css"> -->
</head>
<body>
<!--====================================================
                         MAIN NAVBAR
======================================================-->      
<!-- 网页导航 -->  
    

<!--====================================================
                        PAGE CONTENT
======================================================-->
	<div class="page-content d-flex align-items-stretch">

        <!--***** SIDE NAVBAR *****-->
        <nav class="side-navbar">
            <div class="sidebar-header d-flex align-items-center">
                <div class="title">
                    <h1 class="h4"><s:property value="userName"></s:property></h1>
                </div>
            </div>
            <hr>
            <!-- Sidebar Navidation Menus-->
            <ul class="list-unstyled">
                <li>
                	<%-- <s:url action></s:url> --%>
                	<a href="me.jsp"> <i class="fa fa-user-o"></i>个人信息</a>
                </li>
                <li class="active"><a href="houses.jsp"> <i class="fa fa-building-o"></i>房源管理</a></li>
                <li><a href="collect.jsp"> <i class="fa fa-star-o"></i>我的收藏 </a></li>
                <li><a href="message.jsp"> <i class="fa fa-bell-o"></i>我的消息</a></li>
            </ul>
        </nav>

        <div class="content-inner card-cont">
            <!--***** CONTENT *****-->
            <div class="row mt-2" id="card-1">
                <div class="col-sm-6 col-md-4 col-lg-3 ">
                    <div class="card card-inverse card-info">
                        <img class="card-img-top" src="img/card/c-1.jpg">
                        <input id="house_id" type=hidden value="1" /> <!-- hidden的标签存放房源id -->
                        <div class="card-block"> 
                            <h5 class="card-title">
                            	<a
								 class="img"
								 data-sign="true"
								 href="https://wh.zu.anjuke.com/fangyuan/1251552168"
								 title="首月减1000，可以做饭金色未来大智路760精装"
								 alt="首月减1000，可以做饭金色未来大智路760精装"
								 target="_blank"
								 hidefocus="true"
								><!-- target="_blank"表示打开新的网页；alt表示图片没有显示出来的时候显示的文本；hidefocus表示聚焦时没有虚线标识-->
                            	首月减1000，可以做饭金色未来大智路760精装</a>
                            </h5>
                             
                        </div>
                        <div class="card-footer">
                            <small>发布时间：2018年12月19日</small>
                            <button class="btn btn-info float-right btn-sm">查看详情</button>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6 col-md-4 col-lg-3 ">
                    <div class="card card-inverse card-info">
                        <img class="card-img-top" src="img/card/c-2.jpg">
                        <input id="house_id" type=hidden value="1" /> <!-- hidden的标签存放房源id -->
                        <div class="card-block"> 
                            <h5 class="card-title">
                            	<a
								 class="img"
								 data-sign="true"
								 href="https://wh.zu.anjuke.com/fangyuan/1251552168"
								 title="首月减1000，可以做饭金色未来大智路760精装"
								 alt="首月减1000，可以做饭金色未来大智路760精装"
								 target="_blank"
								 hidefocus="true"
								><!-- target="_blank"表示打开新的网页；alt表示图片没有显示出来的时候显示的文本；hidefocus表示聚焦时没有虚线标识-->
                            	首月减1000，可以做饭金色未来大智路760精装</a>
                            </h5>
                             
                        </div>
                        <div class="card-footer">
                            <small>发布时间：2018年12月19日</small>
                            <button class="btn btn-info float-right btn-sm">查看详情</button>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6 col-md-4 col-lg-3 ">
                    <div class="card card-inverse card-info">
                        <img class="card-img-top" src="img/card/c-3.jpg">
                        <input id="house_id" type=hidden value="1" /> <!-- hidden的标签存放房源id -->
                        <div class="card-block"> 
                            <h5 class="card-title">
                            	<a
								 class="img"
								 data-sign="true"
								 href="https://wh.zu.anjuke.com/fangyuan/1251552168"
								 title="首月减1000，可以做饭金色未来大智路760精装"
								 alt="首月减1000，可以做饭金色未来大智路760精装"
								 target="_blank"
								 hidefocus="true"
								><!-- target="_blank"表示打开新的网页；alt表示图片没有显示出来的时候显示的文本；hidefocus表示聚焦时没有虚线标识-->
                            	首月减1000，可以做饭金色未来大智路760精装</a>
                            </h5>
                             
                        </div>
                        <div class="card-footer">
                            <small>发布时间：2018年12月19日</small>
                            <button class="btn btn-info float-right btn-sm">查看详情</button>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6 col-md-4 col-lg-3 ">
                    <div class="card card-inverse card-info">
                        <img class="card-img-top" src="img/card/c-4.jpg">
                        <input id="house_id" type=hidden value="1" /> <!-- hidden的标签存放房源id -->
                        <div class="card-block"> 
                            <h5 class="card-title">
                            	<a
								 class="img"
								 data-sign="true"
								 href="https://wh.zu.anjuke.com/fangyuan/1251552168"
								 title="首月减1000，可以做饭金色未来大智路760精装"
								 alt="首月减1000，可以做饭金色未来大智路760精装"
								 target="_blank"
								 hidefocus="true"
								><!-- target="_blank"表示打开新的网页；alt表示图片没有显示出来的时候显示的文本；hidefocus表示聚焦时没有虚线标识-->
                            	首月减1000，可以做饭金色未来大智路760精装</a>
                            </h5>
                             
                        </div>
                        <div class="card-footer">
                            <small>发布时间：2018年12月19日</small>
                            <button class="btn btn-info float-right btn-sm">查看详情</button>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6 col-md-4 col-lg-3 ">
                    <div class="card card-inverse card-info">
                        <img class="card-img-top" src="img/card/c-1.jpg">
                        <input id="house_id" type=hidden value="1" /> <!-- hidden的标签存放房源id -->
                        <div class="card-block"> 
                            <h5 class="card-title">
                            	<a
								 class="img"
								 data-sign="true"
								 href="https://wh.zu.anjuke.com/fangyuan/1251552168"
								 title="首月减1000，可以做饭金色未来大智路760精装"
								 alt="首月减1000，可以做饭金色未来大智路760精装"
								 target="_blank"
								 hidefocus="true"
								><!-- target="_blank"表示打开新的网页；alt表示图片没有显示出来的时候显示的文本；hidefocus表示聚焦时没有虚线标识-->
                            	首月减1000，可以做饭金色未来大智路760精装</a>
                            </h5>
                             
                        </div>
                        <div class="card-footer">
                            <small>发布时间：2018年12月19日</small>
                            <button class="btn btn-info float-right btn-sm">查看详情</button>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6 col-md-4 col-lg-3 ">
                    <div class="card card-inverse card-info">
                        <img class="card-img-top" src="img/card/c-2.jpg">
                        <input id="house_id" type=hidden value="1" /> <!-- hidden的标签存放房源id -->
                        <div class="card-block"> 
                            <h5 class="card-title">
                            	<a
								 class="img"
								 data-sign="true"
								 href="https://wh.zu.anjuke.com/fangyuan/1251552168"
								 title="首月减1000，可以做饭金色未来大智路760精装"
								 alt="首月减1000，可以做饭金色未来大智路760精装"
								 target="_blank"
								 hidefocus="true"
								><!-- target="_blank"表示打开新的网页；alt表示图片没有显示出来的时候显示的文本；hidefocus表示聚焦时没有虚线标识-->
                            	首月减1000，可以做饭金色未来大智路760精装</a>
                            </h5>
                             
                        </div>
                        <div class="card-footer">
                            <small>发布时间：2018年12月19日</small>
                            <button class="btn btn-info float-right btn-sm">查看详情</button>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6 col-md-4 col-lg-3 ">
                    <div class="card card-inverse card-info">
                        <img class="card-img-top" src="img/card/c-3.jpg">
                        <input id="house_id" type=hidden value="1" /> <!-- hidden的标签存放房源id -->
                        <div class="card-block"> 
                            <h5 class="card-title">
                            	<a
								 class="img"
								 data-sign="true"
								 href="https://wh.zu.anjuke.com/fangyuan/1251552168"
								 title="首月减1000，可以做饭金色未来大智路760精装"
								 alt="首月减1000，可以做饭金色未来大智路760精装"
								 target="_blank"
								 hidefocus="true"
								><!-- target="_blank"表示打开新的网页；alt表示图片没有显示出来的时候显示的文本；hidefocus表示聚焦时没有虚线标识-->
                            	首月减1000，可以做饭金色未来大智路760精装</a>
                            </h5>
                             
                        </div>
                        <div class="card-footer">
                            <small>发布时间：2018年12月19日</small>
                            <button class="btn btn-info float-right btn-sm">查看详情</button>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6 col-md-4 col-lg-3 ">
                    <div class="card card-inverse card-info">
                        <img class="card-img-top" src="img/card/c-4.jpg">
                        <input id="house_id" type=hidden value="1" /> <!-- hidden的标签存放房源id -->
                        <div class="card-block"> 
                            <h5 class="card-title">
                            	<a
								 class="img"
								 data-sign="true"
								 href="https://wh.zu.anjuke.com/fangyuan/1251552168"
								 title="首月减1000，可以做饭金色未来大智路760精装"
								 alt="首月减1000，可以做饭金色未来大智路760精装"
								 target="_blank"
								 hidefocus="true"
								><!-- target="_blank"表示打开新的网页；alt表示图片没有显示出来的时候显示的文本；hidefocus表示聚焦时没有虚线标识-->
                            	首月减1000，可以做饭金色未来大智路760精装</a>
                            </h5>
                             
                        </div>
                        <div class="card-footer">
                            <small>发布时间：2018年12月19日</small>
                            <button class="btn btn-info float-right btn-sm">查看详情</button>
                        </div>
                    </div>
                </div>
            
            </div><br class="mb-5">
        </div>
    </div> 

    <!--Global Javascript -->
    <script src="js/jquery.min.js"></script>
    <script src="js/popper/popper.min.js"></script>
    <script src="js/tether.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.cookie.js"></script>
    <script src="js/jquery.validate.min.js"></script> 
    <script src="js/chart.min.js"></script> 
    <script src="js/front.js"></script> 
</body>
</html>
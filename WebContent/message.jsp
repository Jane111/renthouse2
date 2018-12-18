<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="robots" content="all,follow">

    <title>我的消息</title>
    <!-- 网页标题前面的图标 -->
    <!-- <link rel="shortcut icon" href="img/favicon.ico"> -->
    
    <!-- global stylesheets -->
    <link href="https://fonts.googleapis.com/css?family=Roboto+Condensed" rel="stylesheet">
    <link rel="stylesheet" href="cssdyr/bootstrap.min.css">
    <link rel="stylesheet" href="font-awesome-4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="cssdyr/font-icon-style.css">
    <link rel="stylesheet" href="cssdyr/style.default.css" id="theme-stylesheet">

    <!-- Core stylesheets -->
    <link rel="stylesheet" href="cssdyr/style.css">
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
                    <h1 class="h4">user_name</h1>
                </div>
            </div>
            <hr>
            <!-- Sidebar Navidation Menus-->
            <ul class="list-unstyled">
                <li><a href="me.jsp"> <i class="fa fa-user-o"></i>个人信息</a></li>
                <li><a href="houses.jsp"> <i class="fa fa-building-o"></i>房源管理</a></li>
                <li><a href="collect.jsp"> <i class="fa fa-star-o"></i>我的收藏 </a></li>
                <li class="active"><a href="message.jsp"> <i class="fa fa-bell-o"></i>我的消息</a></li>
            </ul>
        </nav>

        <div class="content-inner">
        	<!--***** FORM LAYOUTS *****-->
        	<div class="row">
                
        	</div>
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
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

    <title>个人中心</title>
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
    <link rel="stylesheet" href="cssdyr/form.css">
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
                <li class="active"><a href="me.jsp"> <i class="fa fa-user-o"></i>个人信息</a></li>
                <li><a href="houses.jsp"> <i class="fa fa-building-o"></i>房源管理</a></li>
                <li><a href="collect.jsp"> <i class="fa fa-star-o"></i>我的收藏 </a></li>
                <li><a href="message.jsp"> <i class="fa fa-bell-o"></i>我的消息</a></li>
            </ul>
        </nav>

        <div class="content-inner chart-cont">
        	<!--***** FORM LAYOUTS *****-->
        	<div class="row">
                <div class="col-md-12">

                    <!--***** USER INFO *****-->
                    <div class="card form" id="form1">
                        <div class="card-header">
                            <h3><i class="fa fa-user-circle"></i>用户信息</h3>
                        </div>
                        <br>
                        <!-- simple是为了去掉Struts自带的表单样式 -->
                        <s:form name="userInfo" method="post" action="usercenter!updateUser" theme = "simple">
                        	<div class="row">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label for="name">手机号</label>
                                        <s:textfield class="form-control" name = "user_phone" placeholder="请输入手机号"></s:textfield>
                                    </div>
                                    <div class="form-group">
                                        <label for="name">您的称呼</label>
                                        <s:textfield class="form-control" name = "user_name" placeholder="请输入您的称呼,如：刘先生"></s:textfield>
                                    </div>
                                    <div class="form-group">
                                        <label for="cont-number">新密码</label>
                                        <s:password class="form-control" name = "user_pwd" placeholder="请输入新密码"></s:password>
                                    </div> 
                                    <s:hidden name="user_id" value="user_id"></s:hidden>
                                    <div class="form-group has-success">
                                        <label for="website">确认密码</label>
                                        <s:password class="form-control is-valid" name = "repeat_pwd" placeholder="请确认密码"></s:password>
                                        <div class="valid-feedback">
                                        	确认密码：再次输入密码
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <s:submit class="btn btn-info btn-blue mr-2" value="确定"/>  
                            <s:reset class="btn btn-info btn-white" value="取消"/>
                        </s:form>
                    </div>
            	</div> 

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
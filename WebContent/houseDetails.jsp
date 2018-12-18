<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>房源详情</title>
<!--mobile apps-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--mobile apps-->
<!--Custom Theme files -->
<link href="css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
<link href="css/style.css" type="text/css" rel="stylesheet" media="all">
<link rel="stylesheet" href="css/prettySticky.css" type="text/css">
<!-- //Custom Theme files -->
<!-- js -->
<script src="js/jquery-1.11.1.min.js"></script> 
<!-- //js -->
<!-- start-smoth-scrolling-->
<script type="text/javascript">
		jQuery(document).ready(function($) {
			$(".scroll").click(function(event){		
				event.preventDefault();
		
		$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
			});
		});
</script>
<!--//end-smoth-scrolling-->
</head>

<body>
	
	<div  id="home" class="banner about-banner"></div><!-- 顶头背景图片 -->
	
	<!--single-page-->
	<div class="single-page blog">
		<div class="container">			
			<div class="col-md-8 single-page-left">
				<div class="single-page-info">
					
					<div style="text-align:center;clear:both">
					<script src="/gg_bd_ad_720x90.js" type="text/javascript"></script>
					<script src="/follow.js" type="text/javascript"></script>
					</div>
     				<iframe frameborder="0" scrolling="no" src="index2.html" width="100%" height="400px"></iframe>
					
					<br/><br/><br/>
					<div style = "white-space:nowrap;">
						<ul>
							<li style = "color:#745EC5;font-size:18pt;">房屋信息</li>
							<li style = "color:gray;text-align:right;font-size:8pt;">房屋编号：</li>
							<li style = "color:gray;text-align:right;font-size:8pt;">发布时间：</li><hr>
						</ul>		
					</div>
					<font value = "price" style = "font-size:12pt;color:orange">980元/月</font><br/>
					<table width = "750px" height = "50px">	<!-- 房屋信息绑定 -->							
								<tr style = "font-size:9pt;color:gray;">
									<td>户型：<s:property value = "houseId"/></td>
									<td>面积：<s:property value = "houseDecoration"/></td>
									<td>朝向：<s:property value = "place"/></td>
								</tr>	
								<tr style = "font-size:9pt;color:gray;">
									<td>楼层：<s:property value = "number"/></td>
									<td>装修：<s:property value = "name"/></td>
									<td>小区：<s:property value = "place"/></td>
								</tr>	
								<tr style = "font-size:9pt;color:gray;">
									<td>出租类型：<s:property value = "number"/></td>
									<td>房间类型：<s:property value = "name"/></td>
									<td>房间类型：<s:property value = "place"/></td>	
								</tr>	
					</table>
					
					<div class="comment-icons">
						<div style = "color:#745EC5;font-size : 18pt;">房源概况</div><hr/>
						<s:property value = "houseComment"/>
					</div>               <!-- 房屋概况板块 -->
				</div>	
				<div style = "color:#745EC5;font-size : 18pt;">房屋问答</div><hr/>
				<div class="admin-text">   <!-- 灰色区域 ，用于评论问题展示回复板块-->
					<table>
						<s:iterator value = "question_list">
							<tr>
								<!-- <td><s:property value = "questionId" /></td> -->
								<td style = "font-size:8pt;color:white;background-color:orange;font-weight:bold;">提问</td>
								<td width = "10px"></td>
								<td>
									<s:url id = "urlskip" value = "testQ!getReplyDetails">
										<s:param name = "questionId" value = "questionId"></s:param>
										<s:param name = "questionContent" value = "questionContent"></s:param>
										<s:param name = "questionTime" value = "questionTime"></s:param>
									</s:url>
									<s:a style = "font-size:10pt;color:black;" href = "%{urlskip}"><s:property value = "questionContent" /></s:a></td>
								<td width = "100px"></td>
								<td>
									<s:url id = "urlskip" value = "testQ!getReplyDetails">
										<s:param name = "questionId" value = "questionId"></s:param>
										<s:param name = "questionContent" value = "questionContent"></s:param>
										<s:param name = "questionTime" value = "questionTime"></s:param>
									</s:url>
									<s:a style = "font-size:8pt;color:gray;" href = "%{urlskip}"><s:property value = "questionTime" /></s:a>
								</td>	
								<td width = "100px"></td>
								
								<td>
									<s:url id = "urlskip" value = "testQ!getCommentDetails">
										<s:param name  = "questionId" value = "questionId"></s:param>
										<s:param name = "questionContent" value = "questionContent"></s:param>
										<s:param name = "questionTime" value = "questionTime"></s:param>
									</s:url>
									<s:a style = "font-size:6pt;color:gray;" href = "%{urlskip}">我要回答></s:a>
								</td>					
							</tr>
							<!--<s:iterator value = "reply_list">
								<div style = "font-size:6pt;color:gray">
								<tr>
									<td width = "110px"></td>
									<td><s:property value = "replyId"/></td>
									<td>回复：<s:property value = "replyContent"/></td>
									<td width = "50px"></td>
									<td><s:property value = "replyTime"/></td>
								</tr>
								</div>
							</s:iterator>-->
						</s:iterator>
					</table>
					<div class="clearfix"> </div>
				</div>
				
				<div class="coment-form">
					<div style = "color:#745EC5;font-size : 18pt;">我要提问</div>
					<form name = "f1" method = "post" action = "testQ!addInQuestion">
						<textarea name = "questionContent" type="text" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Your Comment...';}" required="">Your Comment...</textarea>
						<input type="submit" value="提交" >
					</form>
				</div>		<!-- 写评论板块 -->				
			</div>	
			<div class="col-md-4 blog-right">
					<div style = "color:#745EC5;font-size : 18pt;">业主</div><br>
					<ul class="catgry" >
						<li><a href="#"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>姓名：</a></li><br>
						<li><a href="#"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>电话：</a></li>
					</ul>
					<!-- <div class="blog-tags">
						<h3>Recent Tags</h3>
						<ul>
							<li><a href="#">Family</a></li>
							<li><a href="#">Students</a></li>
							<li><a href="#">Office</a></li>
						</ul>
						<ul>
							<li><a href="#">Company</a></li>
							<li><a href="#">Costly House</a></li>
						</ul>
						<ul>
							<li><a href="#">House</a></li>
							<li><a href="#">Apartments</a></li>
							<li><a href="#">Duplex</a></li>
						</ul>
						<ul>
							<li><a href="#">Small House</a></li>
							<li><a href="#">Hostel</a></li>
						</ul>
					</div> -->
			</div>
				<div class="clearfix"> </div>
		</div>	
	</div>      <!-- 留作房主信息板块 -->
	<!--//single-page-->
	
	<!--footer--><!-- 暂留网站联系，网站详情，固定内容 -->
	<div class="footer">
		<div class="container">
			<div class="col-md-4 footer-grids">
				<h3>Review</h3>
				<p>Sed ut turpis elit ullamcorper in auctor non, accumsan vel lacus nulla auctor cursus nunc. Maecenas ultricies dolor in urna tempus, id egestas erat finibus  interdum lectus eget scelerisque.</p>
			</div>
			<div class="col-md-3 footer-grids">
				<h3>Contact Me</h3>
				<p>123 NewYork City USA.<br>
					<span>Office: 908-0000</span>
				</p>
				<div class="footer-bottom">
					<a href="#"><span>Facebook</span></a>
					<a href="#"><span>Pinterest</span></a>
					<a href="#"><span>LinkedIn </span></a>
					<a href="#"><span>Behance</span></a>
				</div>
			</div>
			<div class="col-md-5 footer-grids">
				<h3>Flickr</h3>
				<a  class="footer-img" href="single.html"> <img src="images/f1.jpg" alt=""/></a>
				<a class="footer-img" href="single.html"> <img src="images/f2.jpg" alt=""/></a>
				<a class="footer-img" href="single.html"> <img src="images/f3.jpg" alt=""/></a>
			</div>
			<div class="clearfix"> </div>
			<div class="footer-copy">
				<p>Copyright &copy; 2016.Company name All rights reserved.<a target="_blank" href="http://sc.chinaz.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
			</div>
		</div>
	</div>
	<!--//footer-->
	<!-- script-for prettySticky -->
	<script src="js/prettySticky.js"></script>
	<!--//script-for prettySticky -->
	<!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="js/bootstrap.js"></script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>我要回复</title>
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

	<!--banner-->
	<div  id="home" class="banner about-banner">
		<div class="banner-info">
			<!--navigation-->
			<div class="top-nav"></div>
	<!--single-page-->
	<div class="single-page blog">
		<div class="container">			
			<div class="col-md-8 single-page-left">
			<div style = "font-size:16pt; color:white;">问题详情</div>
			<br>
				<div class="admin-text">
					<div>
						<table>
							<tr>
								<td ><s:property value  = "questionId"/></td>
								<td width = "100px"></td>
								<td><s:property value  = "questionTime"/></td>
							</tr>
							<tr><td><s:property value = "questionContent"/></td></tr>
						</table>
					</div>
					<div class="clearfix"> </div>
				</div>
		
				<div class="coment-form">
					<div style = "font-size:16pt; color:white;">请写出你的回复：</div>
					<br>
					<s:form name = "f1" method = "post" action = "testQ!addInReply">
					    <s:hidden name = "questionId"></s:hidden>
						<textarea name = "replyContent" type="text" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Your Comment...';}" required="">Your Reply...</textarea>
						<input type="submit" value="提交" >
					</s:form>
				</div>		
			</div>	

	</div>
	<!--//single-page-->
	<!--footer-->
	<br>
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
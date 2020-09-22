<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="imgs/favicon.ico">

    <title>Page1</title>

    <!-- Bootstrap core CSS -->
    <link href="bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="Extra/dashboard.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="assets/js/src/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
    <!--导航条-->
		<%@ include file="Top.jsp"%>
    <div class="container-fluid">
      <div class="row">
        <!--左边-->
		<%@ include file="Left.jsp"%>
		<!-- 中间 -->
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">个人信息</h1>
<c:forEach items="${getUser}" var="item">
          <div class="row placeholders">
            <div class="col-xs-6 col-sm-3 placeholder">
              <img src="imgs/user.jpg" width="200" height="200" class="img-responsive" alt="Generic placeholder thumbnail">
              <h4>姓名</h4>
              <span class="text-muted">${item.userName}</span>
            </div>
            <div class="col-xs-6 col-sm-3 placeholder">
              <img src="imgs/email.jpg" width="200" height="200" class="img-responsive" alt="Generic placeholder thumbnail">
              <h4>邮箱地址</h4>
              <span class="text-muted">${item.email}</span>
            </div>
            <div class="col-xs-6 col-sm-3 placeholder">
              <img src="imgs/phone.jpg" width="200" height="200" class="img-responsive" alt="Generic placeholder thumbnail">
              <h4>手机号</h4>
              <span class="text-muted">${item.phoneNum}</span>
            </div>
            <div class="col-xs-6 col-sm-3 placeholder">
              <img src="imgs/educa.jpg" width="200" height="200" class="img-responsive" alt="Generic placeholder thumbnail">
              <h4>受教育程度</h4>
              <span class="text-muted">${item.educa}</span>
            </div>
 </c:forEach>          
          </div>

          
          
				
              
           
          
        </div>
      </div>
    </div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="../../dist/js/bootstrap.min.js"></script>
    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->
    <script src="../../assets/js/vendor/holder.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
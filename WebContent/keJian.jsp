<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<link href="assets/css/ie10-viewport-bug-workaround.css"
	rel="stylesheet">

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
<script>
	function myFunction1() {
		 alert("正在学习中。。。");
		 //document.location.href="index.jsp";
	}
</script>
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
				<h1 class="page-header">Dashboard</h1>

				<div class="row placeholders">
					<div class="col-xs-6 col-sm-3 placeholder">
						<img
							src="imgs/car1.jpg"
							width="200" height="200" class="img-responsive"
							alt="Generic placeholder thumbnail">
						<h4>Label</h4>
						<span class="text-muted">Something else</span>
					</div>
					<div class="col-xs-6 col-sm-3 placeholder">
						<img
							src="imgs/car2.jpg"
							width="200" height="200" class="img-responsive"
							alt="Generic placeholder thumbnail">
						<h4>Label</h4>
						<span class="text-muted">Something else</span>
					</div>
					<div class="col-xs-6 col-sm-3 placeholder">
						<img
							src="imgs/car3.jpg"
							width="200" height="200" class="img-responsive"
							alt="Generic placeholder thumbnail">
						<h4>Label</h4>
						<span class="text-muted">Something else</span>
					</div>
					<div class="col-xs-6 col-sm-3 placeholder">
						<img
							src="imgs/car4.jpg"
							width="200" height="200" class="img-responsive"
							alt="Generic placeholder thumbnail">
						<h4>Label</h4>
						<span class="text-muted">Something else</span>
					</div>
				</div>

				<h2 class="sub-header">课程选择</h2>
				
                    <form class="form-horizontal" action="AddKaoQin" method="post">
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">课程名称</label>
							<div class="col-sm-3">
								<select class="form-control" name="courseName">
									<option value="L101机动车基本理论与构造">L101机动车基本理论与构造</option>
									<option value="L102汽车基本装置">L102汽车基本装置</option>
									<option value="L103汽车的性能">L103汽车的性能</option>
									<option value="L104新能源汽车的发展">	L104新能源汽车的发展</option>
									<option value="L105车辆的维护保养与安全检视">L105车辆的维护保养与安全检视</option>
									<option value="L201机动车登记规定">L201机动车登记规定</option>
									<option value="L202机动车驾驶证申领与使用规定">L202机动车驾驶证申领与使用规定</option>
									<option value="L203违法记分">L203违法记分</option>
									<option value="L204道路交通信号灯与标志的识别">L204道路交通信号灯与标志的识别</option>
									<option value="L205道路交通标线与交通警察手势的识别">L205道路交通标线与交通警察手势的识别</option>
									<option value="L206道路通行规定">L206道路通行规定</option>
									<option value="L207安全驾驶行为规范与法律责任">L207安全驾驶行为规范与法律责任</option>
									<option value="L208交通事故处理方法">L208交通事故处理方法</option>
									
									

								</select>
							</div>
							
							<div class="form-group">
							
						<label for="inputEmail3" class="col-sm-2 control-label">你要学习多久呢（分钟）：</label>
						<div class="col-sm-2">
							<input type="text" class="form-control" name="studyTime"  placeholder="学习时长">
							
						</div>
					</div>
						
					
						<div class="form-group">
							<div class="col-sm-offset-5 col-sm-10">
								<button type="submit" class="btn btn-default" onClick="myFunction1()">开始学习</button>
							</div>
						</div>

					</form>

					
					


				</div>
			</div>
		</div>
	</div>

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script>
		window.jQuery
				|| document
						.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')
	</script>
	<script src="../../dist/js/bootstrap.min.js"></script>
	<!-- Just to make our placeholder images work. Don't actually copy the next line! -->
	<script src="assets/js/vendor/holder.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
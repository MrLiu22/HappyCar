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

				<h2 class="sub-header">Section title</h2>
				<div class="table-responsive">


					<table class="table table-striped">
						<thead>
							<tr>
								<th>课程名称</th>
								<th>学习时长</th>
								<th>记录时间</th>
								<th>状态</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>

							<c:forEach items="${byStudyTimeList}" var="item">
								<tr>
									<th scope="row">${item.courseName}</th>
									
									<td>${item.studyTime}</td>
									<td>${item.date}</td>
									<td>${item.states}</td>
									<td><a class="btn btn-danger btn-xs"
										href="index.jsp">操作</a></td>

								</tr>
							</c:forEach>

						</tbody>
						<!-- 
					<tbody>
					 
					<c:forEach items="${dmList}" varStatus="status" var="item"> 
					
						<tr <c:if test="${!item.yx}">class="wx"</c:if>>
							<td>${status.index+1}</td>
							<th scope="row"><a href="DmQueryXh?xh=${item.xh}">${item.xh}</a></th>
							<td>${item.xm}</td>
							<td><a href="DmQueryZc?zc=${item.zc}&xq=${item.xq}">第${item.zc}周星期${item.xq}</a></td>
							<td>${item.zh}</td>
							<td><a href="DmQueryIp?ip=${item.ip}">${item.ip}</a></td>
							<td>${item.sj1}</td>
							<td>${item.geyYxCn()}</td>
							<td>
							<c:if test="">
							<c:if test="${item.yx}">
							<a class="btn btn-primary btn-xs" href="ChangeState?id=${item.id}&state=0">作废</a> 
							</c:if>
							<c:if test="${!item.yx}">
							<a class="btn btn-danger btn-xs" href="ChangeState?id=${item.id}&state=1">恢复</a>
							</c:if>
							</c:if>
							</td>
						</tr>
						</c:forEach>
					 
					
						
					</tbody>
					-->
					</table>
					<!-- 
				<div class="panel-footer">
					<nav aria-label="Page navigation">
						<ul class="pagination">
							<li><a href="DmQuery?pageno=${page.getPrev()}" aria-label="Previous"> <span
									aria-hidden="true">&laquo;</span> </a></li>
							<li><a href="DmQuery?pageno=1">1</a>
							</li>
							<li><a href="DmQuery?pageno=2">2</a>
							</li>
							
							<li><a href="DmQuery?pageno=3">...</a>
							</li>
							
							<li><a href="DmQuery?pageno=3">...</a>
							</li>
							
							<li><a href="DmQuery?pageno=${page.getLast()-1}">${page.getLast()-1}</a>
							</li>
							<li><a href="DmQuery?pageno=${page.getLast()}">${page.getLast()}</a>
							</li>
							<li><a href="DmQuery?pageno=${page.getNext()}" aria-label="Next"> <span
									aria-hidden="true">&raquo;</span> </a></li>
						</ul>
					</nav>
				</div>
				 -->


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
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

    <title>Left</title>

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
<div class="col-sm-3 col-md-2 sidebar">
          <ul class="nav nav-sidebar">
            <li class="active"><a href="#">个人信息 <span class="sr-only">(current)</span></a></li>
            <li><a href="keJian.jsp">课件列表</a></li>
            <li><a href="KaoQinQuery">考勤记录</a></li>
            <li><a href="#">学习帮助</a></li>
            <li><a href="#">学员须知</a></li>
          </ul>
          <ul class="nav nav-sidebar">
            <li><a href="">Nav item</a></li>
            
          </ul>
          <ul class="nav nav-sidebar">
            <form class="form-horizontal" action="DeleteKaoQin"
				method="post">
				<li><a>请输入要删除的学习记录时间：</a></li>
				<li>
					<div class="col-sm-8">
						<input type="text" class="form-control" name="date1"
							placeholder="记录时间">
					</div>
				</li>
				<li>
					<div class="col-sm-offset-1 col-sm-10">
						<button type="submit" class="btn btn-default">删除</button>
					</div>
				</li>
			</form>
          </ul>
		<ul class="nav nav-sidebar">
			<form class="form-horizontal" action="KaoQinByStudyTime"
				method="post">
				<li><a>请输入学习时长：</a></li>
				<li>
					<div class="col-sm-8">
						<input type="text" class="form-control" name="searchTime"
							placeholder="学习时长">
					</div>
				</li>
				<li>
					<div class="col-sm-offset-1 col-sm-10">
						<button type="submit" class="btn btn-default">查询</button>
					</div>
				</li>
			</form>
		</ul>
	</div>
</body>
</html>
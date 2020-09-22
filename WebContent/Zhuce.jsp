<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>注册界面</title>
<link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.css">
<script type="text/javascript" src="bootstrap-3.3.7-dist/js/bootstrap.js"></script>
<script>
	function myFunction() {
		 alert("您已注册成功！请重新登录！");
		 //document.location.href="index.jsp";
	}
</script>


</head>

<body background="imgs/Zhuce.jpg">
<div class="container">
	
	
		<!--中间-->
		<div class="col-md-6">
		<div class="panel panel-primary">
			<div class="panel-heading">注册界面</div>
			<div class="panel-body">
				<form class="form-horizontal" action="UserInfo" method="post">
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-2 control-label">用户名：</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="userName"  placeholder="用户名">
						</div>
					</div>
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">密&nbsp;码：</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="password" id="inputPassword3" placeholder="密码">
						</div>
					</div>
					
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">重复密码：</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="repassword" id="inputPassword3" placeholder="重复密码">
						</div>
					</div>
					
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-2 control-label">邮箱：</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="email"  placeholder="邮箱">
						</div>
					</div> 
					
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-2 control-label">手机号：</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="phoneNum"  placeholder="手机号">
						</div>
					</div>
					
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">受教育程度：</label>
						<div class="col-sm-10">
							<select class="form-control" name="educa">
                                   <option value="高中">高中</option>
                                   <option value="大专">大专</option>
                                   <option value="本科">本科</option>
                                   <option value="研究生">研究生</option>
                                   <option value="硕士">硕士</option>
                                 </select>
						</div>
					</div>
					
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">兴趣爱好</label>
						<div class="col-sm-10">
							<label class="checkbox-inline">
                          <input type="checkbox" id="inlineCheckbox1" value="算法" name="hobby"> 算法
                             </label>
                           <label class="checkbox-inline">
                          <input type="checkbox" id="inlineCheckbox2" value=" WEB开发" name="hobby"> WEB开发
                             </label>
                           <label class="checkbox-inline">
                             <input type="checkbox" id="inlineCheckbox3" value="概率论" name="hobby"> 概率论
                             </label>
						</div>
					</div>
					
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">性别：</label>
						<div class="col-sm-10">
							<label class="radio-inline">
                              <input type="radio" name="sex" id="inlineRadio1" value="男"> 男
                               </label>
                           <label class="radio-inline">
                               <input type="radio" name="sex" id="inlineRadio2" value="女"> 女
                            </label>
						</div>
					</div>
			
					
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<div class="checkbox">
								<label>
									<input type="checkbox"> 记住密码
								</label>
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-default" onclick="myFunction()">注册</button>
							<input type="button" class="btn btn-default" name="button" value="返回" onclick="javascript:history.go(-1)"/>
							
						</div>
					</div>
				</form>

			</div>
		</div>

		</div>
		
	
</div>

</body>
</html>

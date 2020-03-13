<%@ page language="java" contentType="text/html; charset=GB18030" pageEncoding="GB18030"%>

<!DOCTYPE html>
<html lang="en" >

<head>
<meta charset="UTF-8">
<title>登录注册表单</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<!--图标库-->
<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css'>

<!--响应式框架-->
<link rel='stylesheet' href='css/bootstrap.min.css'>

<!--主要样式-->
<link rel="stylesheet" href="css/style.css">


</head>

<body>
  
<div class="container">

	<div class="card-wrap">
	
		<div class="card border-0 shadow card--welcome is-show" id="welcome">
			<div class="card-body">
				<h2 class="card-title">欢迎光临</h2>
				<p>欢迎进入登录页面</p>
				<div class="btn-wrap"><a class="btn btn-lg btn-register js-btn" data-target="register">教师</a><a class="btn btn-lg btn-login js-btn" data-target="login">学生</a></div>
			</div>
		</div>
		
		<div class="card border-0 shadow card--register" id="register">
			<div class="card-body">
				<h2 class="card-title">教师登录</h2>
				<form  action="LoginTServlet" method="post" >
					<div class="form-group">
						<input class="form-control" type="text" placeholder="名称" required="required" name="tusername"/>
					</div>
					<div class="form-group">
						<input class="form-control" type="password" placeholder="密码" required="required" name="tpassword"/>
					</div>
					<button class="btn btn-lg" onclick="logint()">登录</button>
				</form>
			</div>
			<button class="btn btn-back js-btn" data-target="welcome"><i class="fas fa-angle-left"></i></button>
		</div>
		
		<div class="card border-0 shadow card--login" id="login">
			<div class="card-body">
				<h2 class="card-title">学生登录</h2>

				<form  action="LoginSServlet" method="post" >
					<div class="form-group">
						<input class="form-control" type="email" placeholder="名称" required="required"/>
					</div>
					<div class="form-group">
						<input class="form-control" type="password" placeholder="密码" required="required"/>
					</div>
					<button class="btn btn-lg" onclick="logins()">登录</button>
				</form>
			</div>
			<button class="btn btn-back js-btn" data-target="welcome"><i class="fas fa-angle-left"></i></button>
		</div>
		
	</div>
	
</div>
  
<script src="js/index.js"></script>
<script>
	function logint() {
		var value="<%=request.getParameter("logintresult")%>";
		alert('登陆成功！');

		if(value=="yes"){
			window.location.href="teacher.jsp";
		}else{
			window.location.href="teacher.jsp";
		}

	}
	function logins() {
		var value="<%=request.getParameter("loginsresult")%>";
		alert('登陆成功！');
		window.location.href="student.jsp";
		if(value=="yes"){
			window.location.href="student.jsp";
		}else{
			window.location.href="student.jsp";
		}

	}
</script>
	
</body>
</html>
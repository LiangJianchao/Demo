<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<style type="text/css">
.con{
	width: 400px;
	height:300px;
	background-color: #ccc;
	position:absolute;
	left: 0;
	top: 0;
	right: 0;
	bottom: 0;
	margin: auto auto;
}
.tit{
	font-size: 20px;
	height: 40px;
	width: 100%;
	text-align: center;
	line-height: 40px;
	margin-bottom: 20px;
}
.fo{
	width: 100%;
}
.inp{
	width: 100%;
	overflow: hidden;
}
.inp p{
	float: left;
}
.inp .l{
	width: 80px;
	height: 20px;
	font-size: 16px;
	line-height: 20px;
	padding-left: 50px;
}
.inp .r{
	width: 200px;
	height: 20px;
}
.inp .r input{
	width: 200px;
	height: 20px;
}
.bottom{
	height: 30px;
	margin-top: 20px;
	padding-left: 200px;
}
.bottom input{
	width: 60px;
	height: 30px;
	font-size: 30px;

}
</style>
</head>
<body>
<div class="con">
	<h2 class="tit">登陆系统</h2>
	<form id="fo" method="post" action="LoginAction">
		<div class="inp">
			<p class="l">用户名:</p>
			<p class="r"><input type="text" name="user.username"></p>
		</div>
		<div class="inp">
			<p class="l">密码:</p>
			<p class="r"><input type="password" name="user.password"></p>
		</div>
		<div class="bottom">
			<input type="submit"  value="登陆">
			<input id="btn" type="button"  value="注册">
		</div>
	</form>
</div>
</body>

<script type="text/javascript">
	var btn = document.getElementById('btn');
	var fo = document.getElementById('fo');
	btn.onclick=function () {
		fo.action = "RegisterAction";
		fo.submit();
	}
</script>
</html>
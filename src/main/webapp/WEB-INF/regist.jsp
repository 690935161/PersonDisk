<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆管理系统</title>
<style>
.inputBlock {
	width: 150px
}

.inputSpan {
	display: inline-block;
	width: 170px;
}
</style>
<script type="text/javascript">
	if (window != top) {
		top.location.href = window.location.href;
	}
	document.getElementById("usr").focus();
	function checkForm() {
		var usr = document.getElementById("usr");
		var pwd = document.getElementById("pwd");
		if (usr.value == "") {
			alert("用户名为空");
			usr.focus();
			return false;
		}
		if (pwd.value == "") {
			alert("密码为空");
			pwd.focus();
			return false;
		}
		return true;
	} 
</script>
</head>
<body>
	<div
		style="width: 95%; height: 300px; text-align: center; margin-left: auto; margin-right: auto; border: thick; border-style: solid; border-color: #80bbff;">
		<form method="post" action="system/doLogin" onsubmit="return checkForm();" style="margin-top: 80px;">
			用户名：
			<span class="inputSpan">
				<input class="inputBlock" type="text" name="username" id="usr" />
			</span>
			<br>
			<br>
			密&#12288;码：
			<span class="inputSpan">
				<input class="inputBlock" type="password" name="password" id="pwd" />
			</span>
			<br>
			<br>
			<input type="submit" value="登录" />
		</form>
		<br>
	</div>
</body>
</html>
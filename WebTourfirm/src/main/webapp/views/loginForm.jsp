<%@ page language="java" contentType="text/html; UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div id="loginForm">
		<form action="login" autocomplete="on" method="POST">
			<div class="form-group">
				<label for="login">Логін</label> 
				<input type="text" class="form-control" id="login" name="login">
			</div>
			<div class="form-group">
				<label for="Pass">Пароль</label> 
				<input type="password" class="form-control" id="Pass" name="pass">
			</div>
			<button type="submit" class="btn btn-default">Увійти</button>
		</form>

	</div>

</body>
</html>
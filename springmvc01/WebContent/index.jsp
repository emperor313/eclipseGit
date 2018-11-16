<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<a href="springmvc/testPathVariable/谢浩东">testPathVariable</a>
<hr>
<form action="springmvc/requestParamTest" method="get">
    requestParam Test<br>
    用户名称：<input type="text" name="username"><br>
    用户昵称：<input type="text" name="usernick"><br>
    <input type="submit" value="提交">
    
</form>
<hr>
<a href = "springmvc/testRequestHeader">testRequestHeader</a>
<hr>
	<a href = "helloword">hello word</a>
	<hr>
	<a href="springmvc/testParamAndHeaders?username=hhhhh&age=10">testParamAndHeaders</a>
	<hr>
	<form action="springmvc/testMethod" method="post">
		<input type="submit" value="post请求">
	</form>
	
	<hr>
	<form action="springmvc/testMethod" method="post">
		<!-- <a href="testMethod">Post访问</a> -->
		<input type="submit" value="Post访问">
	</form>
	
	<hr>
	<form action="springmvc/testGetMethod" method="get">
		<!-- <a href="testMethod">Post访问</a> -->
		<input type="submit" value="Get访问">
	</form>
</body>
</html>
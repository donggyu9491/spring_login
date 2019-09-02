<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="loginok" method="post">
	사원번호<input type="text" name = "empno">
	이름<input type="text" name = "ename">
	<input type="submit" value="로그인">
	</form>

</body>
</html>
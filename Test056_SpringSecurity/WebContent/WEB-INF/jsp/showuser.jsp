<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- 
	Author(s) 	  ： sky
	Description  : 用户展示页面
 -->
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>用户展示</title>
</head>
<body>
	<form>
		<table border="1">
			<tr>
				<td>用户名</td>
				<td>地址</td>
				<td>年龄</td>
				<td>生日</td>
			</tr>
			
			<c:forEach items="${userList}" var="user">
				<tr>
					<td>${user.name }</td>
					<td>${user.address }</td>
					<td>${user.age }</td>
					<td>${user.birth }</td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>
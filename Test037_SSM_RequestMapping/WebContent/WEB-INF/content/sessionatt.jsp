<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
	request作用域中的user对象username : ${requestScope.user.username}
	</br>
	session作用域中的user对象username : ${sessionScope.user.username}
</body>
</html>

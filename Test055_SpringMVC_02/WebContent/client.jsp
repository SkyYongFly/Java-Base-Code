<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- 
	页面发送ajax请求到服务器端
 -->
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>模拟客户端</title>
	<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
</head>
<body>
	
	<script type="text/javascript">
		$.ajax({
			url:"<%=request.getContextPath() %>/user/getUserInfoJSON.action",
			type:"POST",
			data:JSON.stringify({"name":"xiaoming"}),
			contentType:"application/json;charset=UTF-8",
			dataType:"json",
			success:function(data){
				alert(data.address);
			}
		});
		
	</script>
</body>
</html>
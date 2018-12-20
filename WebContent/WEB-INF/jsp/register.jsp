<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>注册页面</title>
</head>
<body>
	
	<form:form modelAttribute="user" action="user/addUser" method="post">
		<fieldset>
		<legend>用户注册</legend>
			用户名：<form:input path="username"/>
			<span style="color:red;"><form:errors path="username" cssClass="error" /></span>
			
			<br>
			密码：<form:input path="password"/>
			<span style="color:red;"><form:errors path="password" cssClass="error"/></span>
			
			<br>
			邮箱：<form:input path="email"/>
			<span style="color:red;"><form:errors path="email" cssClass="error"/></span>
			
			<br>
			手机号：<form:input path="phore"/>
			<span style="color:red;"><form:errors path="phore" cssClass="error"/></span>
			
			<br>
			<input type="submit" value="注册">
		</fieldset>
	</form:form>
	
</body>
</html>
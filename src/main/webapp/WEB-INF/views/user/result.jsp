<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="org.jhj.myweb.*"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/board.css" type="text/css"></link>
</head>

<body>

<jsp:include page="/WEB-INF/views/header_no.jsp"></jsp:include>

<div id="container">
	<div>
		<br><h1> <strong>회원가입 성공 </strong></h1><br>
		<p>가입 축하합니다</p><br><br>
		</div>
	</div>
</body>
</html>
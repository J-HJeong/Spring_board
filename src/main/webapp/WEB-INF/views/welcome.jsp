<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>welcome</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/board.css" type="text/css"></link>
</head>

<body>
<c:choose>
	<c:when test="${sessionScope.sessionID == null}">
		<jsp:include page="/WEB-INF/views/header_no.jsp"></jsp:include>
	</c:when>
	<c:otherwise>
		<jsp:include page="/WEB-INF/views/header_login.jsp"></jsp:include>
	</c:otherwise>
</c:choose>

<div id="container">
	<br><h1><Strong>Frame Programming Project</Strong></h1><br>
	<p>게시판 구현</p>
</div>
</body>
</html>
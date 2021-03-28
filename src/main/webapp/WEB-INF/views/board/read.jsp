<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>read</title>
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
	<div class="subject"><br><br>
		<table>
			<thead>
				<tr>
					<th colspan="3" >글 보기 </th>
				</tr>
			</thead>

			<tbody>
				<tr>
					<td><Strong>글 제목 </Strong></td>
					<td colspan="2">${read.boardTitle}</td>
				</tr>
				<tr>
					<td><Strong>작성자</Strong></td>	
					<td colspan="2">${read.boardWriter }</td>
				</tr>
				<tr>
					<td><strong>작성일</strong></td>	
					<td colspan="2">${read.boardDate }</td>
				</tr>
				<tr>
					<td><Strong>내용</Strong></td>	
					<td colspan="2" id="readContent">${read.boardContent}</td>
				</tr>
			</tbody>
		</table>	
	</div>
	
	<!-- 게시글의 작성자가 현재 로그인한 사용자라면 수정,삭제 버튼 나타남-->
	<div>
		<c:if test="${sessionScope.sessionID == read.boardWriter}">
			<a href="http://localhost:8080/myweb/board/update?boardnum=${read.boardNum}" id="button" >수정</a>
			<a href="http://localhost:8080/myweb/board/delete?boardnum=${read.boardNum}" id="button" >삭제</a>
		</c:if>
	</div>
	
</div>
</body>
</html>
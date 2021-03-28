<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>write</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/board.css" type="text/css"></link>
</head>

<body>

<jsp:include page="/WEB-INF/views/header_login.jsp"></jsp:include>

<div id="container">
	<div class="typeList">
	<form method="post" action="http://localhost:8080/myweb/board/update/"><br><br>
		<input type="hidden" name="boardNum" value="${board.boardNum}" />
		<table>
			<thead>
				<tr>
					<th colspan="2">글 수정</th>
				</tr>
			</thead>
				
			<tbody>
				<tr>
					<td><input type="text" id="write" value=${board.boardTitle } name="boardTitle" maxlength="50"/></td>
				</tr>
				<tr>
					<td><textarea name="boardContent" maxlength="2048" required>${board.boardContent }</textarea></td>
				</tr>
			</tbody>
		</table>
		
	<div>	
		<input type="submit" id="right-button" value="수정" />
	</div>
	
	</form>
	</div>
</div>
</body>
</html>
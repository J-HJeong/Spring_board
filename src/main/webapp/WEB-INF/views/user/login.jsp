<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/board.css" type="text/css"></link>
</head>

<body>

<jsp:include page="/WEB-INF/views/header_no.jsp"></jsp:include>

<div id="container">
  <br><h1>로그인</h1><br>
  <form action="http://localhost:8080/myweb/user/login/" method="post">
  
    <div>
      <input type="text" id="input" autofocus required placeholder="아이디" name="userId">
    </div><br>
    
    <div>
      <input type="password" id="input" required placeholder="비밀번호" name="passwd">
    </div><br><br>
    
    <button type="submit" id="button">로그인</button>
  </form>
</div>
</body>
</html>
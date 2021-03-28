<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="org.jhj.myweb.*" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8"> 
<title>join</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/board.css" type="text/css"></link>
</head>

<body>

<jsp:include page="/WEB-INF/views/header_no.jsp"></jsp:include>

<div id="container">
  <br><h1>회원 가입</h1><br>
  <form action="http://localhost:8080/myweb/user/register/" method="post">
  
    <div>
      <input type="text" id="input" autofocus required placeholder="아이디" name="userId">
    </div><br><br>
    
    <div>
      <input type="password" id="input" required placeholder="비밀번호" name="passwd">
    </div><br><br>
    
    <div>
      <input type="tel" id="input" name="mobile" required placeholder="전화번호  ***.****.****">
     </div><br><br>
     
    <div>
      <input type="email" id="input" name="email" required placeholder="이메일 ****@****.***">
    </div><br><br><br>
    
    <button type="submit" id="button">회원 가입</button>
  </form>
</div>
</body>
</html>
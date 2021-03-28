<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- 게시판 글 목록 출력 -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>boardList</title>
  	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/board.css?q" type="text/css"></link>
</head>
<body>

<!-- 로그인 유뮤에 따라 헤더 변경 -->
<c:choose>
	<c:when test="${sessionScope.sessionID == null}">
		<jsp:include page="/WEB-INF/views/header_no.jsp"></jsp:include>
	</c:when>
	<c:otherwise>
		<jsp:include page="/WEB-INF/views/header_login.jsp"></jsp:include>
	</c:otherwise>
</c:choose>

<div id="container">
	<div>
		<c:if test="${sessionScope.sessionID != null}">
			<!-- 글쓰기 화면으로 이동 -->
			<a href="http://localhost:8080/myweb/board/write/" id="right-button">글쓰기</a>
		</c:if><br><br>
	</div>
	
	<div class="typeList">
		<table>
			<thead>
				<tr>
					<th>번호</th><th>제목</th><th>작성자</th><th>작성일</th><th>조회수</th>
				</tr>
			</thead>
			
			<tbody>
				<tr>
					<!-- 한 페이지당 10개의 게시글 보여줌 -->
					<c:forEach items="${boardList }" var="boardList"> <!--begin="0" end="10">-->
						<tr>
							<td>${boardList.boardNum }</td>
							<td><a href="http://localhost:8080/myweb/board/read?boardnum=${boardList.boardNum }">${boardList.boardTitle}</a></td>
							<td>${boardList.boardWriter }</td>
							<td>${boardList.boardDate }</td>
							<td>${boardList.view_cnt }</td>
						</tr>
					</c:forEach>
				</tr>
			</tbody>
		</table>
	</div><br>

<div class="center">
  <ul class="pagination">
    <c:if test="${pageMaker.prev}">
    	<li>
        	<a href='<c:url value="http://localhost:8080/myweb/board/list?page=${pageMaker.startPage-1 }"/>'>
        		<span aria-hidden="true">&laquo;</span>
     	   		<span class="sr-only">Previous</span>
     	   	</a>
    	</li>
    	</c:if>
    
    	<c:forEach begin="${pageMaker.startPage }" end="${pageMaker.endPage }" var="pageNum">
    	<li>
    		<c:choose>
    			<c:when test="${page.page eq pageNum}">
        			<a class="active" href='<c:url value="http://localhost:8080/myweb/board/list?page=${pageNum }"/>'>${pageNum }</a>
        		</c:when>
        		<c:otherwise>
        			<a href='<c:url value="http://localhost:8080/myweb/board/list?page=${pageNum }"/>'>${pageNum }</a>
        		</c:otherwise>
        	</c:choose>
    	</li>
    	</c:forEach>
    
    	<c:if test="${pageMaker.next && pageMaker.endPage > 0 }">
    	<li>
        	<a href='<c:url value="http://localhost:8080/myweb/board/list?page=${pageMaker.endPage+1 }"/>'>
        		<span aria-hidden="true">&raquo;</span>
        		<span class="sr-only">Next</span>
        	</a>
    	</li>
    	</c:if>
  </ul>
</div>
</div>
</body>
</html>
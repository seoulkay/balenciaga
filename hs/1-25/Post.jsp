<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ page session="false" %>
<html>
<head>
	<title>gesi.com</title>
</head>
<body>
<h1> 한개의 글을 자세하게 보여주는 페이지  <a href="http://localhost:8080/com/home"> 홈으로   </a>
</h1>
	<table>
			<tr>
				<td>제목 : </td>
				<td>${postOne.postTitle }  </td>
			</tr>
			<tr>
				<td>내용 : </td>
				<td>${postOne.description }  </td>
			</tr>
			<tr>
				<td>생성일 : </td>
				<td>${postOne.create }  </td>
			</tr>
			<tr>
				<td>생성자 : </td>
				<td>${postOne.postId }  </td>
			</tr>
			</table>
			
			<table>
			<tr>
			<td>
			<form action="postUpdateForm" class="form-inline" method="GET">
	 	 		<input type="submit" value="수정">
	 	 		<input type="hidden" name="id" value="${postOne.id }">
 	 		</form>
 	 		</td>
 	 		<td>
	 	 	<form action="postDeleteAction" class="form-inline" method="GET">
	 	 		<input type="submit" value="삭제">
	 	 		<input type="hidden" name="id" value="${postOne.id }">
 	 		</form>
 	 		</td>
 	 		</tr>
 	 		</table>
 	 		
 	 		<form action="replyFormAction" class="form-inline" method="POST">
	 	 		아이디 : <input type="text" name="userId">
	 	 		내용 : <input type="text" name="description">
	 	 		<input type="submit" value="댓글쓰기">
	 	 		<input type="hidden" name="id" value="${postOne.id }">
 	 		</form>
			 <c:forEach items="${replyList }" var="re" begin="0">
		 	  	<div class="row">    
				<table>
					<tr>
					<td>작성자 : </td><td>${re.userId} </td>
					<td>내용 : </td><td>${re.description }</td>
					<td>생성일 : </td><td>${re.create }</td>
					</tr>
				</table>
				</div>
		 	 </c:forEach>
			 
</body>
</html>

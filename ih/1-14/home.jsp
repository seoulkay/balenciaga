<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ page session="false" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Home</title>
<style>
  table {
    width: 100%;
    border: 1px solid #444444;
    border-collapse: collapse;
  }
  th, td {
    border: 1px solid #444444;
    padding: 10px;
  }
</style>
</head>
<body>
<h1>
	Hello world! 재밌게 꾸며보자.
</h1>

<p>안녕하세요 내가 만든 더하기 함수의 결과는 ${result} 입니다.</p>

<P>  The time on the server is ${serverTime}. </P>

<p>학생리스트</p>
<c:forEach var="item" items="${studentList}" varStatus="status">
     <p>이름 : ${item}</p>
     <p>순번 : ${status.index}</p>     
</c:forEach>

<table>
	<tr>
		<td>번호</td>
		<td>내용</td>
	</tr>
<c:forEach var="item" items="${studentList}" varStatus="status">
	<tr>
		<td>${status.index}</td>
		<td>${item}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>

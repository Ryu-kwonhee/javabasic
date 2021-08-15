<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>글 정보 수정</h1>
	<form action="http://localhost:8181/MyFirstWeb/boardupdateok.do" method="post">
	<!-- hidden 태그를 이용해 나머지 요소들도 다 첨부해주세요. -->
	<input type="hidden" value="${board.bid }" name="bid">
	<input type="hidden" value="${board.bhit }" name="bhit">
	<input type="hidden" value="${board.bdate }" name="bdate">
	<input type="hidden" value="${board.bname }" name="bname">
	
		<table border="1">
			<tr>
				<td>글 번호</td>
				<td>${board.bid }</td>
				<td>조회수</td>
				<td>${board.bhit }</td>
			</tr>
			<tr>
				<td>쓴 날짜</td>
				<td>${board.bdate }</td>
			</tr>
			<tr>
				<td>글제목</td>
				<td><input type="text" name="btitle" value="${board.btitle }"></td>
			</tr>
			<tr>
				<td>본문</td>
				<td><textarea cols="50" rows="10" name="bcontent">${board.bcontent }</textarea></td>
			</tr>
			<tr>
				<td>글쓴이<td>
				<td>${board.bname}<td>
			</tr>
			<tr>
				<td>
					<a href="/MyFirstWeb/boardselect.do">
					<input type="button" value="리스트">
					</a>
					
					<input type="submit" value="수정하기">
					<input type="reset" value="초기화">
					
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
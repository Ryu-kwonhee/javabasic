<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>글</h1>
	<form action="/MyFirstWeb/boarddelete.do" method="post">
	<table border="1">
		<tr>
			<td>글번호<td>
			<td>${board.bid }<td>
			<td>조회수<td>
			<td>${board.bhit }<td>
		</tr>
		<tr>
			<td>쓴 날짜<td>
			<td>${board.bdate }<td>
		</tr>
		<tr>
			<td>글제목<td>
			<td>${board.btitle }<td>
		</tr>
		<tr>
			<td>본문<td>
			<td><textarea cols="50" rows="10" name="content" readonly>${board.bcontent }</textarea><td>
		</tr>
		<tr>
			<td>글쓴이<td>
			<td>${board.bname }<td>
		</tr>
		<tr>
		<td>
			<a href="/MyFirstWeb/boardselect.do">
			<input type="button" value="리스트">
			</a>
				<input type="hidden" value="${board.bid }" name="bid">
				<input type="submit" value="삭제하기">
		<td>
		</tr>
	</table>
	</form>
	<form action="/MyFirstWeb/boardupdate.do" method="post">
		<input type="hidden" value="${board.bid }" name="bid">
		<input type="submit" value="수정하기">
	</form>
</body>
</html>
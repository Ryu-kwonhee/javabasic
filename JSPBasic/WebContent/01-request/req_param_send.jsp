<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  
	<!-- form 태그의 action은 데이터가 전달될 목적지입니다.
	현재, req_param_getpost로 날릴 예정입니다. -->
	<form action="req_param_getpost.jsp" method="post"> <!-- 메서드를 안적으면 자동으로 get으로 설정됨 -->
	<input type="text" name="id"/>아이디<br>
	<input type="password" name="pw"/>비밀번호<br>
	<input type="text" name = "nick"/>닉네임<br>
	
	<!-- 체크박스 -->
	취미 : 
	<input type="checkbox" name="hobby" value="요리">요리&nbsp; 
	<input type="checkbox" name="hobby" value="운동">운동&nbsp;<br>
	
	<!-- 특기 체크박스 추가, 최소 5개 이상 -->
	특기 :
	<input type="checkbox" name="ability" value="수영">수영&nbsp;
	<input type="checkbox" name="ability" value="달리기">달리기&nbsp;
	<input type="checkbox" name="ability" value="영어">영어&nbsp;
	<input type="checkbox" name="ability" value="춤">춤&nbsp;
	<input type="checkbox" name="ability" value="축구">축구&nbsp;<br>
	
	<!-- 성별은 하나만 골라야 하므로 radio를 사용합니다. -->
	<input type="radio" name="gender" value="male">male&nbsp;
	<input type="radio" name="gender" value="female">female&nbsp;<br>
	<input type="radio" name="glasses" value="yes">yes&nbsp;
	<input type="radio" name="glasses" value="no">no&nbsp;<br>
	
	<!-- select태그는 선택지를 드롭박스로 줍니다. -->
	<select name="region">
		<option>서울</option>
		<option>경기</option>
		<option>충청</option>
		<option>전라</option>
		<option>경상</option>
		<option>강원</option>
		<option>제주</option>
	</select><br><br>
	 
	<input type="submit" value="제출"/>
	<input type="reset" value="리셋"/>
	</form>
</body>
</html>
<%@ page import= "java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%!
		// 선언부에 작성한 변수들은
		// 단 한 번만 선언됩니다.
		List<String>party = new ArrayList<>();
		String job;
	%>
	<%
	int r = (int)(Math.random()*5);
		switch (r) {
			case 0:
				job = "전사";
			break;
			case 1:
				job = "도적";
			break;
			case 2:
				job = "마법사";
			break;
			case 3:
				job = "사제";
			break;
			case 4:
				job = "사냥꾼";
			break;
		}
		party.add(job);
	
	
		// 파티에 같은 직업이 몇 명있는지 찾는 작업
		int c = 0;
		for(String player : party) {
			if(job.equals(player)) {
				c++;
			}
		}
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>당신의 역할</h1>
	<p>
		당신에게 부여된 역할은 <b>[<%= job %>]</b>입니다.<br>
		현재 파티에 당신과 같은 역할을 가진 플레이어는 <%= c %>명입니다.<br><br>
		현재 파티 구성<br>
		<%= party.toString() %>(<%= party.size() %>명 참가중)
	</p>	
	<%
		if (party.size() == 10) {
			party.clear();
		}
	%>
</body>
</html>
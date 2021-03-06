<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src = "https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<link href="https://fonts.googleapis.com/css2?family=Lobster&display=swap" rel="stylesheet">
<style>
	
	#findIdForm{
	width:100%;
	margin-left:auto;
	margin-right:auto; 
	
	height: 200px;
	float:center;
	border-size: 50px;
	}

	#userIdfindText{
	font-family: 'gulim', cursive;
	font-size:70px;
	padding :40px;
	
	}
	
	#inputbox{
	border-style: solid;
    border-radius: 8px;
	width: 230px;
	height: 30px;
	margin :5px;
	}
	
	td{
	color:orangered;
	}
	#joinId{
	color:white;
	width: 150px;
	height: 20px;
	}

	
	.btns{
	border-radius:5px;	
	}
	#goMain{
	width: 150px;
    height: 40px;
    font-size: 20px;
    border-style: solid;
    border-radius: 8px;
	background-color:mistyrose;
	transition-duration: 1s;
	}
	#goMain:hover{
    background:mediumblue;
     color:white;
	}
	
	#idcheckbtn{
	width: 150px;
    height: 40px;
    font-size: 20px;
	background-color:cornsilk;
	border-style: solid;
    border-radius: 8px;
    transition-duration: 1s;
	}
	#idcheckbtn:hover{
    background:mediumblue;
    color:white;
	}
</style>

</head>
<body>
   <h1 id = "userIdfindText" align = "center" style="color:skyblue; ">아이디 찾기</h1>
	<div class="outer">
		<form id="findIdForm" action="<%=request.getContextPath() %>/findIdForm.me" method="post" onsubmit="return joinValidate();">
			<table align="center">
			<div>
				<tr>
					<td>* 이름</td>
					<td><input id ="inputbox" type="text" maxlength="15" name="userName" placeholder="name" required></td>
					<td></td>
				</tr>
				<tr>
					<td>* 전화번호</td>
					<td><input id ="inputbox" type="text" maxlength="11" name="phone" placeholder="(-없이)01012345678"></td>
					<td></td>
				</tr>
				<tr>
					<td>* 이메일</td>
					<td><input id ="inputbox" type="text" name="email" placeholder="....@...."></td>
					<td></td>
				</tr>
			
			</div>	
			</table>
			
			<br>
			<div class="btns" align="center">

					<button type="submit" id="idcheckbtn" onlcick="idcheck();">입력완료</button>
					<button type="button" id="goMain" onclick="history.go(-1)">취소</button>
					
			</div>
		</form>
	</div>
	
</body>
</html>

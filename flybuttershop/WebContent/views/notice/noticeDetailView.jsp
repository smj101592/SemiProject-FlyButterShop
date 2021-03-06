<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.flybutter.notice.model.vo.Notice" %>
<%
	Notice n = (Notice)request.getAttribute("n");
%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0" charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<style>
	.outer {
	width: 1200px;
	height: auto;
	color: black;
	margin: auto;
	margin-top: 50px;
}
	.outer>table, .outer>table tr>*{
		border:1px solid black;
	}
	 
	.outer>table{
		width:1200px;
		height:auto;
	}
	
	.outer>table p{
		height:auto;
		margin:0;
	}
</style>
</head>
<body style="margin: 0 auto">


<jsp:include page="../header_footer/header.jsp" flush="true"/>

	<section>
	<jsp:include page="../common/csMenubar.jsp" flush="true"/>
	<div class="outer">
	
		<table align="center">
			<tr>
				<td>제목</td>
				<td colspan="3"><%= n.getNotice_Title() %></td>
				<td>작성일</td>
				<td><%= n.getNotice_Date() %></td>
			</tr>
			<tr>
				<td colspan="6" style="height: auto">
					<% if(n.getNotice_File_System() != null){ %>
					<div class="detailImgArea" align="center">
						<img width="600px" height="450px" src="<%=request.getContextPath()%>/resources/notice_file/<%=n.getNotice_File_System()%>"><br>
												
					</div>
					
					<% }else{ %>
					첨부파일이 없습니다.
					<% } %>
				
			</tr>	
			<tr>
					<td colspan="6" style="height: auto">내용
					<p><%= n.getNotice_Content() %></p>
				</td>
			</tr>
		</table>
		
		<br>
		
		<div class="btns" align="center">
		
			<a href="entireList.no">목록으로</a> &nbsp;&nbsp;
				
			
			
			<a href="updateForm.no?no=<%=n.getNotice_No()%>">수정하기</a> &nbsp;&nbsp;
			<a href="delete.no?no=<%=n.getNotice_No()%>">삭제하기</a>
		
		
		</div>
		<form action="" id="postForm" method="post">
			<input type="hidden" name="no" value="<%= n.getNotice_No() %>">
		</form>
		<script>
			function updateForm(){
				$("#postForm").attr("action", "<%=request.getContextPath()%>/updateForm.no");
				$("#postForm").submit();
			}
			
			function deleteBoard(){
				$("#postForm").attr("action", "<%=request.getContextPath()%>/deleteB.no");
				$("#postForm").submit();
			}
		</script>
	</div>
	</section>

<jsp:include page="../header_footer/footer.jsp" flush="true"/>
</body>
</html>
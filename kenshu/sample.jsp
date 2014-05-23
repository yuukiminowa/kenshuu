<%@ page contentType="text/html; charset=windows-31j" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>

<%
int count = 10;
Date startDate = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
%>

<html>
	<head>
		<title>
			JSPサンプルページ
		</title>
	</head>
	
	<body>
		<% System.out.println("Hello World!"); %>
		
		<% for (int i = 0 ; i < count; i++){ %>
			<p><%= String.valueOf(i) %>ループ目です。<p/>
		<% } %>
		このJSPは<%= sdf.format(startDate) %>に起動されました。
		<br>
		<br>
		
		<%-- コメント１ --%>
		<!-- コメント２ --!>
		<%
			// コメント３
			System.out.println("コメントの確認です。");
		%>
			
			
	</body>
</html>
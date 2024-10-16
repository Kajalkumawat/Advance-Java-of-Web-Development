<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form>
name:<input type="text" name="name"/><br>
<button type="submit">submit</button>

<%

String name=request.getParameter("name");
out.println(name);

%>
</form>
</body>
</html>
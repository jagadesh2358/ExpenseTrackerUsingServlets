<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
        margin: 0;
        padding: 20px;
        text-align: center;
    }

    h3 {
        color: #4caf50;
        font-size: 24px;
    }
</style>

</head>
<body>
<%

double total=(Double)request.getAttribute("total"); 

%>
</body>

<h3>Total expenses are : <%=total %></h3>
</html>
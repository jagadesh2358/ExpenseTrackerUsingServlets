<%@page import="dto.Person"%>
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

        .container {
            max-width: 600px;
            margin: 0 auto;
        }

        h1 {
            color: #333;
        }

        .link {
            margin-bottom: 20px;
            font-size: 18px;
        }

        .button {
            background-color: #4caf50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            font-size: 16px;
            cursor: pointer;
            text-decoration: none;
        }

        .button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<%

Person person=(Person)request.getAttribute("person");


%>
<div class="container">
        <h1>Expense Management</h1>
        <div class="link">
            <a href="Addexpense.jsp?id=<%=person.getPersonId()%>" class="button">Add an Expense</a>
        </div>
        <div class="link">
             <form action="view" method="post">
                <button class="button" name="btn" value="<%=person.getPersonId()%>">View All Expenses</button>
            </form> 
            <%-- <a href="view?id=<%=person.getPersonId() %>" class="button">View All Expenses</a> --%>
        </div>
    </div>
</body>
</html>
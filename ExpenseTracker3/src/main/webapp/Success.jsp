<%@page import="dto.Expense"%>
<%@page import="java.util.List"%>
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

        .message {
            background-color: #4caf50;
            color: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            max-width: 400px;
            margin: 0 auto;
        }

        .message h2 {
            margin-top: 0;
        }

        .button {
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 4px;
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;
            text-decoration: none;
            transition: background-color 0.3s;
        }

        .button:hover {
            background-color: #0056b3;
        }

        a {
            display: block;
            margin-top: 20px;
            color: #007bff;
            text-decoration: none;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<% /* List<Expenses> list=(List)request.getAttribute("expenses"); */

int id=(Integer)request.getAttribute("id");


%>
  <div class="message">
        <h2>Successfully added</h2>
    </div>
    <br> <br>
    <form action="view" method="post">
        <button class="button" name="btn" value="<%=id%>">View All Expenses</button>
    </form>
</body>
</html>
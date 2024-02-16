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
        }

        form {
            background-color: #ffffff;
            border-radius: 8px;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            max-width: 400px;
            margin: 0 auto;
        }

        h2 {
            text-align: center;
            color: #333;
        }

        label {
            display: block;
            margin-bottom: 10px;
            color: #555;
        }

        input[type="date"],
        input[type="text"],
        input[type="number"] {
            width: 100%;
            padding: 8px;
            margin-bottom: 15px;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        button {
            background-color: #4caf50;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            width: 100%;
        }

        button:hover {
            background-color: #45a049;
        }
        </style>
</head>
<body>
<%int id=Integer.parseInt(request.getParameter("id")); %>
<form action="add" method="post">
        <h2>Add Expense</h2>
        
        <label for="id">Id:</label>
        <input type="number" id="id" name="id" value="<%=id%>" readonly="readonly">
        
        <label for="date">Date:</label>
        <input type="date" id="date" name="date" required>

        <label for="category">Category:</label>
        <input type="text" id="category" name="category" required>

        <label for="amount">Amount:</label>
        <input type="number" id="amount" name="amount" required>

        <button>Add</button>
    </form>
</body>
</html>
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
            padding: 0;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
            
        }

        form {
            background-color: #ffffff;
            border-radius: 8px;
            padding: 20px;
            width: 300px;
            margin-top:20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h2 {
            text-align: center;
            color: #333;
            margin: 0; /* Removed margin to align at the top */
            padding-top: 10px; /* Added padding-top for spacing */
        }


        label {
            display: block;
            margin: 10px 0 5px;
            color: #555;
        }

        input {
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

        .login-link {
            text-align: center;
            margin-top: 10px;
        }

        .login-link a {
            color: #555;
            text-decoration: none;
        }

        .login-link a:hover {
            text-decoration: underline;
        }
        
         .message {
            text-align: center;
        }
    </style>
</head>
<body>
<%

String message=(String)request.getAttribute("message");

if(message != null)
{
	
%>

<h2 class="message"><%=message %></h2>
<% 
}
%>


<form action="signup" method="post">
        <h2>Signup</h2>
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required>

        <label for="age">Age:</label>
        <input type="number" id="age" name="age" required>

        <label for="address">Address:</label>
        <input type="text" id="address" name="address" required>

        <label for="phone">Phone Number:</label>
        <input type="tel" id="phone" name="phone" pattern="[0-9]{10}" required>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>

        <button type="submit">Signup</button>

        <div class="login-link">
            Already have an account? <a href="Login.jsp">Proceed for Login</a>
        </div>
    </form>
</body>
</html>
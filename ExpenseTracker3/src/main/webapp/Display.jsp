<%@page import="dao.InsertDao"%>
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
    }

    table {
        border-collapse: collapse;
        width: 100%;
        margin-bottom: 20px;
    }

    th, td {
        border: 1px solid #dddddd;
        padding: 10px;
        text-align: left;
    }

    th {
        background-color: #4caf50;
        color: white;
    }

    #a1 {
        display: block;
        margin-top: 20px;
        background-color: #007bff;
        color: white;
        padding: 10px 20px;
        text-align: center;
        text-decoration: none;
        border-radius: 5px;
    }

    #a1:hover {
        background-color: #0056b3;
    }
    
    .delete-button {
            background-color: red;
            color: white;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
        }
</style>
</head>
<body>
<%




 List<Expense> expenses=(List)request.getAttribute("msg"); 


double total=0;



%>



<table border="1" rules="all" cellspacing="20px" cellpadding="20px">
<tr>
<th><%="expenseId" %></th>
<th><%="enpenseDate" %></th>
<th><%="expenseCategory" %></th>
<th><%="expenseAmount" %></th>
<th><%="Delete" %></th>
</tr>



<%

if(expenses!=null)
{
for(Expense expense:expenses)
{
	
%>
<tr>

<td><%=expense.getExpenseId() %></td>
<td><%= expense.getExpenseDate()%></td>
<td><%=expense.getExpenseCategory() %></td>
<td><%=expense.getExpenseAmount() %></td>
<td><a href="delete?id=<%=expense.getExpenseId()%>"><button class="delete-button">DELETE</button></a></td>
</tr>
<%
total=total+expense.getExpenseAmount();
}
}
%>


</table>



<a href="cal?val=<%=total%>" id="a1">Calculate</a>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
body {
    text-align: center;
    background-color: aqua;
}
table {
    margin: auto;
}
a{
text-align: center;
}
</style>
</head>
<body>
<a href="addEmployeeRecord"> Add Employee </a>
<table border="2">
    <tr>
        <th>Employee Name</th>
        <th>Employee Address</th>
        <th>Employee Salary</th>
        <th>Employee Phone</th>
        <th>Action1</th>
        <th>Action2</th>
    </tr>
    <c:forEach items="${list}" var="lis">
        <tr>
            <td>${lis.employeeName}</td>
            <td>${lis.employeeAddress}</td>
            <td>${lis.employeeSalary}</td>
            <td>${lis.employeePhone}</td>
            
 <td><form action="editById" method="get">
    <input type="hidden" name="id" value="${lis.id}" />
    <button type="submit">Update</button>
    </form></td> 

<td><form action="deleteById" method="get">
    <input type="hidden" name="id" value="${lis.id}" />
    <button type="submit">Delete</button>
    </form></td>

        </tr>
    </c:forEach>
</table>
</body>
</html>

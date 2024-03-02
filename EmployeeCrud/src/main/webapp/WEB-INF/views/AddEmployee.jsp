<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee</title>
<style>
body {
    text-align: center;
    background-color: pink;
}
table {
    margin: auto;
    border-collapse: collapse;
    width: 50%;
}
table, th, td {
    border: 2px solid black;
}
td {
    padding: 8px; 
}
input[type="submit"], input[type="reset"] {
    padding: 8px 16px;
    margin-top: 10px; 
}
</style>
</head>
<body>

<form:form modelAttribute="emp" action="addEmployee" method="get">
    <table>
        <tr>
            <td><form:hidden path="id"/>Add Employee Details</td>
        </tr>
        <tr>
            <td>Name: <form:input path="employeeName" /></td>
        </tr>
        <tr>
            <td>Address: <form:input path="employeeAddress" /></td>
        </tr>
        <tr>
            <td>Salary: <form:input path="employeeSalary" /></td>
        </tr>
        <tr>
            <td>Phone: <form:input path="employeePhone" /></td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Submit"/>
                <input type="reset" value="Reset"/>
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>

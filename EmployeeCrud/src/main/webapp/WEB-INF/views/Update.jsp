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
table, th, td {
    margin: auto;
    border: 2px solid black;
}
</style>
</head>
<body>

<form:form modelAttribute="emp" action="updateEmployee" method="post">
    <table>
        <!-- Hidden field for ID -->
        <tr>
            <td><form:hidden path="id"/></td>
        </tr>
        <!-- Input fields for employee details -->
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
            <td><input type="submit" value="Update"/><input type="reset" value="Reset"/></td>
        </tr>
    </table>
</form:form>

</body>
</html>

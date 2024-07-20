<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Employee</title>
<link rel="stylesheet" href="employee.css">
</head>
<body>
    <%-- Retrieve ID parameter from request --%>
    <%
    String id = (String) request.getParameter("id");
    %>

    <div class="form-container">
        <h1>Edit Employee</h1>
        <form action="editInfo">
            <input type="hidden" name="uid" value="<%=id%>">

            <div class="form-group">
                <label for="uname">Enter Name</label><br>
                <input type="text" id="uname" name="uname" class="form-control">
            </div>

            <div class="form-group">
                <label for="usalary">Enter Salary</label><br>
                <input type="text" id="usalary" name="usalary" class="form-control">
            </div>

            <button type="submit" class="btn btn-info">Update</button>
        </form>
    </div>
</body>
</html>

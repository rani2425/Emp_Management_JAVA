<%@page import="com.Entity.User"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Employee Management</title>
    <link rel="stylesheet" href="employee.css">
</head>
<body>

<div class="container">
    <h2>Employee Management</h2>

    <%
    ArrayList<User> al = (ArrayList<User>) session.getAttribute("alinfo");
    %>

    <% if (al != null) { %>
        <table>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Salary</th>
                    <th>Edit Info</th>
                    <th>Delete Info</th>
                </tr>
            </thead>
            <tbody>
                <% for (User i : al) { %>
                    <tr>
                        <td><%= i.getId() %></td>
                        <td><%= i.getName() %></td>
                        <td><%= i.getSalary() %></td>
                        <td>
                            <a href="update.jsp?id=<%= i.getId() %>">Update</a>
                        </td>
                        <td>
                            <form action="delInfo">
                                <input type="hidden" name="id" value="<%= i.getId() %>">
                                <button class="table-button">Delete</button>
                            </form>
                        </td>
                    </tr>
                <% } %>
            </tbody>
        </table>
    <% } %>

    <div class="add-link">
        <a href="add.html">Add Details</a>
    </div>
</div>

</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" session="true" %>
<!DOCTYPE html>
<html>
<head>
    <title>Success</title>
</head>
<body>
    <h2>Login Successful!</h2>
    <!-- Display logged-in user information or a welcome message -->
    <p>Welcome, <%= session.getAttribute("username") %>!</p>
</body>
</html>

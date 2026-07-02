<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Welcome</title>
  <link rel="stylesheet" href="css/style.css">
</head>
<body>

<%
  // Security: redirect to login if no session exists
  String username = (String) session.getAttribute("username");
  if (username == null) {
    response.sendRedirect("login");
    return;
  }
%>

<div class="welcome-container">
  <div class="welcome-box">
    <div class="success-icon">&#10003;</div>
    <h2>Login Successful!</h2>
    <p>Welcome, <strong><%= username %></strong>!</p>
    <p>You are now logged in to the system.</p>
    <a href="logout" class="btn-logout">Logout</a>
  </div>
</div>

</body>
</html>


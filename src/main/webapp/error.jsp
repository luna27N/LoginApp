
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login Failed</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<div class="error-container">
    <div class="error-box">
        <div class="error-icon">&#10007;</div>
        <h2>Login Failed</h2>

        <%-- Read error message set by LoginServlet --%>
        <% String msg = (String) request.getAttribute("errorMessage"); %>
        <p class="error-text">
            <%= msg != null ? msg : "Invalid credentials." %>
        </p>

        <a href="login" class="btn-back">Try Again</a>
    </div>
</div>

</body>
</html>

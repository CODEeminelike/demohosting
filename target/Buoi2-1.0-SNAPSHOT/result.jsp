<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="model.User" %>

<%
    User user = (User) request.getAttribute("user");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./assets/CSS/ResultStyle.css">
    <title>Survey Result</title>
</head>
<body>
    <div class="container">
        <h1>Survey Result</h1>
        <p><strong>First Name:</strong> <%= user.getFirstName() %></p>
        <p><strong>Last Name:</strong> <%= user.getLastName() %></p>
        <p><strong>Email:</strong> <%= user.getEmail() %></p>
        <p><strong>Date of Birth:</strong> <%= user.getDateOfBirth() %></p>
        <p><strong>How did you hear about us:</strong> <%= user.getHowDidYouHear() %></p>
        <p><strong>Receive Announcements:</strong> <%= user.isReceiveAnnouncements() ? "Yes" : "No" %></p>
        <p><strong>Contact Method:</strong> <%= user.getContactMethod() %></p>
    </div>
</body>
</html>

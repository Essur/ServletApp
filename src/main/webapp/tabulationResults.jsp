<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: teikado
  Date: 10/17/24
  Time: 9:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Tabulation Results</title>
</head>
<body>
<h2>Tabulation Results for y = tan(ln(x))</h2>
<ul>
  <%
    List<String> results = (List<String>) request.getAttribute("results");

    if (results != null) {
      for (String result : results) {
  %>
  <li><%= result %></li>
  <%
    }
  } else {
  %>
  <p>No results found.</p>
  <%
    }
  %>
</ul>

<br>
<a href="tabulation.jsp">Tabulate Again</a><br>
<a href="index.jsp">Back to Series Calculation</a>
</body>
</html>

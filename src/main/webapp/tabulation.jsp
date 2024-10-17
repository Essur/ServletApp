<%--
  Created by IntelliJ IDEA.
  User: teikado
  Date: 10/17/24
  Time: 9:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Function Tabulation</title>
</head>
<body>
<h2>Tabulate Function: y = tan(ln(x))</h2>
<form action="tabulate" method="post">
    <label for="a">Enter start of range (a): </label>
    <input type="text" id="a" name="a"><br><br>

    <label for="b">Enter end of range (b): </label>
    <input type="text" id="b" name="b"><br><br>

    <label for="h">Enter step (h): </label>
    <input type="text" id="h" name="h"><br><br>

    <input type="submit" value="Tabulate">
</form>
<br>
<a href="index.jsp">Back to Series Calculation</a>
</body>
</html>

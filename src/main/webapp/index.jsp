<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Series Calculation</title>
</head>
<body>
<h1>Enter the values to calculate the series</h1>

<form action="series" method="POST">
    <label for="x">Enter x:</label>
    <input type="text" id="x" name="x" required><br><br>

    <label for="n">Enter n (number of terms):</label>
    <input type="text" id="n" name="n" required><br><br>

    <label for="e">Enter e (tolerance):</label>
    <input type="text" id="e" name="e" required><br><br>

    <button type="submit">Calculate</button>
</form>
<br>
<a href="tabulation.jsp">Go to Function Tabulation</a>
</body>
</html>
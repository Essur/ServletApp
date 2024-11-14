<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Tabulation Results</title>
</head>
<body>
<h2>Tabulation Results</h2>
<c:forEach var="result" items="${requestScope.results}">
  <p>${result}</p>
</c:forEach>
</body>
</html>

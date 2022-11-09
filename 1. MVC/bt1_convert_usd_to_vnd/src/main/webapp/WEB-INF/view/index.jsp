<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Convert USD to VND!!!
</h1>
<br/>
<form action="/convert" method="get">
    <lable>USD:
    <input type="number" name="usd" onchange="this.form.submit()">
    </lable>
</form>
<h3>Result: ${result} VND</h3>
</body>
</html>
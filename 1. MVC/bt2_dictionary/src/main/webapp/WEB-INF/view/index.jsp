<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Tra tu dien!!!
</h1>
<br/>
<form action="/dictionary" method="get">
    <lable>Tieng anh:
    <input type="text" name="value" onchange="this.form.submit()">
    </lable>
</form>
<h3>Ket qua: ${result}</h3>
</body>
</html>
<%--
  Created by IntelliJ IDEA.
  User: ThangND
  Date: 03/11/2022
  Time: 4:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form>
    <input type="number" name="num1">
    <span>${calculation}</span>
    <input type="number" name="num2">
    <h2>Result: ${result}</h2>
    <button type="submit" formaction="/calculator/add">+</button>
    <button type="submit" formaction="/calculator/sub">-</button>
    <button type="submit" formaction="/calculator/mul">x</button>
    <button type="submit" formaction="/calculator/div">/</button>
</form>
</body>
</html>

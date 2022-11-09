<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h2>Sandwich Condiments</h2>
<c:forEach var="c" items="${condiments}">
    <p>${c}</p>
</c:forEach>
<c:if test="${condiments == null}">
<form action="/save">
    <label>
        <input type="checkbox" name="condiments" value="Lettuce">Lettuce
    </label>
    <label>
        <input type="checkbox" name="condiments" value="Tomato">Tomato
    </label>
    <label>
        <input type="checkbox" name="condiments" value="Mustard">Mustard
    </label>
    <label>
        <input type="checkbox" name="condiments" value="Sprouts">Sprouts
    </label>
    <br>
    <button type="submit">Save</button>
</form>
</c:if>
<c:if test="${condiments != null}">
    <a href="/save"><button>Back</button></a>
</c:if>
</body>
</html>
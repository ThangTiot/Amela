<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>The World Clock</title>
</head>
<body>
<h2>Current Local Times Around the World</h2>
<h3>Current time in ${city}: <span style="color: red">${date}</span></h3>
<form action="/worldClock">
    <select name="city" onchange="this.form.submit()">
        <option value="Asia/Ha_Noi" selected>Select</option>
        <option value="Asia/Ha_Noi">Ha Noi</option>
        <option value="Singapore">Singapore</option>
        <option value="Asia/Hong_Kong">Hong Kong</option>
        <option value="Asia/Tokyo">Tokyo</option>
        <option value="Europe/London">London</option>
    </select>
</form>
</body>
</html>
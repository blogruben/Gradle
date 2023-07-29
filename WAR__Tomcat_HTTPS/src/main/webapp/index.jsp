<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Hola</title>
</head>

<body>
    <h1>Hola</h1>
    <%
    out.println("<br> El protocolo es: " + request.getScheme());
    out.println("<br> El protocolo es seguro: " + (request.isSecure()?"SI":"NO"));
    %>
</body>

</html>
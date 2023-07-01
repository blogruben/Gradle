<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
    <title>Variable de web.xml</title>
    <%
    ServletContext context = pageContext.getServletContext();
    String env = context.getInitParameter("env");
    out.println("<p>entorno: "+env+"</p>");
    String rutaRelativa = context.getInitParameter("rutaRelativa");
    out.println("<p>rutaRelativa: "+rutaRelativa+"</p>");
    String rutaAbsoluta = context.getInitParameter("rutaAbsoluta");
    out.println("<p>rutaAbsoluta: "+rutaAbsoluta+"</p>");
    %>
</body>
</html>
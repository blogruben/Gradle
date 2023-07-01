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
    String prop1 = context.getInitParameter("myProp1");
    out.println("<p>myProp1: "+prop1+"</p>");
    %>
</body>
</html>
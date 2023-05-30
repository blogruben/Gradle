<%@ page pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>${initParam.app}</title>
</head>
<body>
   <h1>Calcular el numero redondeado</h1>
   <form action="redondear" method="get">
      Número: <input type="text" name="decimal" />
      <input type="submit" />
   </form>
   <c:if test="${!empty param.decimal}">
     ${param.decimal} ${esEntero?'':'no'} es un número entero.<br />
     El número entero más próximo es ${redondeo}     
   </c:if>


   <h1>Calcular el numero factorial</h1>
   <form action="factorial" method="get">
    Número: <input type="text" name="numero" />
    <input type="submit" />
 </form>
 <c:if test="${!empty param.numero}">
  El factorial de ${redondeo} es ${factorial}     
</c:if>

</body>
</html>
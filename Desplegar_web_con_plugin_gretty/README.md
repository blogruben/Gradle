
# Ejecutar

requiere gradle 4.9 y jdk 1.8

1. generar wrapeer -> gradle wrapper 
2. comprobar que la version es la 4.9 -> .\gradlew -v   
3. compilar -> .\gradlew build
4. arrancar servidor (tarea de gretty) -> .\gradlew appStart
5. Ir a  -> http://localhost:8080/calcularPrimo?numero=7
6. Ir a  -> http://localhost:8080/sumar?num1=2&num2=3
7. Salir -> ctrl+C para cerrar jetty


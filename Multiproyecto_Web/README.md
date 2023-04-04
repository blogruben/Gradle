

# Inicio
```
gradle appStart
> 18:18:54 INFO  Jetty 9.2.24.v20180105 started and listening on port 8080
> 18:18:54 INFO   runs at:
> 18:18:54 INFO    http://localhost:8080/
> Task :web:appStart

#pulsamos Ctrol+C para cerrar el servidor
```
Se nos muestra el valor de 'app' del descriptor "web.xml" cada vez que llamamos a un servlet.


# Dependencias de los subproyectos
Cuando lo construimos, vemos como se construyen los distintos proyectos
El proyecto web depende del proyecto negocio.

C:\Users\info\OneDrive\Escritorio\multi-web>gradle build --console=plain
> Task :negocio:compileJava
> Task :negocio:processResources NO-SOURCE
> Task :negocio:classes
> Task :negocio:jar
> Task :negocio:assemble
> Task :negocio:compileTestJava NO-SOURCE
> Task :negocio:processTestResources NO-SOURCE
> Task :negocio:testClasses UP-TO-DATE
> Task :negocio:test NO-SOURCE
> Task :negocio:check UP-TO-DATE
> Task :negocio:build
> Task :web:compileJava
> Task :web:processResources NO-SOURCE
> Task :web:classes
> Task :web:javadoc
> Task :web:war
> Task :web:assemble
> Task :web:compileTestJava NO-SOURCE
> Task :web:processTestResources NO-SOURCE
> Task :web:testClasses UP-TO-DATE
> Task :web:test NO-SOURCE
> Task :web:check UP-TO-DATE
> Task :web:build

> BUILD SUCCESSFUL in 4s


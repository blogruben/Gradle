
# Arrancar servidor 
``gradle``
ctrl+C para cerrar jetty

# Exportar
Exportamos con `gradle buildProduct`
En el directorio `build/output/${project.name}` tenemos el servidor para exportar
lo arrancamos en `start.bat`
el unico requisito es tener el JRE del 6 al 8 

Vamos http://localhost:8080/ 

Documentacion:
https://gretty-gradle-plugin.github.io/gretty-doc/Product-generation.html

# Exportamos Jar con los properties del directorio src/main/resources

Dentro de la aplicacion accedemos al properties con la ruta "src/main/resources" incluimos lo que queramnos que se empaquete dentro del jar por ejemplo una imagen.
Los properties es recomendable dejarlo fuera de jar para poderlo modificar.
Añadimos los recursos del directorio otrosRecursos junto con los de src/main/resources, que se añaden dentro del mismo jar
Guarmos el jar y el properties en un directorio para exportarlo.
Modificamos la tarea "gradle -q run" para que lee el properties.
El properties lo guardaon en src/main/properties



Ejecutar el Jar
```
gradle run

> Task :generarCompilado
>Generado compilado en: App/Exportacion.jar
>Ejecutar con: java -jar App/Exportacion.jar

> Task :run
XInicio.
>/home/ruben/PRIVATE_Gradle_ejemplos_java/Exportar_jar_con_properties_y_recursos/App/ejemplo.properties
>EL directorio de lectura es:  ruta/del/nombre/Del/Directorio/
>El numero de hilos es:  4
```

También lo podemos ejecutar directamente
```
java -jar build/libs/Exportacion.jar
```

Ver contenido del Jar 
```
jar tvf build/libs/Exportacion.jar
```
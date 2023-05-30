1. creamos build.gradle 
```
//el plugin war incluye el plugin java
apply plugin: 'war'
```

1. Creamos el archivo src/main/webapp/index.html con 
```html
<html>
<body>
<h3>Hola Mundo</h3>    
</body>
</html>
```

2. Compilamos
assemble es una tarea anterios a build y compila igual pero sin hace los checks
`gradle assemble`
Vamos a build/libs/hola-mundo-web.war y vemos en contenido del war
```cmd
jar -tf build/libs/Hola_mundo_web.war
> META-INF/
> META-INF/MANIFEST.MF
> index.html
```

3. Desplegamos
(Primero instalamos Tomcat -> ver servidores)
3.1 copiamos el war dentro de webapps de apache
cp build/libs/hola-mundo-web.war <tomcat_dir>/webapps
3.2 ejecutamos servidor
<tomcat_dir>/webapps
3.3 Abrimos/bin/startup.bat
En la ruta Hola_mundo_web es contexto derivado del nombre del war
http://localhost:8080/Hola_mundo_web/index.html
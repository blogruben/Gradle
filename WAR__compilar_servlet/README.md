# Ver la diferencia tiempo de ejecucion y compilacion.

El archivo build.gradle contiene la libreria servlet-api
con nivel providedCompile, solo se añade en tiempo de 
compilacion porque la libreria servlet la tiene el 
contenedor de aplicaciones y si se añade en el ear puede interferir
Por eso usa esta libreria para compilar pero no la añade en la libreria war

1. Compilamos
gradle build
#se genera el build/libs/x.war
2. Vemos que contiene la libreria de matematicas pero no se ha incluido la del servlet
jar -tf build/libs/servlet.war      
> META-INF/
> META-INF/MANIFEST.MF
> WEB-INF/
> WEB-INF/classes/
> WEB-INF/classes/web/
> WEB-INF/classes/web/PrimosServlet.class
> WEB-INF/lib/
> WEB-INF/lib/commons-math3-3.6.1.jar


# E


# Diferencia entre tiempo de ejecucion y de compilacion. 

En el ejemplo Prime se necesita tanto en tiempo de compilacion como ejecucion que es lo normal
StringUtils solo se necesita en tiempo de ejecucion pero no en compilacion porque no se importa.

Un ejemplo de libreria que solo se usa en tiempo de compilacion y no ejecucion , 
es un servlet que se compila y añade en el contenedor de aplicaciones.
No debe de estar en tiempo de ejecucion debido a que puede interferiz con la 
configuracion del contenedor de aplicaciones. 

# Practica

Ver el contenido del manifest
con -p no se extrae solo se muestra
``
unzip -p build/libs/App.jar META-INF/MANIFEST.MF
> Manifest-Version: 1.0
> Implementation-Title: TODO_dependencias_runtime_compilacion
> Implementation-Version: 01.00.00
> Main-Class: simple.App
> Class-Path: librerias/commons-math3-3.6.1.jar librerias/joda-time-2.12.2.jar
``


# Selecionamos el properties dependiendo del idioma en el que estemos

Gradle añade los resources (src/main/resources) como los properties, xml etc
dentro del jar compilado

```cmd
#generar wrapper
gradle wrapVersion

#compilamos
gradlew build

#ejecutamos
gradlew run

```
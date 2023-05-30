# Crear lenguaje DSL como lo es gradle


Domain Specific Languages (DSLs) es un languaje especifico para un contexto concreto.
En este ejemplo creamos un DSL para definir un catalogo de rutas con el lenguaje de java

No tenemos main. En la clase CatalogoRutas tenemos un lenguaje especifico:
```
Ruta RUTA_66 = en(COCHE).de(CHICAGO).a(LOS_ANGELES);
```
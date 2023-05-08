package org.ruben.dsl.domain;

public class CatalogoRutas {

    private Medio medio;
    private Ciudad ciudadOrigen;

    public CatalogoRutas(Medio medio) {
        this.medio = medio;
    }

    public static CatalogoRutas en(Medio medio) {
        return new CatalogoRutas(medio);
    }

    public CatalogoRutas de(Ciudad ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
        return this;
    }

    public Ruta a(Ciudad ciudadDestino) {
        return new Ruta(this.ciudadOrigen, ciudadDestino, this.medio);
    }

}

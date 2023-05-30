package org.ruben.dsl;

import static org.ruben.dsl.domain.Ciudades.MADRID;
import static org.ruben.dsl.domain.Ciudades.PARIS;
import org.ruben.dsl.domain.Ruta;
import static org.ruben.dsl.domain.CatalogoRutas.en;
import static org.ruben.dsl.domain.Medios.COCHE;


public class App {
	public static void main(String[] args) {

		Ruta A3 = en(COCHE).de(MADRID).a(PARIS);
		
	}	
}

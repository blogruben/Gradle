package org.ruben.junit;

public class Calcular {
	/*
	 * Hace lo mismo que Math.round(double decimal);
	 */
	public int redondeo(double decimal) {
		int parteEntera = (int) decimal;
		double parteDecimal = decimal - parteEntera;

		if (parteDecimal < 0.5) {
			return parteEntera;
		} else {
			return parteEntera + 1;
		}
	}
}
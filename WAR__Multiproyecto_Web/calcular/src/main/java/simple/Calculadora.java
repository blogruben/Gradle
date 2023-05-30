package simple;

import org.apache.commons.math3.util.CombinatoricsUtils;

public class Calculadora {

	public int redondeo(double decimal) {
		int parteEntera = (int) decimal;
		double parteDecimal = decimal - parteEntera;

		if (parteDecimal < 0.5) {
			return parteEntera;
		} else {
			return parteEntera + 1;
		}
	}

	public boolean esUnNumeroEntero(double numero) {
		return numero % 1 == 0;
	}

	public long factorial(double decimal) {
		int numero = redondeo(decimal);
		return CombinatoricsUtils.factorial(numero);
	}

	

	
}

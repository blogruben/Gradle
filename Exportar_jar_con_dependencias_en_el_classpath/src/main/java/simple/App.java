package simple;

import org.apache.commons.math3.primes.Primes;

public class App {
	public static void main(String[] args) {

		System.out.println(Primes.isPrime(2003));

		try {
			Class<?> clase = Class.forName("org.apache.commons.lang3.StringUtils");
			System.out.println(clase.getCanonicalName() + " cargada correctamente");
		} catch (ClassNotFoundException e) {
			System.out.println("Error cargando classe :"  + e.getMessage());
		}

	}
}

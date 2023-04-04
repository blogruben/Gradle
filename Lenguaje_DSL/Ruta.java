package dsl;

public class Ruta {

	private Ciudad origen;
	private Ciudad destino;
	private Medio medio;
	
	public Ruta(Ciudad origen, Ciudad destino, Medio medio) {
		this.origen = origen;
		this.destino = destino;
		this.medio = medio;
	}
	public Ciudad getOrigen() {
		return origen;
	}
	public Ciudad getDestino() {
		return destino;
	}
	public Medio getMedio() {
		return medio;
	}
	
	
}

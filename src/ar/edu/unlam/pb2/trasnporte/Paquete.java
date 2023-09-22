package ar.edu.unlam.pb2.trasnporte;

public class Paquete {

	private Double volumen;
	private Double peso;
	private String ciudad;

	public Paquete(Double alto, Double ancho, Double profundo, Double peso, String ciudad) {

		this.volumen = alto * ancho * profundo;
		this.peso = peso;
		this.ciudad = ciudad;
	}

	public Double getVolumen() {
		return this.volumen;

	}

	public Double getPeso() {
		return this.peso;

	}

	public String getCiudad() {
		return this.ciudad;

	}

}

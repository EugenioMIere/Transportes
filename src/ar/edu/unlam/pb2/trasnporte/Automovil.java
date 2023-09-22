package ar.edu.unlam.pb2.trasnporte;

import java.util.ArrayList;

public class Automovil {
	ArrayList<Paquete> paquetes = new ArrayList<Paquete>();
	private String ciudad;
	public Double volumenTotal = 0.00;

	public Boolean cargarPaquete(Paquete paquete1) {

//		if (!destinoCompatible(paquete1.getCiudad())) {
//			return false;
//		}
//
//		if (!cantidadDePaquetesCompatible(paquete1)) {
//			return false;
//		}

		if (!volumenCompatible(paquete1)) {
			return false;
		}

		if (pesoCompatible(paquete1)) {
			paquetes.add(paquete1);
			return true;
		}

		return false;

	}

	private boolean pesoCompatible(Paquete paquete1) {

		return paquete1.getPeso() <= 15.0;
	}

	private boolean volumenCompatible(Paquete paquete1) {

		if (this.volumenTotal + paquete1.getVolumen() <= 2.00) {
			this.volumenTotal = this.volumenTotal + paquete1.getVolumen();
			return true;
		}else {
			return false;
		}
		

	}

//	private boolean cantidadDePaquetesCompatible(Paquete paquete1) {
//
//		return paquetes.size() < 2;
//	}
//
//	private boolean destinoCompatible(String ciudad2) {
//		if (this.ciudad == null) {
//			this.ciudad = ciudad2;
//		}
//		return this.ciudad.equals(ciudad2);
//	}
}

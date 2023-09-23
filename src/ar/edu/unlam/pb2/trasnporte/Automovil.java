package ar.edu.unlam.pb2.trasnporte;


public class Automovil extends Transporte{
	

	public Double volumenTotal = 0.00;
	private Double pesoTotal = 0.00;
	
	@Override
	public Boolean cargarPaquete(Paquete paquete1) {

		if (!destinoCompatible(paquete1)) {
			return false;
		}

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

		if (this.pesoTotal + paquete1.getPeso() < 500.00) {
			this.pesoTotal = this.pesoTotal + paquete1.getPeso();
			return true;
		} else {
			return false;
		}
	}

	public Double getPesoMaximo() {
		return this.pesoTotal;

	}

	private Boolean volumenCompatible(Paquete paquete1) {

		if (this.volumenTotal + paquete1.getVolumen() <= 2.00) {
			this.volumenTotal = this.volumenTotal + paquete1.getVolumen();
			return true;
		} else {
			return false;
		}

	}

	private Boolean destinoCompatible(Paquete paquete1) {

		if (this.paquetes.size() < 3) {
			for (Paquete paquete : paquetes) {
				if (paquete.getCiudad().equals(paquete1.getCiudad())) {
					return false;
				}

			}
			return true;
		}

		return false;
	}
}

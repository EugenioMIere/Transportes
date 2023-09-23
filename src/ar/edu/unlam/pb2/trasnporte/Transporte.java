package ar.edu.unlam.pb2.trasnporte;

import java.util.ArrayList;

public abstract class Transporte {
	
	public ArrayList<Paquete> paquetes = new ArrayList<Paquete>();
	
	public abstract Boolean cargarPaquete(Paquete paquete1);
	
	
}

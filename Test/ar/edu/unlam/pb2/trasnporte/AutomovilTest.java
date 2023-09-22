package ar.edu.unlam.pb2.trasnporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class AutomovilTest {

	@Test
	public void queNoSePuedaExcederElVolumenMaximo() {
		Automovil auto = new Automovil();
		Paquete paquete1 = new Paquete(1.00, 1.00, 1.00, 1.0, "Caseros");
		Paquete paquete2 = new Paquete(1.100, 1.00, 1.10, 1.0, "Caseros");
		

		auto.cargarPaquete(paquete1);
		
		
		 

		assertFalse(auto.cargarPaquete(paquete2));

	}

	@Test
	public void queSeRespeteElPesoMaximo() {
		Automovil auto = new Automovil();
		Paquete paquete1 = new Paquete(0.50, 0.50, 0.50, 10.0, "Caseros");

		Boolean estadoDeCarga = auto.cargarPaquete(paquete1);

		assertTrue(estadoDeCarga);

	}

	@Test
	public void quePermitaVisitarHastaTresCiudadesSinRepetir() {
		Automovil auto = new Automovil();

		Paquete paquete1 = new Paquete(0.50, 0.50, 0.50, 10.0, "Caseros");
		Paquete paquete2 = new Paquete(0.50, 0.50, 0.50, 9.0, "Ciudadela");

		auto.cargarPaquete(paquete1);
		assertFalse(auto.cargarPaquete(paquete2));

	}

}

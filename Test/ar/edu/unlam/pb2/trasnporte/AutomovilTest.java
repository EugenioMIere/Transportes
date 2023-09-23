package ar.edu.unlam.pb2.trasnporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class AutomovilTest {

	@Test
	public void queNoSePuedaExcederElVolumenMaximo() {
		Automovil auto = new Automovil();
		Paquete paquete1 = new Paquete(1.00, 1.00, 1.00, 1.0, "Caseros");
		Paquete paquete3 = new Paquete(0.10, 0.10, 0.10, 9.0, "Haedo");
		Paquete paquete2 = new Paquete(1.00, 1.00, 1.00, 1.0, "Caseros");

		auto.cargarPaquete(paquete3);

		assertTrue(auto.cargarPaquete(paquete1));

		assertFalse(auto.cargarPaquete(paquete2));

	}

	@Test
	public void queSeRespeteElPesoMaximo() {
		Automovil auto = new Automovil();
		Paquete paquete1 = new Paquete(1.00, 1.00, 1.00, 250.00, "Caseros");
		Paquete paquete2 = new Paquete(0.100, 1.00, 1.00, 251.00, "Caseros");

		auto.cargarPaquete(paquete1);

		assertFalse(auto.cargarPaquete(paquete2));
		assertEquals(auto.getPesoMaximo(), 250.00, 0.01);

	}

	@Test
	public void quePermitaVisitarHastaTresCiudadesSinRepetir() {
		Automovil auto = new Automovil();

		Paquete paquete1 = new Paquete(0.10, 0.10, 0.10, 9.0, "Caseros");
		Paquete paquete2 = new Paquete(0.10, 0.10, 0.10, 9.0, "Ciudadela");
		Paquete paquete3 = new Paquete(0.10, 0.10, 0.10, 9.0, "Haedo");
		Paquete paquete4 = new Paquete(0.10, 0.10, 0.10, 9.0, "Moron");

		assertTrue(auto.cargarPaquete(paquete1));
		assertTrue(auto.cargarPaquete(paquete2));
		assertTrue(auto.cargarPaquete(paquete3));

		assertFalse(auto.cargarPaquete(paquete4));

	}

}

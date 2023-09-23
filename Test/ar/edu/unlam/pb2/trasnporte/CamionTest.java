package ar.edu.unlam.pb2.trasnporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class CamionTest {

	@Test
	public void queNoSePuedaExcederElVolumenMaximo() {
		Camion camion = new Camion();
		Paquete paquete1 = new Paquete(3.00, 1.00, 1.00, 1.0, "Caseros");
		Paquete paquete2 = new Paquete(12.00, 1.00, 1.00, 9.0, "Haedo");
		Paquete paquete3 = new Paquete(10.100, 1.00, 1.00, 1.0, "Caseros");

		camion.cargarPaquete(paquete1);

		assertTrue(camion.cargarPaquete(paquete2));

		assertFalse(camion.cargarPaquete(paquete3));

	}

	@Test
	public void queSeRespeteElPesoMaximo() {
		Camion camion = new Camion();
		Paquete paquete1 = new Paquete(1.00, 1.00, 1.00, 8000.00, "Caseros");
		Paquete paquete2 = new Paquete(0.100, 1.00, 1.00, 8001.00, "Caseros");

		camion.cargarPaquete(paquete1);

		assertEquals(camion.getPesoMaximo(), 8000.00, 0.01);
		assertFalse(camion.cargarPaquete(paquete2));

	}

	@Test
	public void quePermitaVisitarCiudadesNecesarias() {
		Camion camion = new Camion();

		Paquete paquete1 = new Paquete(0.10, 0.10, 0.10, 9.0, "Caseros");
		Paquete paquete2 = new Paquete(0.10, 0.10, 0.10, 9.0, "Ciudadela");
		Paquete paquete3 = new Paquete(0.10, 0.10, 0.10, 9.0, "Haedo");
		Paquete paquete4 = new Paquete(0.10, 0.10, 0.10, 9.0, "Moron");

		assertTrue(camion.cargarPaquete(paquete1));
		assertTrue(camion.cargarPaquete(paquete2));
		assertTrue(camion.cargarPaquete(paquete3));

		assertTrue(camion.cargarPaquete(paquete4));

	}

}

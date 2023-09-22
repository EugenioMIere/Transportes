package ar.edu.unlam.pb2.trasnporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class BicicletaTest {

	@Test
	public void queSePuedaCargarPaqueteQueTenganMenosDelVolumenMaximo() {
		Bicicleta bici = new Bicicleta();
		Paquete paquete1 = new Paquete(0.50, 0.50 ,0.50, 10.0,"Caseros");
		
		Boolean estadoDeCarga = bici.cargarPaquete(paquete1);
		
		assertTrue(estadoDeCarga);

	}
	
	@Test
	public void queSePuedaCargarPaqueteQueTenganMenosDelPesoMaximo() {
		Bicicleta bici = new Bicicleta();
		Paquete paquete1 = new Paquete(0.50, 0.50 ,0.50, 10.0,"Caseros");
		
		
		Boolean estadoDeCarga = bici.cargarPaquete(paquete1);
		
		assertTrue(estadoDeCarga);

	}
	
	@Test
	public void queLaCargaTengaUnMaximoDeDosUnidades() {
		Bicicleta bici = new Bicicleta();
		
		Paquete paquete1 = new Paquete(0.50, 0.50 ,0.50, 10.0,"Caseros");
		Paquete paquete2 = new Paquete(0.50, 0.50 ,0.50, 9.0,"Caseros");
		
		bici.cargarPaquete(paquete1);
		assertTrue(bici.cargarPaquete(paquete2));

	}
	
	
	@Test
	public void queNoSePuedaCargarPaquetesDeCiudadesDiferentes() {
		Bicicleta bici = new Bicicleta();
		
		Paquete paquete1 = new Paquete(0.50, 0.50 ,0.50, 10.0,"Caseros");
		Paquete paquete2 = new Paquete(0.50, 0.50 ,0.50, 9.0,"Ciudadela");
		
		bici.cargarPaquete(paquete1);
		assertFalse(bici.cargarPaquete(paquete2));

	}
}

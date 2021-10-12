package tesCases;

import static org.junit.Assert.*;

import org.junit.Test;

import gestionVuelos.Avion;
import gestionVuelos.Pasajero;
import gestionVuelos.Vuelo;

public class TestVuelo {
	
	@Test
	public void queElVueloTengaLosDatosDelAvionYDelMismoVuelo() {
		String destino = "Sydey";
		Double precioBase = 100.4;
		
		Avion miAvion = new Avion("Boeing 737", 200);
		Vuelo vuelo = new Vuelo(1234, destino, miAvion, precioBase);
		
		assertEquals(vuelo.getAvion(), miAvion);
		assertEquals(vuelo.getDestino(), destino);
		assertEquals(vuelo.getPrecioBase(), precioBase);
	}
	
	@Test
	public void queLaCantidadDePasajerosIniciaEn0() {
		Avion miAvion = new Avion("Boeing 737", 200);
		Vuelo vuelo = new Vuelo(1234, "Sydey", miAvion, 100.4);
		Integer capacidadDisponible = vuelo.obtenerCantidadDePasajeros();
		assertTrue(capacidadDisponible == 0);
	}

	@Test
	public void queVerifiqueQueHayAsientoDisponible() {
		Avion miAvion = new Avion("Boeing 737", 200);
		Vuelo miVuelo = new Vuelo(1234, "Sydey", miAvion, 100.4);
		Integer cantidadDeAsientos = miVuelo.getCantidadDeAsientosDisponibles();
		assertTrue(cantidadDeAsientos > 0);
	}

	@Test
	public void queMeVerifiqueQueNoHayAsientoDisponible() {
		Avion avion = new Avion("Boeing 123", 1);
		Vuelo miVueloLleno = new Vuelo(4567, "Sydney", avion, 100.4);
		miVueloLleno.insertarPasajero(new Pasajero("Juan", "Perez", 12345678));
		Integer cantidadDeAsientos = miVueloLleno.getCantidadDeAsientosDisponibles();
		assertTrue(cantidadDeAsientos == 0);
	}

}

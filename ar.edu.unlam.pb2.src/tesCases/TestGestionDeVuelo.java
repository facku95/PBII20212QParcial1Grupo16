package tesCases;

import static org.junit.Assert.*;

import org.junit.Test;

import gestionVuelos.Avion;
import gestionVuelos.Pasajero;
import gestionVuelos.Vuelo;

public class TestGestionDeVuelo {

	Avion miAvion = new Avion("Boeing 737", 200);
	Pasajero[] misPasajeros = { new Pasajero("Juan", "Perez", 12345678) };
	Vuelo miVuelo = new Vuelo(1234, 200, 198, misPasajeros, "Sydey", miAvion);

	@Test
	public void test01_queMeVerifiSiLaCapacidadDelAvionCoincideConLaCapacidadDelVuelo() {
		Vuelo vuelo = new Vuelo(1234, 199, 198, misPasajeros, "Sydey", miAvion);
		Boolean resultadoEsperado = true;
		Boolean capacidadDisponible = vuelo.verificarCapacidadAvionDelVuelo(miAvion);

		assertEquals(resultadoEsperado, capacidadDisponible);
	}

	@Test
	public void test02_queVerifiqueQueHayAsientoDisponible() {
		Pasajero nuevoPasajero = new Pasajero("Natalia", "Perez", 87654321);
		Boolean valorEsperado = true;
		Boolean seVerificaCompra = miVuelo.verificarDisponibilidadAsientoDelVuelo(miAvion, nuevoPasajero);

		assertEquals(valorEsperado, seVerificaCompra);
	}

	@Test
	public void test03_queMeVerifiqueQueNoHayAsientoDisponible() {
		Avion avion = new Avion("Boeing 123", 1);
		Vuelo miVueloLleno = new Vuelo(4567, 1, 1, misPasajeros, "Sydney", avion);
		Boolean vueloDisponible = false;
		Boolean asientoNoDisponible = miVueloLleno.verificarCapacidadAvionDelVuelo(avion);

		assertEquals(vueloDisponible, asientoNoDisponible);
	}
	
// Este metodo me permitiria conocer si puedo registrar un vuelo con determinado avion
	@Test
	public void test04_queVeriqueQueLaCapacidadDelAvionNoCoincideConLaDelVuelo() {
		Vuelo vuelo = new Vuelo(1234, 201, 198, misPasajeros, "Sydey", miAvion);
		Boolean valorEsperado = false;
		Boolean capacidadDisponible = vuelo.verificarCapacidadAvionDelVuelo(miAvion);
		
		assertEquals(valorEsperado, capacidadDisponible);
	}
}

package tesCases;

import static org.junit.Assert.*;

import org.junit.Test;

import gestionVuelos.Aerolinea;
import gestionVuelos.Avion;
import gestionVuelos.Boletos;
import gestionVuelos.ClaseBusiness;
import gestionVuelos.Pasajero;
import gestionVuelos.TipoBoleto;
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
	
	@Test
	public void test05_queValideTipoDeBoletoClaseBusiness() {
		Aerolinea aerolinea = new Aerolinea("Flybondi", 372453672);
		Pasajero pasajero = new Pasajero("Rodrigo", "Rodriguez", 21345678);
		Pasajero[] arrPasajero = {pasajero};
		Avion avion = new Avion("Boeing 11", 60);
		Vuelo vuelo = new Vuelo(011, 60, 23, misPasajeros, "Mendoza", avion);
		ClaseBusiness boleto = new ClaseBusiness(101, 05, 20399.00, "Mendoza", aerolinea, pasajero, avion, vuelo,TipoBoleto.BUSINESS,2);
		TipoBoleto tipoBoletoEsperado = TipoBoleto.BUSINESS;
		
		assertEquals(tipoBoletoEsperado, boleto.getTipoBoleto());
		
	}
	@Test
	public void test06_queCalculeElPrecioDelBoletoBusiness() {
		Aerolinea aerolinea = new Aerolinea("Flybondi", 372453672);
		Pasajero pasajero = new Pasajero("Rodrigo", "Rodriguez", 21345678);
		Pasajero[] arrPasajero = {pasajero};
		Avion avion = new Avion("Boeing 11", 60);
		Vuelo vuelo = new Vuelo(011, 60, 23, misPasajeros, "Mendoza", avion);
		ClaseBusiness boletoBusiness = new ClaseBusiness(101, 05, 20399.00, "Mendoza", aerolinea, pasajero, avion, vuelo,TipoBoleto.BUSINESS,2);
		
		double precioEsperado = 20399.00 * 1.25;
		double precioCalculado = boletoBusiness.calcularPrecioBoleto();
		
		assertEquals(precioEsperado, precioCalculado,2);
		System.out.println(boletoBusiness);
	}
	
	public void test() {
		
	}
}

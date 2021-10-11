package tesCases;

import static org.junit.Assert.*;

import org.junit.Test;

import gestionVuelos.Aerolinea;
import gestionVuelos.Avion;
import gestionVuelos.Business;
import gestionVuelos.Economica;
import gestionVuelos.Pasajero;
import gestionVuelos.PrimeraClase;
import gestionVuelos.TipoBoleto;
import gestionVuelos.Vuelo;

public class TestGestionDeVuelo {
	Aerolinea aerolinea = new Aerolinea("Flybondi", 372453672);
	Avion miAvion = new Avion("Boeing 737", 200);
	Pasajero[] misPasajeros = { new Pasajero("Juan", "Perez", 12345678) };
	Vuelo miVuelo = new Vuelo(1234, "Sydey", miAvion);

	@Test
	public void test01_queMeVerifiSiLaCapacidadDelAvionCoincideConLaCapacidadDelVuelo() {
		Vuelo vuelo = new Vuelo(1234, "Sydey", miAvion);
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
		Vuelo miVueloLleno = new Vuelo(4567, "Sydney", avion);
		Boolean vueloDisponible = false;
		Boolean asientoNoDisponible = miVueloLleno.verificarCapacidadAvionDelVuelo(avion);

		assertEquals(vueloDisponible, asientoNoDisponible);
	}

// Este metodo me permitiria conocer si puedo registrar un vuelo con determinado avion
	@Test
	public void test04_queVeriqueQueLaCapacidadDelAvionNoCoincideConLaDelVuelo() {
		Vuelo vuelo = new Vuelo(1234, "Sydey", miAvion);
		Boolean valorEsperado = false;
		Boolean capacidadDisponible = vuelo.verificarCapacidadAvionDelVuelo(miAvion);

		assertEquals(valorEsperado, capacidadDisponible);
	}

	@Test
	public void test05_queValideTipoDeBoletoClaseBusiness() {
		Aerolinea aerolinea = new Aerolinea("Flybondi", 372453672);
		Pasajero pasajero = new Pasajero("Rodrigo", "Rodriguez", 21345678);
		Avion avion = new Avion("Boeing 11", 60);
		Vuelo vuelo = new Vuelo(011, "Mendoza", avion);
		Business boleto = new Business(101, 05, 20399.00, "Mendoza", aerolinea, pasajero, avion, vuelo,
				TipoBoleto.BUSINESS, 2);
		TipoBoleto tipoBoletoEsperado = TipoBoleto.BUSINESS;

		assertEquals(tipoBoletoEsperado, boleto.getTipoBoleto());

	}

	@Test
	public void test06_queCalculeElPrecioDelBoletoBusiness() {
		Aerolinea aerolinea = new Aerolinea("Flybondi", 372453672);
		Pasajero pasajero = new Pasajero("Rodrigo", "Rodriguez", 21345678);
		Avion avion = new Avion("Boeing 11", 60);
		Vuelo vuelo = new Vuelo(011, "Mendoza", avion);
		Business boletoBusiness = new Business(101, 05, 20399.00, "Mendoza", aerolinea, pasajero, avion,
				vuelo, TipoBoleto.BUSINESS, 2);

		double precioEsperado = 20399.00 * 1.25;
		double precioCalculado = boletoBusiness.calcularPrecioBoleto();

		assertEquals(precioEsperado, precioCalculado, 2);
		
	}
	@Test
	public void test07_queValideTipoDeBoletoPrimerClase() {
//		Aerolinea aerolinea = new Aerolinea("Flybondi", 372453672);
		Pasajero pasajero = new Pasajero("Alejandra", "Rodriguez", 38345678);
		Avion avion = new Avion("Boeing 11", 60);
		Vuelo vuelo = new Vuelo(011, "Mendoza", avion);
		PrimeraClase boletoPrimeraClase = new PrimeraClase(101, 05, 20399.00, "Mendoza", aerolinea, avion, vuelo,
				TipoBoleto.PRIMERA_CLASE, pasajero, 2, 1);
		TipoBoleto tipoBoletoPrimera = TipoBoleto.PRIMERA_CLASE;

		assertEquals(tipoBoletoPrimera, boletoPrimeraClase.getTipoBoleto());
	}
	@Test
	public void test08_queCalculeElPrecioDeBoletoPrimeraClase() {		
		Pasajero pasajero = new Pasajero("Alejandra", "Rodriguez", 38345678);
		Avion avion = new Avion("Boeing 11", 60);
		Vuelo vuelo = new Vuelo(011, "Mendoza", avion);
		PrimeraClase boletoPrimeraClase = new PrimeraClase(101, 05, 20399.00, "Mendoza", aerolinea, avion, vuelo,TipoBoleto.PRIMERA_CLASE, pasajero, 2, 1);
		
		double precioEsperado = (20399.00 * 1.25) + 20399.00;
		double precioCalculado = boletoPrimeraClase.calcularPrecioBoleto();
		
		assertEquals(precioEsperado, precioCalculado,2);
		System.out.println(boletoPrimeraClase);
	}
	
	@Test
	public void test09_queValideTipoDeBoletoEconomico() {
		Pasajero pasajero = new Pasajero("Axel", "Perez", 39345678);
		Economica boletoEconomico = new Economica(987, 38, 235000.99, "Milan",aerolinea,pasajero, miAvion, miVuelo, TipoBoleto.ECONOMICO, "Valija de mano");
		
		TipoBoleto boletoEco = TipoBoleto.ECONOMICO;
		
		assertEquals(boletoEco, boletoEconomico.getTipoBoleto());
	}
	@Test
	public void test10_queCalculeElPrecioDeBoletoEconomicoSiSuperaMonto() {
		Pasajero pasajero = new Pasajero("Axel", "Perez", 39345678);
		Economica boletoEconomico = new Economica(987, 38, 235000.99, "Milan",aerolinea,pasajero, miAvion, miVuelo, TipoBoleto.ECONOMICO, "Valija de mano");
		
		double precioEsperado = 235000.99 - (235000.99 * 0.1);
		double precioCalculado = boletoEconomico.calcularPrecioBoleto();
		
		assertEquals(precioEsperado, precioCalculado,2);
	}
	
	@Test
	public void test11_queCalculeElPrecioDeBoletoEconomicoSiNOSuperaMonto() {
		Pasajero pasajero = new Pasajero("Axel", "Perez", 39345678);
		Economica boletoEconomico = new Economica(988, 38, 24999.87, "Salta",aerolinea,pasajero, miAvion, miVuelo, TipoBoleto.ECONOMICO, "Valija de mano");
		
		double precioEsperado = 24999.87 * 1.05;
		double precioCalculado = boletoEconomico.calcularPrecioBoleto();
		
		assertEquals(precioEsperado, precioCalculado,2);
	}
}

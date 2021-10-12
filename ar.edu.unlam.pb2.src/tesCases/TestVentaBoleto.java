package tesCases;

import static org.junit.Assert.*;

import org.junit.Test;

import gestionVuelos.Aerolinea;
import gestionVuelos.Avion;
import gestionVuelos.Pasajero;
import gestionVuelos.TipoBoleto;
import gestionVuelos.VentaDeBoleto;
import gestionVuelos.Vuelo;

public class TestVentaBoleto {

		@Test
		public void queLosBoletosTenganTodosLosDatosDelVueloAerolineaYPasajero() {
			Avion miAvion = new Avion("Boeing 737", 200);
			Vuelo miVuelo = new Vuelo(1234, "Sydey", miAvion, 100.4);
			Aerolinea aerolinea = new Aerolinea("Aerolineas Argentinas", 102938);
			Pasajero pasajero = new Pasajero("Juan", "Perez", 12345678);
			TipoBoleto tipoBoleto = TipoBoleto.BUSINESS;
			VentaDeBoleto ventaBoleto = new VentaDeBoleto(miVuelo, aerolinea, pasajero, tipoBoleto);
			
			assertEquals(miVuelo, ventaBoleto.getVuelo());
			assertEquals(pasajero, ventaBoleto.getBoleto().getPasajero());
			assertEquals(miAvion, ventaBoleto.getBoleto().getAvion());
			assertEquals(aerolinea, ventaBoleto.getBoleto().getAerolinea());
			assertEquals(tipoBoleto, ventaBoleto.getBoleto().getTipoBoleto());
		}
	
		@Test
		public void queCalculeElPrecioDeBoletoEconomicoSiNOSuperaMonto() {
			Avion miAvion = new Avion("Boeing 737", 200);
			double precioBoleto = 24999.87;
			Vuelo miVuelo = new Vuelo(1234, "Sydey", miAvion, precioBoleto);
			Aerolinea aerolinea = new Aerolinea("Aerolineas Argentinas", 102938);
			Pasajero pasajero = new Pasajero("Juan", "Perez", 12345678);
			TipoBoleto tipoBoleto = TipoBoleto.ECONOMICO;
			VentaDeBoleto ventaBoleto = new VentaDeBoleto(miVuelo, aerolinea, pasajero, tipoBoleto);
			
			double precioEsperado = precioBoleto * 1.05;
			double precioCalculado = ventaBoleto.getBoleto().calcularPrecioBoleto();

			assertEquals(precioEsperado, precioCalculado,2);
		}
		
		@Test
		public void queCalculeElPrecioDeBoletoEconomicoSiSuperaMonto() {
			Avion miAvion = new Avion("Boeing 737", 200);
			double precioBoleto = 235000.99;
			Vuelo miVuelo = new Vuelo(1234, "Sydey", miAvion, precioBoleto);
			Aerolinea aerolinea = new Aerolinea("Aerolineas Argentinas", 102938);
			Pasajero pasajero = new Pasajero("Juan", "Perez", 12345678);
			TipoBoleto tipoBoleto = TipoBoleto.ECONOMICO;
			VentaDeBoleto ventaBoleto = new VentaDeBoleto(miVuelo, aerolinea, pasajero, tipoBoleto);
			
			double precioEsperado = precioBoleto - (precioBoleto * 0.1);
			double precioCalculado = ventaBoleto.getBoleto().calcularPrecioBoleto();
			
			assertEquals(precioEsperado, precioCalculado,2);
		}
		
		@Test
		public void queCalculeElPrecioDeBoletoPrimeraClase() {		
			Avion miAvion = new Avion("Boeing 737", 200);
			double precioBoleto = 20399.00;
			Vuelo miVuelo = new Vuelo(1234, "Sydey", miAvion, precioBoleto);
			Aerolinea aerolinea = new Aerolinea("Aerolineas Argentinas", 102938);
			Pasajero pasajero = new Pasajero("Juan", "Perez", 12345678);
			TipoBoleto tipoBoleto = TipoBoleto.PRIMERA_CLASE;
			VentaDeBoleto ventaBoleto = new VentaDeBoleto(miVuelo, aerolinea, pasajero, tipoBoleto);
			
			double precioEsperado = (20399.00 * 1.25) + 20399.00;
			double precioCalculado = ventaBoleto.getBoleto().calcularPrecioBoleto();
			
			assertEquals(precioEsperado, precioCalculado,2);
		}
		
		@Test
		public void queCalculeElPrecioDeBoletoBusiness() {
			Avion miAvion = new Avion("Boeing 737", 200);
			double precioBoleto = 24999.87;
			Vuelo miVuelo = new Vuelo(1234, "Sydey", miAvion, precioBoleto);
			Aerolinea aerolinea = new Aerolinea("Aerolineas Argentinas", 102938);
			Pasajero pasajero = new Pasajero("Juan", "Perez", 12345678);
			TipoBoleto tipoBoleto = TipoBoleto.BUSINESS;
			VentaDeBoleto ventaBoleto = new VentaDeBoleto(miVuelo, aerolinea, pasajero, tipoBoleto);
			
			double precioEsperado = precioBoleto * 1.25;
			double precioCalculado = ventaBoleto.getBoleto().calcularPrecioBoleto();
			
			assertEquals(precioEsperado, precioCalculado,2);
		}
}

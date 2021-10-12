package gestionVuelos;

public class VentaDeBoleto {
	private Vuelo vuelo;
	private Boleto boleto;
	
	public VentaDeBoleto(Vuelo vuelo, Aerolinea aerolinea, Pasajero pasajero, TipoBoleto tipoDePasaje) {
		this.vuelo = vuelo;
		if(tipoDePasaje.equals(TipoBoleto.ECONOMICO))
			this.boleto = new Economica(vuelo.getPrecioBase(), vuelo.getDestino(), aerolinea, pasajero, vuelo, tipoDePasaje);
		else if(tipoDePasaje.equals(TipoBoleto.PRIMERA_CLASE))
			this.boleto = new PrimeraClase(vuelo.getPrecioBase(), vuelo.getDestino(), aerolinea, vuelo, tipoDePasaje, pasajero);
		else if(tipoDePasaje.equals(TipoBoleto.BUSINESS))
			this.boleto = new Business(vuelo.getPrecioBase(), vuelo.getDestino(), aerolinea, pasajero, vuelo, tipoDePasaje);
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}

	public Boleto getBoleto() {
		return boleto;
	}

	public void setBoleto(Boleto boleto) {
		this.boleto = boleto;
	}
	
}

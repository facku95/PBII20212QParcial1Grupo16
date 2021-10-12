package gestionVuelos;

public abstract class Boleto {
	private Double precio;
	private String destino;
	private Aerolinea aerolinea;
	private Pasajero pasajero;
	private Avion avion;
	private Vuelo vuelo;
	private TipoBoleto tipoBoleto;

	public Boleto(Double precio, String destino, Aerolinea aerolinea, Pasajero pasajero, Vuelo vuelo, TipoBoleto tipoBoleto) {
		this.precio = precio;
		this.destino = destino;
		this.aerolinea = aerolinea;
		this.pasajero = pasajero;
		this.avion = vuelo.getAvion();
		this.vuelo = vuelo;
		this.tipoBoleto = tipoBoleto;
	}
	
	public abstract double calcularPrecioBoleto();

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Aerolinea getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}

	public TipoBoleto getTipoBoleto() {
		return tipoBoleto;
	}

	public void setTipoBoleto(TipoBoleto tipoBoleto) {
		this.tipoBoleto = tipoBoleto;
	}
	
	@Override
	public String toString() {
		return "Tipo Boleto: "+tipoBoleto+ " Destino: "+destino+ " Aerolinea: "+aerolinea +" Pasajero: "+ pasajero.getNombre()+" "+ pasajero.getApellido()+" "+ pasajero.getDni();
	}
}

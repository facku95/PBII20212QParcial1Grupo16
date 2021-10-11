package gestionVuelos;

public class Boletos {
	private Integer id, asiento;
	private Double precio;
	private String destino;
	private Aerolinea aerolinea;
	private Pasajero pasajero;
	private Avion avion;
	private Vuelo vuelo;

	public Boletos(Integer id, Integer asiento, Double precio, String destino, Aerolinea aerolinea, Pasajero pasajero,
			Avion avion, Vuelo vuelo) {
		this.id = id;
		this.asiento = asiento;
		this.precio = precio;
		this.destino = destino;
		this.aerolinea = aerolinea;
		this.pasajero = pasajero;
		this.avion = avion;
		this.vuelo = vuelo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAsiento() {
		return asiento;
	}

	public void setAsiento(Integer asiento) {
		this.asiento = asiento;
	}

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

}

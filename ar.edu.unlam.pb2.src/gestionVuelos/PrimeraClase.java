package gestionVuelos;

public class PrimeraClase extends Boletos {
	private Integer cantidad_bebidas, cantidad_comidas;

	public PrimeraClase(Integer id, Integer asiento, Double precio, String destino, Aerolinea aerolinea, Avion avion,
			Vuelo vuelo,TipoBoleto tipoBoleto, Pasajero pasajero, Integer bebidas, Integer comidas) {
		super(id, asiento, precio, destino, aerolinea, pasajero, avion, vuelo, tipoBoleto);
		this.cantidad_bebidas = bebidas;
		this.cantidad_comidas = comidas;
	}

	public Integer getCantidad_trago() {
		return cantidad_bebidas;
	}

	public void setCantidad_trago(Integer cantidad_trago) {
		this.cantidad_bebidas = cantidad_trago;
	}

	public Integer getCantidad_comidas() {
		return cantidad_comidas;
	}

	public void setCantidad_comidas(Integer cantidad_comidas) {
		this.cantidad_comidas = cantidad_comidas;
	}

}

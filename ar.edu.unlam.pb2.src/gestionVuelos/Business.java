package gestionVuelos;

public class Business extends Boletos {
	private Integer cantidad_bebidas;

	public Business(Integer id, Integer asiento, Double precio, String destino, Aerolinea aerolinea,
			Pasajero pasajero, Avion avion, Vuelo vuelo, TipoBoleto tipoBoleto, Integer cantBebidas) {
		super(id, asiento, precio, destino, aerolinea, pasajero, avion, vuelo, tipoBoleto);
		this.cantidad_bebidas = cantBebidas;
		setTipoBoleto(TipoBoleto.BUSINESS);
	}

	public Integer getCantidad_bebidas() {
		return cantidad_bebidas;
	}

	public void setCantidad_bebidas(Integer cantidad_bebidas) {
		this.cantidad_bebidas = cantidad_bebidas;
	}
	
	@Override
	public double calcularPrecioBoleto() {
		double precioBoleto = super.getPrecio() * 1.25;	
		return precioBoleto;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Precio Business: "+ calcularPrecioBoleto();
	}

}

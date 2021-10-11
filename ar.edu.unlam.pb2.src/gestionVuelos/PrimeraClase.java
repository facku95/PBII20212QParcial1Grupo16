package gestionVuelos;

public class PrimeraClase extends Boletos {
	private Integer cantidad_bebidas, cantidad_comidas;
	private double tasasEImpuestos;

	public PrimeraClase(Integer id, Integer asiento, Double precio, String destino, Aerolinea aerolinea, Avion avion,
			Vuelo vuelo,TipoBoleto tipoBoleto, Pasajero pasajero, Integer bebidas, Integer comidas) {
		super(id, asiento, precio, destino, aerolinea, pasajero, avion, vuelo, tipoBoleto);
		this.cantidad_bebidas = bebidas;
		this.cantidad_comidas = comidas;
		setTipoBoleto(TipoBoleto.PRIMERA_CLASE);
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

	public static double calculoTasaEImpuesto(Double precioBase) {
		double precioTasa = precioBase * 1.25;
		return precioTasa;
	}
	
	public double getTasasEImpuestos() {
		return tasasEImpuestos;
	}

	public void setTasasEImpuestos(double tasasEImpuestos) {
		this.tasasEImpuestos = tasasEImpuestos;
	}

	@Override
	public double calcularPrecioBoleto() {
		double precioBoleto = super.getPrecio() + calculoTasaEImpuesto(getPrecio());
		return precioBoleto;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Precio Primera Clase: "+ calcularPrecioBoleto();
	}
}

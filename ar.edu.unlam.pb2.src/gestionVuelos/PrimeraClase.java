package gestionVuelos;

public class PrimeraClase extends Boleto {
	private double tasasEImpuestos;

	public PrimeraClase(Double precio, String destino, Aerolinea aerolinea,
			Vuelo vuelo,TipoBoleto tipoBoleto, Pasajero pasajero) {
		super( precio, destino, aerolinea, pasajero,  vuelo, tipoBoleto);
		setTipoBoleto(TipoBoleto.PRIMERA_CLASE);
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

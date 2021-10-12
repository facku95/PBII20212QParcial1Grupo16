package gestionVuelos;

public class Business extends Boleto {

	public Business( Double precio, String destino, Aerolinea aerolinea,
			Pasajero pasajero,Vuelo vuelo, TipoBoleto tipoBoleto) {
		super( precio, destino, aerolinea, pasajero, vuelo, tipoBoleto);
		setTipoBoleto(TipoBoleto.BUSINESS);
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

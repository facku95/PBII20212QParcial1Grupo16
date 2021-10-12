package gestionVuelos;

public class Economica extends Boleto {
	private String tipoValija;
	
	public Economica(Double precio, String destino, Aerolinea aerolinea, Pasajero pasajero, Vuelo vuelo, TipoBoleto tipoBoleto) {
		super(precio, destino, aerolinea, pasajero, vuelo, tipoBoleto);
		setTipoBoleto(TipoBoleto.ECONOMICO);
	}

	public String getTipoValija() {
		return tipoValija;
	}

	public void setTipoValija() {
		this.tipoValija = "Valija de mano";
	}

	@Override
	public double calcularPrecioBoleto() {
		double precioEco = getPrecio() * 1.05;
		
		if(getPrecio() >= 120000) {
			precioEco = getPrecio() - (getPrecio() * 0.10);
		}	
		return precioEco;
	}

	@Override
	public String toString() {
		return super.toString() + " Precio Economico: "+ calcularPrecioBoleto() +"Tipo valija: "+ getTipoValija();
	}
}

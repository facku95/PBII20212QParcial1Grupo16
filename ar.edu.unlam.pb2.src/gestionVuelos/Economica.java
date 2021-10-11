package gestionVuelos;

public class Economica extends Boletos {
	private String tipoValija;
	
	public Economica(Integer id, Integer asiento, Double precio, String destino, Aerolinea aerolinea, Pasajero pasajero,
			Avion avion, Vuelo vuelo, TipoBoleto tipoBoleto, String tipoValija) {
		super(id, asiento, precio, destino, aerolinea, pasajero, avion, vuelo, tipoBoleto);
		this.tipoValija = tipoValija;
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

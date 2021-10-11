package gestionVuelos;

public class Avion {
	private String modelo;
	private Integer numeroAsientos;

	public Avion(String modelo, Integer numeroAsientos) {
		
		this.modelo = modelo;
		this.numeroAsientos = numeroAsientos;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getNumero_asientos() {
		return numeroAsientos;
	}

	public void setNumero_asientos(Integer numeroAsientos) {
		this.numeroAsientos = numeroAsientos;
	}
	
	@Override
	public String toString() {
		return "Modelo: "+ modelo+" N° Asiento: "+ numeroAsientos;
	}
}

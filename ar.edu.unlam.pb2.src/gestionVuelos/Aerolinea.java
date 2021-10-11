package gestionVuelos;

public class Aerolinea {
	private String nombre;
	private Integer cuit;

	public Aerolinea(String nombre, Integer cuit) {
		this.nombre = nombre;
		this.cuit = cuit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCuil() {
		return cuit;
	}

	public void setCuil(Integer cuil) {
		this.cuit = cuil;
	}
	
	@Override
	public String toString() {
		return "Aerolinea: "+ nombre+ " CUIT: "+ cuit;
	}
}

package gestionVuelos;

public class Avion {
private String modelo;
private Integer numero_asientos;

public Avion(String modelo, Integer numero_asientos) {
	super();
	this.modelo = modelo;
	this.numero_asientos = numero_asientos;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public Integer getNumero_asientos() {
	return numero_asientos;
}

public void setNumero_asientos(Integer numero_asientos) {
	this.numero_asientos = numero_asientos;
}


}

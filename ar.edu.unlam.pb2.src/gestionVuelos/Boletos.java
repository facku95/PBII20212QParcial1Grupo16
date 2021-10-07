package gestionVuelos;

public class Boletos {
private Integer id,asiento;
private Double precio;
private String destino;
private Aerolinea aerolinea;
private Pasajero pasajero;
private Avion avion;

public Boletos(Integer id, Integer asiento, Double precio, String destino
			   ,Aerolinea aerolinea, Pasajero pasajero, Avion avion) {
	this.id = id;
	this.asiento = asiento;
	this.precio = precio;
	this.destino = destino;
	this.aerolinea = aerolinea;
	this.pasajero = pasajero;
}
public Boolean VerificarAsientoDisponible(Integer asiento) {
	Boolean estado=false;
	if(asiento<=avion.getNumero_asientos()) {
		estado=true;
		return estado;
	}
	return estado;
}








public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public Integer getAsiento() {
	return asiento;
}

public void setAsiento(Integer asiento) {
	this.asiento = asiento;
}

public String getDestino() {
	return destino;
}

public void setDestino(String destino) {
	this.destino = destino;
}

public Aerolinea getAerolinea() {
	return aerolinea;
}

public void setAerolinea(Aerolinea aerolinea) {
	this.aerolinea = aerolinea;
}

public Pasajero getPasajero() {
	return pasajero;
}

public void setPasajero(Pasajero pasajero) {
	this.pasajero = pasajero;
}


}

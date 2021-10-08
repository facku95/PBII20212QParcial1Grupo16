package gestionVuelos;

public class Vuelo {
private Integer id;
static Integer nPasajeros=0;
private String destino;
private Avion avion;

public Vuelo(Integer id, Integer nPasajeros,
			 String destino, Avion avion) {
	super();
	this.id = id;
	this.nPasajeros = nPasajeros++;
	this.destino = destino;
	this.avion = avion;
}

public Boolean verificarAsientosDisponibles(){
	Boolean estado=false;
	if(nPasajeros<=avion.getNumero_asientos()) {
		estado=true;
	}
	return estado;
	}


public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public static Integer getnPasajeros() {
	return nPasajeros;
}

public static void setnPasajeros(Integer nPasajeros) {
	Vuelo.nPasajeros = nPasajeros;
}

public String getDestino() {
	return destino;
}

public void setDestino(String destino) {
	this.destino = destino;
}

public Avion getAvion() {
	return avion;
}

public void setAvion(Avion avion) {
	this.avion = avion;
}

}

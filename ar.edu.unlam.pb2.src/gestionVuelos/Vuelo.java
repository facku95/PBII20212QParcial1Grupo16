package gestionVuelos;

public class Vuelo {
	private Integer id;
	private Avion avion;
	private Integer numMaxPasajeros=avion.getNumero_asientos();
	private Integer numActualPasajeros=0;
    private Pasajero[] listaPasajeros;
	private String destino;
	

	public Vuelo(Integer id, String destino, Avion avion) {

		this.id = id;
		this.destino = destino;
		this.avion = avion;
		numActualPasajeros++;
	}
	
	public void insertarPasajero(Pasajero pasajero) {
		listaPasajeros[numActualPasajeros] = pasajero;
		numActualPasajeros++;
	}
	
	public Integer obtenerCantidadDePasajeros() {
		Integer numPasajeros = 0;
		for (int i = 0; i < listaPasajeros.length; i++) {
			if(listaPasajeros[i] != null) 
				numPasajeros++;
		}
		return numPasajeros;
	}
	
	//metodo que verifica capacidad max avion vs capacidad vuelo
	public Boolean verificarCapacidadAvionDelVuelo(Avion cantAsiento) {
		Boolean estado = false;
		if (numMaxPasajeros < cantAsiento.getNumero_asientos()) {
			estado = true;
			numMaxPasajeros++;
		}
		return estado;
	}

	public Boolean verificarDisponibilidadAsientoDelVuelo(Avion datoAvion, Pasajero datoPasajero) {
		Boolean sePudoComprar = false;
		if(numActualPasajeros < datoAvion.getNumero_asientos()) {
			sePudoComprar = true;
			insertarPasajero(datoPasajero);
		}
		return sePudoComprar;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getnPasajeros() {
		return numMaxPasajeros;
	}

	public void setnPasajeros(Integer nPasajeros) {
		this.numMaxPasajeros = nPasajeros;
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
	public Integer getNumMaxPasajeros() {
		return numMaxPasajeros;
	}

	public void setNumMaxPasajeros(Integer numMaxPasajeros) {
		this.numMaxPasajeros = numMaxPasajeros;
	}

	public Integer getNumActualPasajeros() {
		return numActualPasajeros;
	}

	public void setNumActualPasajeros(Integer numActualPasajeros) {
		this.numActualPasajeros = numActualPasajeros;
	}

	public Pasajero[] getListaPasajeros() {
		return listaPasajeros;
	}

	public void setListaPasajeros(Pasajero[] listaPasajeros) {
		this.listaPasajeros = listaPasajeros;
	}
	
	@Override
	public String toString() {
		return "Vuelo nº " + id + " Cant. Max. de pasajeros: " + numMaxPasajeros +" Cant. Actual Pasajeros: "+ numActualPasajeros+" Pasajero: "+ getListaPasajeros() +" Destino: " + destino + " Avion: " + avion;
	}
}

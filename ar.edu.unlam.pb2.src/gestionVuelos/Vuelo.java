package gestionVuelos;

import java.util.ArrayList;

public class Vuelo {
	private Integer id;
	private Avion avion;
    private ArrayList<Pasajero> pasajeros = new ArrayList<Pasajero>();
	private String destino;
	private Double precioBase;

	public Vuelo(Integer id, String destino, Avion avion, Double precio) {
		this.id = id;
		this.destino = destino;
		this.avion = avion;
		this.precioBase = precio;
	}
	
	public void insertarPasajero(Pasajero pasajero) {
		pasajeros.add(pasajero);
	}
	
	public Integer obtenerCantidadDePasajeros() {
		return pasajeros.size();
	}
	
	public Integer getCantidadDeAsientosDisponibles( ) {
		return this.avion.getNumero_asientos() - obtenerCantidadDePasajeros();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public ArrayList<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(ArrayList<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public Double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(Double precioBase) {
		this.precioBase = precioBase;
	}

	@Override
	public String toString() {
		return "Vuelo nº: " + id + " Destino: "+ destino+ " Avion: "+ avion+" Cant. pasajeros: "+ obtenerCantidadDePasajeros();
	}
}

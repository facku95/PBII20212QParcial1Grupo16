package gestionVuelos;

public class ClasePremium extends Boletos{
private Integer cantidad_bebidas,cantidad_comidas,cantidad_tragos;
private Double cuenta;

public ClasePremium(Integer id, Integer asiento, Double precio, String destino, Aerolinea aerolinea,
		Pasajero pasajero,Avion avion,Vuelo vuelo,Integer bebidas,Integer comidas,Integer tragos,Double cuenta) {
	super(id, asiento, precio, destino, aerolinea, pasajero,avion,vuelo);
	this.cantidad_bebidas=bebidas;
	this.cantidad_comidas=comidas;
	this.cantidad_tragos=tragos;
	this.cuenta=cuenta;
	
}
public Integer getCantidad_bebidas() {
	return cantidad_bebidas;
}
public void setCantidad_bebidas(Integer cantidad_bebidas) {
	this.cantidad_bebidas = cantidad_bebidas;
}
public Integer getCantidad_comidas() {
	return cantidad_comidas;
}
public void setCantidad_comidas(Integer cantidad_comidas) {
	this.cantidad_comidas = cantidad_comidas;
}
public Integer getCantidad_tragos() {
	return cantidad_tragos;
}
public void setCantidad_tragos(Integer cantidad_tragos) {
	this.cantidad_tragos = cantidad_tragos;
}
public Double getCuenta() {
	return cuenta;
}
public void setCuenta(Double cuenta) {
	this.cuenta = cuenta;
}

}

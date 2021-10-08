package gestionVuelos;

import java.util.Scanner;

public class AdministrarAereolinea {

	public static void main(String[] args) {
		///todos los commits a nombre de unknow fueron hechos por Angel Facundo Santillan
		Scanner scan=new Scanner(System.in); 
		///variables locales///
		Integer id_boleto,asiento_boleto,id_vuelo,dni_pasajero;
		String destino_boleto,destino_vuelo,origen_vuelo,nombre_pasajero;
		Double precio_boleto;
		Aerolinea latam = new Aerolinea("LATAM Airlines",55555);
		Aerolinea qatar = new Aerolinea("Qatar Airways",66666);
		Aerolinea lufthansa = new Aerolinea("Lufthansa",77777);
		Avion boeing737 = new Avion("Boeing 737",200);
		Avion boeing416 = new Avion("Boeing 416",150);
		Avion airbus320 = new Avion("Airbus A320",250);
		Vuelo misvuelos[] = new Vuelo[100];
		Boletos misboletos[]=new Boletos[100];
		Boletos primera[]=new PrimeraClase[100];
		Boletos premium[]=new ClasePremium[100];
		Pasajero pasajeros[]=new Pasajero[100];
		
		///////Menu///////
		
		int i=1;
		while(i!=0) {
			
			System.out.println("//////Menu Agencia de Viajes//////");
			System.out.println("1- Programar un vuelo");
			System.out.println("2- Registrar pasajeros");
			System.out.println("3- Venta de boletos");
			System.out.println("0- Cancelar");
			i = scan.nextInt();
			switch(i) {
				case 1:
					int j=1;
					while(j!=0) {
						System.out.println("PROGRAMAR UN VUELO");
						System.out.println("Ingrese un codigo de vuelo para verificar asientos:");
						j = scan.nextInt();	
					}
						System.out.println("Ingrese id de vuelo:");
						System.out.println("Ingrese numero de pasajeros:");
						System.out.println("Ingrese destino del vuelo:");
						System.out.println("Ingrese avion:");
						break;
			
				case 2: 
						System.out.println("REGISTRAR PASAJEROS");
						System.out.println("Ingresar nombre");
						System.out.println("Ingresar Apellido:");
						System.out.println("Ingresar dni:");
						break;
			
				case 3:
						System.out.println("VENTA DE BOLETOS");
						System.out.println("1- Verificar asientos disponibles en vuelo:");
						System.out.println("2- Mostrar Listado de vuelos programados");
						System.out.println("0- Salir ");
						break;
			
			
			}
			
		}
		
		
	}

}

package gestionVuelos;

import java.util.Scanner;

public class AdministrarAereolinea {
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		///todos los commits a nombre de unknow fueron hechos por Angel Facundo Santillan
		 
		///variables locales///
		
	Integer id_boleto,asiento_boleto,id_vuelo,dni_pasajero;
	String destino,nombre_pasajero,apellido_pasajero;
	Double precio_boleto;
		Aerolinea latam = new Aerolinea("LATAM Airlines",55555);
		Aerolinea qatar = new Aerolinea("Qatar Airways",66666);
		Aerolinea lufthansa = new Aerolinea("Lufthansa",77777);
		Avion boeing737 = new Avion("Boeing 737",200);
		Avion boeing416 = new Avion("Boeing 416",150);
		Avion airbus320 = new Avion("Airbus A320",250);
		Vuelo misvuelos[] = new Vuelo[100];
		Boletos misboletos[]=new Boletos[100];
		Pasajero pasajeros[]=new Pasajero[100];
		
	
	
		int opcion;

		do {
			System.out.println("==============Gestion de Vuelos===============");
			System.out.println("1- Registrar un vuelo");
			System.out.println("2- Registrar pasajeros");
			System.out.println("3- Venta de boletos");
//			System.out.println("4- Consultar un vuelo");
			System.out.println("0- Salir");
			System.out.println(" ");
			System.out.println("Elija una opcion:");
			
			opcion = entrada.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("PROGRAMAR UN VUELO");
				System.out.println("Ingrese ID de vuelo:");
				id_vuelo=entrada.nextInt();
				System.out.println("Ingrese destino del vuelo:");
				destino=entrada.next();
				System.out.println("Ingrese avion:");
				System.out.println("1-Boeing 737\n"+"2-Boeing 416\n"+"3-Airbus A320\n");
				Integer avion=entrada.nextInt();
				
					switch(avion) {
					case 1: 
						int bandera1=0;
						while(bandera1!=0) {
						if (misvuelos[bandera1]==null) {
							misvuelos[bandera1]=new Vuelo(id_vuelo,destino,boeing737);
							bandera1=0;
						}else bandera1++;
					}
						break;
					case 2: 
						int bandera2=0;
						while(bandera2!=0) {
							if (misvuelos[bandera2]==null) {
								misvuelos[bandera2]=new Vuelo(id_vuelo,destino,boeing416);
								bandera2=0;
							}else bandera2++;
				}break;
					case 3: 
					int bandera3=0;
					while(bandera3!=0) {
						if (misvuelos[bandera3]==null) {
							misvuelos[bandera3]=new Vuelo(id_vuelo,destino,airbus320);
							bandera3=0;
						}else bandera3++;
			}break;
					}
				
				
				break;
			case 2:
				System.out.println("REGISTRAR PASAJEROS");
				System.out.println("Ingresar Nombre");
				nombre_pasajero=entrada.next();
				System.out.println("Ingresar Apellido:");
				apellido_pasajero=entrada.next();
				System.out.println("Ingresar dni:");
				dni_pasajero=entrada.nextInt();
				int bandera=0;
				while(bandera!=0) {
					if (pasajeros[bandera]==null) {
						pasajeros[bandera]=new Pasajero(nombre_pasajero,apellido_pasajero,dni_pasajero);
						bandera=0;
					}else bandera++;
				}
				break;
				
			case 3:
				System.out.println("VENTA DE BOLETOS");
				System.out.println("1- Verificar asientos disponibles en vuelo:");
				System.out.println("2- Vender boleto");
				System.out.println("3- Mostrar Listado de vuelos programados");
				
				System.out.println("0- Salir ");
				int opcion2=entrada.nextInt();
					switch(opcion2) {
					case 1:System.out.println("Ingrese id de vuelo: ");
							id_vuelo=entrada.nextInt();
						   for(int i=0;i<misvuelos.length;i++) {
							   if(misvuelos[i].getId()==id_vuelo) {
								   if(misvuelos[i].getNumActualPasajeros()<misvuelos[i].getNumMaxPasajeros()) {
									   int asientosrestantes=misvuelos[i].getNumMaxPasajeros()-misvuelos[i].getNumActualPasajeros();
									   System.out.println("Los asientos disponibles en el vuelo"+id_vuelo+"es de"+asientosrestantes);
								   }System.out.println("No hay asientos disponibles en este vuelo ");
							   }System.out.println("El vuelo "+id_vuelo+"no esta registrado");
						   }
					
					
					case 2:System.out.println("Venta de boletos");
					   	System.out.println("Ingrese id boleto: ");
					   	id_boleto=entrada.nextInt();
					   	System.out.println("Ingrese asiento: ");
					   	asiento_boleto=entrada.nextInt();
					   	System.out.println("Ingrese precio: ");
					   	precio_boleto=entrada.nextDouble();
					   	System.out.println("Ingrese destino: ");
					   	destino=entrada.next();
					   	System.out.println("Ingrese Aerolinea: ");
					   	System.out.println("1- Latam airlines\\n 2-Qatar Airways\\n 3-Lufthansa");
					   	int aerolinea=entrada.nextInt();
					   	Aerolinea aeroAux = null;
					   		switch(aerolinea) {
					   		case 1: aeroAux=latam;
					   		case 2: aeroAux=qatar;
					   		case 3: aeroAux=lufthansa;
					   		default: System.out.println("No existe aerolinea");
					   		}
					   	System.out.println("Ingrese tipo de boleto:");
					   	System.out.println("1- Economico\\n 2-Business\\n 3-Primera Clase");
					   	TipoBoleto tipo;
			
					   	int clase=entrada.nextInt();
					   	switch(clase) {
					   		case 1: tipo=TipoBoleto.ECONOMICO;
					   				System.out.println("Ingrese tipo de valija: ");
					   				String valija=entrada.next();
					   				System.out.println("Ingrese Dni de pasajero:");
					   				int dni=entrada.nextInt();
									Pasajero pasajAux = null;
									for(int i=0;i<pasajeros.length;i++) {
										if (pasajeros[i].getDni()==dni) {
											pasajAux=pasajeros[i];
										}
										else {System.out.println("No existe pasajero registrado");
										break;}
									}
									System.out.println("Ingrese Avion:");
									System.out.println("1-Boeing 737\n"+"2-Boeing 416\n"+"3-Airbus A320\n");
									Avion avionAux = null;
									int opcion3=entrada.nextInt();
										switch(opcion3) {
										case 1:avionAux=boeing737;
										case 2:avionAux=boeing416;
										case 3:avionAux=airbus320;
										default:System.out.println("No existe avion");
										break;
										}
									System.out.println("Ingrese id de vuelo:");
									id_vuelo=entrada.nextInt();
									Vuelo vueloAux = null;
									for(int i=0;i<misvuelos.length;i++) {
										if (id_vuelo==misvuelos[i].getId()) {
											vueloAux=misvuelos[i];
										}else {System.out.println("no existe vuelo:");}
									}
					   				int bandera4=0;
									while(bandera4!=0) {
										if (misboletos[bandera4]==null) {
											misboletos[bandera4]=new Economica(id_boleto,asiento_boleto,precio_boleto,
											destino,aeroAux,pasajAux,avionAux,vueloAux,tipo,valija);
											bandera4=0;
										}else bandera4++;
									}
					   				
					   				
					   		case 2: tipo=TipoBoleto.BUSINESS;
			   				System.out.println("Ingrese Cantidad de bebidas compradas: ");
			   				int nbebidas=entrada.nextInt();
			   				System.out.println("Ingrese Dni de pasajero:");
			   				int dni2=entrada.nextInt();
							Pasajero pasajAux2 = null;
							for(int i=0;i<pasajeros.length;i++) {
								if (pasajeros[i].getDni()==dni2) {
									pasajAux2=pasajeros[i];
								}
								else {System.out.println("No existe pasajero registrado");
								break;}
							}
							System.out.println("Ingrese Avion:");
							System.out.println("1-Boeing 737\n"+"2-Boeing 416\n"+"3-Airbus A320\n");
							Avion avionAux2 = null;
							int opcion4=entrada.nextInt();
								switch(opcion4) {
								case 1:avionAux2=boeing737;
								case 2:avionAux2=boeing416;
								case 3:avionAux2=airbus320;
								default:System.out.println("No existe avion");
								break;
								}
							System.out.println("Ingrese id de vuelo:");
							id_vuelo=entrada.nextInt();
							Vuelo vueloAux2 = null;
							for(int i=0;i<misvuelos.length;i++) {
								if (id_vuelo==misvuelos[i].getId()) {
									vueloAux2=misvuelos[i];
								}else {System.out.println("no existe vuelo:");}
							}
			   				int bandera5=0;
							while(bandera5!=0) {
								if (misboletos[bandera5]==null) {
									misboletos[bandera5]=new Business(id_boleto,asiento_boleto,precio_boleto,
									destino,aeroAux,pasajAux2,avionAux2,vueloAux2,tipo,nbebidas);
									bandera5=0;
								}else bandera5++;
							}
					   		
					   			
					   		case 3: tipo=TipoBoleto.PRIMERA_CLASE;
					   		System.out.println("Ingrese Cantidad de bebidas compradas: ");
			   				Integer nbebidas2=entrada.nextInt();
			   				System.out.println("Ingrese Cantidad de comidas compradas: ");
			   				Integer ncomidas=entrada.nextInt();
			   				System.out.println("Ingrese Dni de pasajero:");
			   				int dni3=entrada.nextInt();
							Pasajero pasajAux3 = null;
							for(int i=0;i<pasajeros.length;i++) {
								if (pasajeros[i].getDni()==dni3) {
									pasajAux3=pasajeros[i];
								}
								else {System.out.println("No existe pasajero registrado");
								break;}
							}
							System.out.println("Ingrese Avion:");
							System.out.println("1-Boeing 737\n"+"2-Boeing 416\n"+"3-Airbus A320\n");
							Avion avionAux3 = null;
							int opcion5=entrada.nextInt();
								switch(opcion5) {
								case 1:avionAux3=boeing737;
								case 2:avionAux3=boeing416;
								case 3:avionAux3=airbus320;
								default:System.out.println("No existe avion");
								break;
								}
							System.out.println("Ingrese id de vuelo:");
							id_vuelo=entrada.nextInt();
							Vuelo vueloAux3 = null;
							for(int i=0;i<misvuelos.length;i++) {
								if (id_vuelo==misvuelos[i].getId()) {
									vueloAux3=misvuelos[i];
								}else {System.out.println("no existe vuelo:");}
							}
			   				int bandera6=0;
							while(bandera6!=0) {
								if (misboletos[bandera6]==null) {
									misboletos[bandera6]=new PrimeraClase(id_boleto,asiento_boleto,precio_boleto,
									destino,aeroAux,avionAux3,vueloAux3,tipo,pasajAux3,nbebidas2,ncomidas);
									bandera6=0;
								}else bandera6++;
							}
					   		default:System.out.println("No existe clase: ");
					   		} 	
					case 0:						
					}
				
				break;
			
			case 0:
				break;
				
			default:
				System.out.println("La opcion ingresada no es correcta");
				break;
			}
			System.out.println(" ");
		} while (opcion != 0);
	

}
	}

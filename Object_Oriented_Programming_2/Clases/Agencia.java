/*  Alumno: Franco Calderas Sergio Alberto
    Grupo: 3BV1
    Carrera: Ingenieria en Inteligencia Artificial
    Ultima fecha de modificacion: 30 de noviembre del 2023
    
    La funcionalidad de la clase Agencia es ser la clase principal de todo el 
    programa, en la cual se crearan los distintos eventos y boletos con todos 
    sus atributos sin importar la zona que el usuario elija para asignarle un 
    precio a cada boleto.
    Los Metodos de Agencia son:
    - mostrarBoletos: El objetivo de este metodo es poder visualizar todos los 
      boletos que se han creado hasta el momento, esto incluye a tambien a los
      atributos de cada boleto sin importar la zona que haya escogido o el precio
      que tenga asigando.
    - eliminarBoleto: Este metodo se encarga de eliminar del ArrayList de 
      boletos un boleto por medio de numero de serie que se de el usuario. 
*/
import java.util.ArrayList; /* Para los ArrayList */
import java.util.Scanner;   /* Para recoger los datos del usuario */
import java.util.InputMismatchException; /* Para las excepciones de ingresar caracteres en lugar de enteros */

public class Agencia{
    public static int ID_evento = 1234;         /* ID unico para los eventos*/
    public static int NumSerie_boleto = 123456; /* Numero de serie unico para los boletos */
    public static int numeroPersonasPalco = 1;       /* Numero de personas en el palco */
    
	public static void main(String[] args){
	    ArrayList<Evento> eventos = new ArrayList<>();  /* ArrayList de nombre eventos que guardara todos los eventos creados */
        ArrayList<Boleto> boletos = new ArrayList<>();  /* ArrayList de nombre boletos que guardara todos los boeltos creados */
        
        Scanner scanner = new Scanner(System.in);   /* Declaracion de scanner para leer los datos del usuario */
        int opcion = 0;
        int opcionZona = 0;
        double precioBoletoGradas = 500; /* Precio del boleto de las Gradas, se usara despues para asignar el precio a las distingtas zonas */
		do{
            /* Menu principal del programa */
            System.out.println("\n MENU PRINCIPAL ");       
            System.out.println(" 1. Crear Evento");
            System.out.println(" 2. Crear Boleto");
            System.out.println(" 3. Ver datos del Boleto");
            System.out.println(" 4. Ver todos los Boletos");
            System.out.println(" 5. Eliminar Boleto");
            System.out.println(" 6. Salir");
            System.out.print(" Ingrese una opcion: ");
            try{ /* Excepcion cuando el dato ingresado no corresponde con los datos de menu */
                opcion = scanner.nextInt();
            } catch(InputMismatchException e){ /* Si se detecto una excepcion */
                System.out.println(" Error: Debe ingresar un numero entero");
                scanner.nextLine(); /* Limpiar el bufer del escaner */
                continue; /* Volver al inicio del bucle */
            }
            switch(opcion){
                case 1:
                    /* Creacion de Evento */
                    System.out.println(" -- Creacion de Eventos --");
                    System.out.print(" Ingrese el nombre del Evento: ");
                    scanner.nextLine(); /* Incluir el espacio entre palabras */
                    String nombreEvento = scanner.nextLine();
                    System.out.print(" Ingrese la fecha del Evento (YYYY-MM-DD): ");
                    String fechaEvento = scanner.next();
                    int codigo_evento = ID_evento++; /* Aumentar el ID unico para los eventos */
                    System.out.print(" El ID del Evento es: " + codigo_evento + "\n");
                    Evento evento = new Evento(nombreEvento, fechaEvento, codigo_evento); /* Creacion del evento con el constructor de Evento */
                    eventos.add(evento); /* Añadir al ArrayList eventos el evento creado */
                    System.out.println(" -- Datos del Evento creado-- ");
                    System.out.println(evento.toString()); /* Uso del metodo toString para ver los datos del evento */
                    break;
                case 2:
                    /* Creacion de Boleto */
                    System.out.print(" -- Creacion de Boletos --\n");
                    /* Verificar si hay eventos disponibles en el ArrayList eventos */
                    if(eventos.isEmpty()){
                        System.out.println(" No hay eventos disponibles");
                    }
                    else{
                        System.out.println(" Estos son los eventos disponibles");
                        for(Evento e : eventos){
                            System.out.println(" •" + e.toString()); /* Mostar los datos de todos los eventos creados */
                        }
                        System.out.print(" Seleccione el ID del evento: "); /* Pedirle al usuario el ID al que quiere que se asocie su boleto */
                        int idEventoSeleccionado = scanner.nextInt();
                        Evento eventoSeleccionado = null;
                        for(Evento e : eventos){                        /* Bucar en el ArrayList de eventos si el evento dado por el usuario exite */
                            if(e.getCodigoEvento() == idEventoSeleccionado){
                                eventoSeleccionado = e;
                                break;
                            }
                        }
                        if(eventoSeleccionado != null){ /* Si encontro el ID del evento */
                            int numeroSerieBoleto = (ID_evento - 1)*1000000 + NumSerie_boleto;  /* Asignacion del numero de serie al boleto, multiplica */
                            NumSerie_boleto++;                                                  /* por un millon el ID unico del evento y le suma los */
                            System.out.print(" --Zonas Disponibles-- \n");                      /* siguientes 6 digitos para que sean 10 en total */
                            System.out.println(" 1. General");
                            System.out.println(" 2. Gradas");
                            System.out.println(" 3. Luneta");
                            System.out.println(" 4. Palco");
                            System.out.print(" Ingrese la zona en la que quiere estar: ");  /* Preguntar en que zona quiere estar */
                            try{ /* Excepcion cuando el dato ingresado no corresponde con los datos de menu */
                                opcionZona = scanner.nextInt();
                            } catch(InputMismatchException e){ /* Si se detecto una excepcion */
                                System.out.println(" Error: Debe ingresar un numero entero");
                                scanner.nextLine(); /* Limpiar el bufer del escaner */
                                continue; /* Volver al inicio del bucle */
                            }
                            switch(opcionZona){ /* Dependiendo de la Zona escogina se llamara a diferentes constructores */
                                case 1:         /* y se asignara diferentes precios de boleto*/
                                    String nombreZona = "General";  /* Asignar el tipo de zona a General */
                                    double precioBoletoGeneral = precioBoletoGradas + (precioBoletoGradas * 0.5);/* El precio del boleto General es 50% caro */
                                    Boleto boleto = new Boleto(eventoSeleccionado, numeroSerieBoleto, new Zona(nombreZona, precioBoletoGeneral));
                                    boletos.add(boleto); /* Llamada al constructor de Boleto y guardar el boleto creado en el ArrayList de boletos */
                                    System.out.print(" -- Boleto creado --\n");
                                    System.out.println(boleto.toString()); /* Uso de toString para mostrar todos los datos del boleto creado */
                                    break;
                                case 2:
                                    nombreZona = "Gradas"; /* Asignar el tipo de zona a Gradas */
                                    System.out.print(" Ingrese la seccion donde quiere estar (A-Z): "); /* Preguntar por la seccion */
                                    char seccion = scanner.next().charAt(0); /* Solo guardar un caracter */
                                    System.out.print(" Ingrese la fila donde quiere estar (1 - 25): "); /* Preguntar por la fila */
                                    int fila = scanner.nextInt();
                                    while(fila < 1 || fila > 25){ /* Ciclo utilizado para que se ingrese un valor valido para la fila */
                                        System.out.print(" Ingrese un valor valido para la fila (1 - 25): ");
                                        fila = scanner.nextInt();
                                    }
                                    System.out.print(" Ingrese el asiento donde quiere estar (1 - 25): "); /* Preguntar por el asiento */
                                    int asiento = scanner.nextInt();
                                    while(asiento < 1 || asiento > 25){ /* Ciclo utilizado para que se ingrese un valor valido para el asiento */
                                        System.out.print(" Ingrese un valor valido para el asiento (1 - 25): ");
                                        asiento = scanner.nextInt();
                                    }
                                    boleto = new Boleto(eventoSeleccionado, numeroSerieBoleto, /* Llamada al constructor de Boleto y Grada */
                                             new Grada(nombreZona, precioBoletoGradas, seccion, fila, asiento));
                                    boletos.add(boleto); /* Guardar el boleto creado en el ArrayList de boletos */
                                    System.out.println(" -- Boleto creado --");
                                    System.out.println(boleto.toString()); /* Uso de toString para mostrar todos los datos del boleto creado */
                                    break;
                                case 3:
                                    nombreZona = "Luneta"; /* Asignar el tipo de zona a Luneta */
                                    System.out.print(" Ingrese la seccion donde quiere estar (A-Z): "); /* Preguntar por la seccion */
                                    seccion = scanner.next().charAt(0); /* Solo guardar un caracter */
                                    System.out.print(" Ingrese la fila donde quiere estar (1 - 25): ");
                                    fila = scanner.nextInt();
                                    while(fila < 1 || fila > 25){ /* Ciclo utilizado para que se ingrese un valor valido para la fila */
                                        System.out.println(" Ingrese un valor valido para la fila (1 - 25): ");
                                        fila = scanner.nextInt();
                                    }
                                    System.out.print(" Ingrese el asiento donde quiere estar (1 - 25): "); /* Preguntar por el asiento */
                                    asiento = scanner.nextInt();
                                    while(asiento < 1 || asiento > 25){ /* Ciclo utilizado para que se ingrese un valor valido para el asiento */
                                        System.out.println(" Ingrese un valor valido para el asiento (1 - 25): ");
                                        asiento = scanner.nextInt();
                                    }
                                    double precioBoletoLuneta = precioBoletoGradas + (precioBoletoGradas * 0.85); /* El boleto de Luneta es 85% mas caro */
                                    boleto = new Boleto(eventoSeleccionado, numeroSerieBoleto, /* Llamada al constructor de Boleto y Luneta */
                                             new Luneta(nombreZona, precioBoletoGradas, seccion, fila, asiento));
                                    boletos.add(boleto); /* Guardar el boleto creado en el ArrayList de boletos */
                                    System.out.println(" -- Boleto creado --");
                                    System.out.println(boleto.toString()); /* Uso de toString para mostrar todos los datos del boleto creado */
                                    break;

                                case 4:
                                    nombreZona= "Palco"; /* Asignar el tipo de zona a Palco */
                                    int numeroPalco = 1; /* El numero del Palco */
                                    double precioBoletoPalco = precioBoletoGradas + (precioBoletoGradas * 3); /* El boleto de Palco es el triple de caro */
                                    if(numeroPersonasPalco > 20){ /* Si el numero de personas en el palco es mayor a 20 */
                                        numeroPalco++; /* Aumentar el numero de palco */
                                        numeroPersonasPalco = 1; /* Restablecer el numero de personas en el nuevo palco a 1 */
                                    }
                                    boleto = new Boleto(eventoSeleccionado, numeroSerieBoleto, /* Llamada al constructor de Boleto y Palco */
                                             new Palco(nombreZona, precioBoletoPalco, numeroPalco, numeroPersonasPalco));
                                    boletos.add(boleto);
                                    numeroPersonasPalco++; /* Aumentar el numero de personas totales en el palco */
                                    System.out.print(" -- Boleto creado --\n");
                                    System.out.println(boleto.toString());
                                    break;
                                default:
                                    System.out.println(" Opcion invalida");
                                    break;
                            }
                        } 
                        else{
                            System.out.println(" ID de evento no valido");
                        }
                    }
                    break;
                case 3:
                    System.out.print(" -- Ver datos Boleto --\n");
                    System.out.print(" Ingrese el numero de serie del boleto a consultar: "); /* Pedir el numero de serie del boleto */
                    int numeroSerieConsultar = scanner.nextInt();
                    Boleto boletoConsultado = null;
                    try{
                        for(Boleto b : boletos){    /* Buscar en el ArrayList de boletos el boleto solicitado por su numero de serie */
                            if(b.getNumeroSerie() == numeroSerieConsultar){
                                boletoConsultado = b;
                                break;
                            }
                        }
                        if(boletoConsultado != null){ /* Si encontro el boleto solicitado */
                            System.out.print(" -- Datos del Boleto --\n");
                            System.out.println(boletoConsultado.toString()); /* Mostrar los datos del boleto solicitado */
                        } else{ /* Si no encontro el boleto solicitado */
                            throw new Exception(" Numero de serie de boleto no valido");
                        }
                    } catch(Exception e){
                        System.out.println(" Numero de serie de boleto no valido");
                    }
                    break;
                case 4:
                    /* Ver todos los boletos creados */
                    System.out.print(" -- Ver Boletos --\n");
                    System.out.print(" Estos son todos los boletos creados: \n");
                    mostrarBoletos(boletos); /* Llamada al metodo de mostrarBoletos */ 
                    break;
                case 5:
                    /* Eliminar Boletos */
                    System.out.print(" -- Eliminar Boleto --\n");
                    System.out.print(" Ingrese el numero de serie del boleto a eliminar: "); /* Pedir el numero de serie del boleto a eliminar */
                    int numeroSerieEliminar;
                    try{ /* Excepcion cuando el dato ingresado no corresponde con el tipo de dato INT */
                        numeroSerieEliminar = scanner.nextInt();
                    } catch (InputMismatchException e) { /* Si se detecto una excepcion por el tipo de dato */
                        System.out.println(" Error: Debe ingresar un numero entero");
                        scanner.nextLine(); /* Limpiar el bufer del escaner */
                        continue; /* Volver al inicio del bucle */
                    }
                    eliminarBoleto(numeroSerieEliminar, boletos); /* Llamada al metodo de eliminarBoleto */
                    break;
                case 6:
                    System.out.println(" BYE BYE BYE ");
                    break;
                default:
                    System.out.println(" Opcion invalida");
                    break;
            }
        }while(opcion != 6);
	}
	
	/* METODOS DE AGENCIA */
	private static void mostrarBoletos(ArrayList<Boleto> boletos){
	    for(Boleto e : boletos){ /*  Buscar el en ArrayList de boletos */
            System.out.println(" •" + e.toString()); /* Mostrar todos los datos de los boletos que se hayan encontrado en el ArrayList */
        }
	}
    private static void eliminarBoleto(int numeroSerieEliminar, ArrayList<Boleto> boletos){
        int ultimosDigitos = (numeroSerieEliminar % 1000000); /* Se usa el modulo para conservar los 6 digitos unicos de boleto sin los del evento */
        int posicionArreglo = ultimosDigitos - 123456; /* Se resta 123456 para que concuerde con las posiciones del ArrayList */
        if(posicionArreglo >= 0 && posicionArreglo < boletos.size()){ /* Si el numero de serie del boleto exite */
            Boleto boletoEliminar = boletos.get(posicionArreglo);
            boletos.remove(posicionArreglo);    /* Se elimina el boleto que se encuentre en la posicion indicada */
            System.out.println(" Boleto eliminado correctamente");
        } 
        else{ /* Si no encontro el boleto dado por su numero de serie */
            System.out.println(" Numero de serie de boleto no valido");
        }
    }
}

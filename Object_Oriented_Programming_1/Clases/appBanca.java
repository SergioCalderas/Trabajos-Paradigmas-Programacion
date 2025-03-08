/*  Alumno: Franco Calderas Sergio Alberto
    Grupo: 3BV1
    Carrera: Ingenieria en Inteligencia Artificial
    Ultima fecha de modificacion: 15 de noviembre del 2023
    
    La funcionalidad de la clase appBanca es conjuntar todas las clases creadas con 
    anterioridad, al igual que llamar a los metodos de las clases que tienen.
    De igual manera en la clase appBanca se podran crear todos los objetos de cada
    una de las clases segun corresponda el caso de crear un objeto u otro. 
*/

import java.util.ArrayList; /* Para los ArrayList */
import java.util.Scanner;   /* Para recoger los datos del usuario */

public class appBanca{
    public static int ID_sucursales = 1;    /* ID unico para las sucursales*/
    public static int ID_ejecutivos = 1;    /* ID unico para los ejecutivos */
    public static int ID_clientes = 1;      /* ID unico para los clientes */
    public static int ID_cuentas = 1;       /* ID unico para las cuentas */
    public static Sucursal sucursalSeleccionada;    /* Variable para almacenar la sucursal seleccionada */

    public static void main(String[] args){
        ArrayList<Sucursal> sucursales = new ArrayList<>();     /* ArrayList de nombre sucursales que guardara datos de tipo Sucursal */
        ArrayList<Ejecutivo> ejecutivos = new ArrayList<>();    /* ArrayList de nombre ejecutivos que guardara datos de tipo Ejecutivo */
        ArrayList<Cliente> clientes = new ArrayList<>();        /* ArrayList de nombre clientes que guardara datos de tipo Clientes */
        ArrayList<Cuenta> cuentas = new ArrayList<>();          /* ArrayList de nombre cuentas que guardara datos de tipo Cuenta */

        Scanner scanner = new Scanner(System.in);   /* Declaracion de scanner para leer los datos del usuario */
        int opcion, opcionOperacion, opcionAutenticacion;
        do{
            /* Menu principal del programa */
            System.out.println("\n MENU PRINCIPAL ");       
            System.out.println(" 1. Crear Sucursal");
            System.out.println(" 2. Crear Ejecutivo");
            System.out.println(" 3. Crear Cliente y su cuenta");
            System.out.println(" 4. Hacer operaciones");
            System.out.println(" 5. Salir");
            System.out.print(" Ingrese una opcion: ");
            opcion = scanner.nextInt();
            switch(opcion){
                case 1:
                    /* Ingresar los atributos de la Sucursal */
                    System.out.print(" -- Creacion de la sucursal --\n");
                    System.out.print(" Ingrese la ubicación de la sucursal: ");
                    String ubicacion = scanner.next();
                    int idSucursal = ID_sucursales++;   /* Aumentar el ID unico para las sucursales*/

                    Sucursal sucursal = new Sucursal(ubicacion, idSucursal, clientes, ejecutivos); /* Creacion de la sucursal con el constructor de Sucursal */
                    sucursales.add(sucursal);           /* Añadir al ArrayList sucursales la sucursal creada */
                    sucursalSeleccionada = sucursal;    /* Asignar la sucursal seleccionada para los clientes y ejecutivos */
                    System.out.println(" Ubicacion: " + ubicacion + ", ID: " + idSucursal);
                    System.out.println(" Sucursal creada correctamente");
                    /* Creacion del ejecutivo para la sucursal */
                    System.out.print(" -- Creacion del primer ejecutivo de la sucursal --");
                    System.out.print("\n Ingrese el nombre del ejecutivo: ");
                    String nombreEjecutivo = scanner.next();
                    System.out.print(" Ingrese el sexo del ejecutivo (h o m): ");
                    char sexoEjecutivo = scanner.next().charAt(0);
                    System.out.print(" Ingrese el año de nacimiento del ejecutivo: ");
                    int anioNacimientoEjecutivo = scanner.nextInt();
                    System.out.print(" Ingrese la direccion del ejecutivo: ");
                    String direccionEjecutivo = scanner.next();
                    System.out.print(" Ingrese el numero de cuenta del ejecutivo: ");
                    String numCuentaEjecutivo = scanner.next();
                    System.out.print(" Ingrese el para NIP el ejecutivo: ");
                    int nipEjecutivo = scanner.nextInt();
                    int idEjecutivo = ID_ejecutivos++;  /* Aumentar el ID unico para los ejecutivos */

                    Ejecutivo ejecutivo = new Ejecutivo(sucursalSeleccionada, nombreEjecutivo, sexoEjecutivo, anioNacimientoEjecutivo, direccionEjecutivo, numCuentaEjecutivo,
                            nipEjecutivo, idEjecutivo);             /* Creacion de ejecutivo con el constructor de Ejecutivo */
                    ejecutivos.add(ejecutivo);                      /* Añadir al ArrayList ejecutivos al ejecutivo creado */
                    System.out.println(" ID Sucursal asociada: "+ idSucursal  + ", Nombre Ejecutivo: " + nombreEjecutivo + ", Sexo: " + sexoEjecutivo + 
                                       ", Año nacimiento: " + anioNacimientoEjecutivo + ", Direccion: " + direccionEjecutivo + ", Numero de cuenta: " + numCuentaEjecutivo);
                    System.out.println(" Ejecutivo creado correctamentemente");
                    break;
                case 2:
                    /* Ingresar los atributos del Ejecutivo */
                    idSucursal = ID_sucursales;
                    System.out.print(" -- Creacion de ejecutivo para la sucursal --\n");
                    System.out.print(" Ingrese el nombre del ejecutivo: ");
                    nombreEjecutivo = scanner.next();
                    System.out.print(" Ingrese el sexo del ejecutivo (h o m): ");
                    sexoEjecutivo = scanner.next().charAt(0);
                    System.out.print(" Ingrese el año de nacimiento del ejecutivo: ");
                    anioNacimientoEjecutivo = scanner.nextInt();
                    System.out.print(" Ingrese la direccion del ejecutivo: ");
                    direccionEjecutivo = scanner.next();
                    System.out.print(" Ingrese el numero de cuenta del ejecutivo: ");
                    numCuentaEjecutivo = scanner.next();
                    System.out.print(" Ingrese el para NIP el ejecutivo: ");
                    nipEjecutivo = scanner.nextInt();
                    idEjecutivo = ID_ejecutivos++;  /* Aumentar el ID unico para los ejecutivos */

                    ejecutivo = new Ejecutivo(sucursalSeleccionada, nombreEjecutivo, sexoEjecutivo, anioNacimientoEjecutivo, direccionEjecutivo, numCuentaEjecutivo,
                            nipEjecutivo, idEjecutivo);             /* Creacion de ejecutivo con el constructor de Ejecutivo */
                    ejecutivos.add(ejecutivo);                      /* Añadir al ArrayList ejecutivos al ejecutivo creado */
                    System.out.println(" ID Sucursal asociada: "+ (idSucursal - 1) + ", Nombre Ejecutivo: " + nombreEjecutivo + ", Sexo: " + sexoEjecutivo + 
                                       ", Año nacimiento: " + anioNacimientoEjecutivo + ", Direccion: " + direccionEjecutivo + ", Numero de cuenta: " + numCuentaEjecutivo);
                    System.out.println(" Ejecutivo creado correctamentemente");
                    break;
                case 3:
                    /* Ingresar los atributos del Cliente */
                    System.out.print(" -- Creacion del cliente y su cuenta --\n");
                    System.out.print(" Ingrese el nombre del cliente: ");
                    String nombreCliente = scanner.next();
                    System.out.print(" Ingrese el sexo del cliente (h o m): ");
                    char sexoCliente = scanner.next().charAt(0);
                    System.out.print(" Ingrese el año de nacimiento del cliente: ");
                    int anioNacimientoCliente = scanner.nextInt();
                    System.out.print(" Ingrese la direccion del cliente: ");
                    String direccionCliente = scanner.next();
                    System.out.print(" Ingrese el numero de cuenta del cliente: ");
                    String numCuentaCliente = scanner.next();
                    System.out.print(" Ingrese el NIP del cliente: ");
                    int nipCliente = scanner.nextInt();
                    int idCliente = ID_clientes++;  /* Aumentar el ID unico para los clientes */
                    System.out.print(" Nombre Cliente: " + nombreCliente + ", Sexo: " + sexoCliente + ", Año nacimiento: " + anioNacimientoCliente
                            + ", Direccion: " + direccionCliente + " Numero de cuenta: " + numCuentaCliente);
                    System.out.println("\n Cliente creado correctamente");
                    
                    /* Ingresar los atributos para la Cuenta del Cliente */
                    System.out.print(" -- Creacion de la cuenta para cliente -- \n");
                    int idCuenta = ID_cuentas++; /* Aumentar el ID unico para las cuentas */
                    System.out.print(" Ingrese el saldo de la cuenta: ");
                    float saldo = scanner.nextFloat();
                    String tipoCuenta = (saldo <= 100000.00) ? "Estandar" : "Premier";
                    String autenticacion;
                    autenticacion = "Desbloqueada";
                    
                    Cliente cliente = new Cliente(sucursalSeleccionada, nombreCliente, sexoCliente, anioNacimientoCliente, /* Creacion de cliente con el constructor de Cliente */
                                    direccionCliente, numCuentaCliente, nipCliente, idCliente, autenticacion,           /* Crecion de cuenta dentro de cliente por el */
                                    new Cuenta(idCuenta, saldo, tipoCuenta, new ArrayList<>()));                        /* concepto de composición */
                    clientes.add(cliente);                      /* Añadir al ArrayList clientes al cliente creado */
                    cuentas.add(cliente.cuenta);                /* Añadir al ArrayList cuentas a la cuenta creada */
                    System.out.println(" Saldo: $" + saldo + ", Tipo: " + tipoCuenta + ", NIP: " + nipCliente);
                    System.out.println(" Cuenta creada correctamentemente");
                    break;
                case 4:
                    /* Apartado para hacer operaciones de cliente y ejecutivo */
                    /* Autenticacion para que cada tipo de usuario pueda hacer sus operaciones */
                    System.out.print(" -- Autenticacion de Usuarios -- \n");
                    System.out.print(" Ingrese su ID: ");       /* Pedir al usuario su ID unico y NIP */
                    int id = scanner.nextInt();
                    System.out.print(" Ingrese su NIP: ");
                    int nip = scanner.nextInt();

                    if(cliente.getAutenticacion() == "Bloqueada"){              /* Verificar si la cuenta esta Bloqueada */
                        System.out.println(" Su cuenta fue bloqueada ");
                    }
        
                    boolean esCliente = false; /* Verificar si el usuario es un cliente */
                    int intentosCliente = 0;
                    for(int i = 0; i < clientes.size(); i++){
                        /* Verifica qie el ID y el NIp del cliente correspondan, al igual que la cuentaeste Desbloqueada */
                        if(cliente.getID() == idCliente && cliente.getNIP() == nipCliente){
                            if(cliente.getAutenticacion() == "Desbloqueada"){
                                esCliente = true;
                            }
                            else if(cliente.getAutenticacion() == "Bloqueada"){
                                System.out.println(" Su cuenta fue bloqueada");
                            }  
                        }else{
                            intentosCliente++;
                        }
                    }
                        
                    boolean esEjecutivo = false; /* Verificar si el usuario es un ejecutivo */
                    for(int i = 0; i < ejecutivos.size(); i++){
                        /* Verifica qie el ID y el NIP del ejecutivo correspondan */
                        if(ejecutivo.getID_Ejecutivo() == idEjecutivo && ejecutivo.getNIP() == nipEjecutivo){
                            esEjecutivo = true;
                        }
                    }
    
                    if(esCliente){
                        do{
                            // Mostrar menú de operaciones para el cliente
                            System.out.println("\n MENU DE CUENTA ");
                            System.out.println(" 1. Consultar saldo");
                            System.out.println(" 2. Retirar saldo");
                            System.out.println(" 3. Realizar deposito");
                            System.out.println(" 4. Consultar estado de cuenta");
                            System.out.println(" 5. Volver al menu principal");
                            System.out.print(" Ingrese una opcion: ");
                            opcionOperacion = scanner.nextInt();
                            switch(opcionOperacion){
                                case 1:
                                    cliente.cuenta.Consultar_Saldo();
                                    break;
                                case 2:
                                    cliente.cuenta.Retirar_Saldo();
                                    break;
                                case 3:
                                    cliente.cuenta.Deposito();
                                    break;
                                case 4:
                                    cliente.cuenta.consultarEstadoCuenta();
                                    break;
                                default:
                                    System.out.println(" Opcion invalida");
                                    break;
                            }       
                        }while(opcionOperacion != 5);
                    } 
                    else if(esEjecutivo){
                        do{
                            // Mostrar menú de operaciones para el ejecutivo
                            System.out.println("\n MENU DE EJECUTIVO ");
                            System.out.println(" 1. Eliminar Cliente y Cuenta");
                            System.out.println(" 2. Modificar Cliente");
                            System.out.println(" 3. Mostrar Clientes");
                            System.out.println(" 4. Salir");
                            System.out.print(" Ingrese una opcion: ");
                            opcionOperacion = scanner.nextInt();
                            switch (opcionOperacion){
                                case 1:
                                    ejecutivo.eliminarCliente(cliente);
                                    break;
                                case 2:
                                    ejecutivo.modificarCliente(cliente);
                                    break;
                                case 3: 
                                    ejecutivo.mostrarClientes();
                                default:
                                    System.out.println(" Opcion invalida");
                                    break;
                            }
                        }while(opcionOperacion != 3);
                    } 
                    else{
                        System.out.println(" ID o  NIP incorrectos");
                        if(intentosCliente >= 3){
                            /* Si ya se excedieron los 3 intentos para entrar al sistema la cuenta pasa a estar bloqueada */
                            System.out.println(" Su cuenta ha sido bloqueada ");
                            autenticacion = "Bloqueada";
                        }
                    } 
                break;
                case 5:
                    System.out.println(" BYE ");
                    break;
                default:
                    System.out.println(" Opcion invalida");
                    break;
            }
        }while(opcion != 5);
    }
}


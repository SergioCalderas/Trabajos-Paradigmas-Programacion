/*  Alumno: Franco Calderas Sergio Alberto
    Grupo: 3BV1
    Carrera: Ingenieria en Inteligencia Artificial
    Ultima fecha de modificacion: 13 de noviembre del 2023
    
    La funcionalidad de la clase Ejecutivo es definir a una clase hijo de la clase Persona, la cual 
    heredara todos los atributos de la clase Persona, adicionalmete tendra atributos pripios, como 
    su id_ejecutivo propio para identificarlo del resto de ejecutivos que se creen posteriormente, 
    Los Metodos de la clase Ejecutivo son:
    - mostrarClientes: EL ejecutivo podra ver a todos los clientes del ArrayList del clientes sobre 
      los cuales el puede operar
    - mostrarClientesEliminados: EL ejecutivo despues de eliminar a un cliente podra ver la lista de
      todos los clientes restantes depues de dicha operacion
    - eliminarCliente: El Ejecutivo tendra la capacidad para eliminar al cliente que el quiera, de 
      igual manera al eliminar el cliente se eliminara la cuenta del cliente eliminado
    - modificarCliente: El ejecutivo podra cambiar el nombre del cliente, el sexo del cliente y la 
      direccion del cliente, los demas datos del cliente se mantendran como el cliente los haya 
      asignado
*/

import java.util.Scanner; /* Para recoger los datos del usuario */
import java.util.ArrayList; /* Para los ArrayList */
public class Ejecutivo extends Persona{
    /* Atributos propios de la clase Ejecutivo */
    public int id_ejecutivo;    /* Identificador unico para cada ejecutivo */
    public ArrayList<Cliente> clientes;
    
    Scanner scanner = new Scanner(System.in);   /* Declaracion de scanner para leer los datos del usuario */
    
    // CONSTRUCTOR DE Ejecutivo
    public Ejecutivo(Sucursal sucursal, String nombre, char sexo, int anio_nacim, String direccion, String num_cuenta, int nip, int id_ejecutivo){
        super(sucursal, nombre, sexo, anio_nacim, direccion, num_cuenta, nip);  /* Llamada a los atributos de la clase padre Persona */
        this.id_ejecutivo = id_ejecutivo;
    }
    
    // Getters y Setters de los Ejecutivo
    public int getID_Ejecutivo(){
        return id_ejecutivo;
    }
    public void setID(int id_ejecutivo){
        this.id_ejecutivo = id_ejecutivo;
    }
    
    public ArrayList<Cliente> getClientes(){
        return clientes;
    }
    public void setClientes(ArrayList<Cliente> clientes){
        this.clientes = clientes;
    }

    /* METODOS DE Ejecutivo */
    public void eliminarCliente(Cliente cliente){
        System.out.println(" Ingrese el ID del Cliente a eliminar: ");      /* Pedir al ejecutivo el ID del cliente a eliminar */
        int idCliente = scanner.nextInt();                                  /* Guardar el ID en la variable numeroCliente */
        idCliente = (idCliente - 1);                                        /* Como los ID empiezan en 1 se resta -1 para que coincida como la posicion de clientes */
        clientes.remove(idCliente);                                         /* Remover de clientes al cliente que esta en la posicion numeroCliente */
        //cuentas.remove(cliente.getCuenta());                                /* Del cliente eliminado, eliminado tambien su cuenta */
        System.out.println(" Cliente y cuenta eliminados correctamente");
        mostrarClientesEliminados();
    } 
    public void modificarCliente(Cliente cliente){
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Ingrese el ID del cliente a modificar: ");               /* Pedir el ID del cliente que se va a modificar */
        int idCliente = scanner.nextInt();
    
        /* Buscar el cliente en la lista de clientes */
        Cliente clienteModificar = null;
        for(Cliente cliente : clientes){
            if(cliente.getID() == idCliente){
                clienteModificar = cliente;
                break;
            }
        }
    
        /* Verificar si se encontró el cliente */
        if(clienteModificar != null){
            System.out.print(" Ingrese el nuevo nombre del cliente: ");             /* Pedir al ejecutivo el nuevo nombre de cliente */
            String nuevoNombre = scanner.next();                                    
            clienteModificar.setNombre(nuevoNombre);                                /* Asignar al cliente el nuevo nombre*/
    
            System.out.print(" Ingrese el nuevo sexo del cliente (h o m): ");       /* Pedir al ejecutivo el nuevo sexo de cliente */
            char nuevoSexo = scanner.next().charAt(0);                          
            clienteModificar.setSexo(nuevoSexo);                                    /* Asignar al cliente su nuevo sexo */
    
            System.out.print(" Ingrese la nueva direccion del cliente: ");          /* Pedir al ejecutivo la nueva direccion del cliente */
            String nuevaDireccion = scanner.next();
            clienteModificar.setDireccion(nuevaDireccion);                          /* Asignar al cliente su nueva direccion */
    
            System.out.println(" Cliente modificado correctamente");
        } else {
            System.out.println(" No se encontro un cliente con el ID dado");
        }
        mostrarClientes();
    }
    public void mostrarClientes(){
        System.out.println(" -- Clientes --");
        for (Cliente cliente : clientes) {
            System.out.println(" Nombre: " + cliente.getNombre() + ", Sexo: " + cliente.getSexo() + ", Año de Nacimiento: " + cliente.getAnio_Nacim() + 
                               ", Direccion: " + cliente.getDireccion() + ", Numero de Cuenta: " + cliente.getNum_Cuenta() + ", NIP: " + cliente.getNIP() + 
                               ", ID: " + cliente.getID() );
        }
    }
    public void mostrarClientesEliminados(){
        System.out.println(" -- Clientes --");
        for(Cliente cliente : clientes){
            System.out.println(" Nombre: " + cliente.getNombre() + ", Sexo: " + cliente.getSexo() + ", Año de Nacimiento: " + cliente.getAnio_Nacim() + 
                               ", Direccion: " + cliente.getDireccion() + ", Numero de Cuenta: " + cliente.getNum_Cuenta() + ", NIP: " + cliente.getNIP() + 
                               ", ID: " + (cliente.getID() - 1));
        }
    }
    
}

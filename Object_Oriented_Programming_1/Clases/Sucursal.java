/*  Alumno: Franco Calderas Sergio Alberto
    Grupo: 3BV1
    Carrera: Ingenieria en Inteligencia Artificial
    Ultima fecha de modificacion: 11 de noviembre del 2023
    
    La funcionalidad de la clase Sucursal es crear la sucursal en la que se incluiran a 
    los ejecutivos y clientes que realizaran operaciones en sus cuentas
*/
import java.util.ArrayList; /* Para los ArrayList*/

public class Sucursal{
    /* Atributos de la clase Sucursal */
    public String ubicacion;                /* La ubicacion de la sucursal */
    public int id;                          /* Identificador unico para cada sucursal */
    public ArrayList<Cliente> clientes;     /* ArrayList donde se guardaran a los clientes */
    public ArrayList<Ejecutivo> ejecutivos; /* ArrayList donde se guardaran a los ejecutivos */

    // CONSTRUCTOR de Sucursal
    public Sucursal(String ubicacion, int id, ArrayList<Cliente> clientes, ArrayList<Ejecutivo> ejecutivos){
        this.ubicacion = ubicacion;
        this.id = id;
        this.clientes = clientes;
        this.ejecutivos = ejecutivos;

    }

    // Getters y Setters de los Sucursal
    public String getUbicacion(){
        return ubicacion;
    }
    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }

    public int getIdSucursal(){
        return id;
    }
    public void setIdSucursal(int id){
        this.id = id;
    }
    
    public ArrayList<Cliente> getClientes(){
        return clientes;
    }
    public void setClientes(ArrayList<Cliente> clientes){
        this.clientes = clientes;
    }

    public ArrayList<Ejecutivo> getEjecutivos(){
        return ejecutivos;
    }
    public void setEjecutivos(ArrayList<Ejecutivo> ejecutivos){
        this.ejecutivos = ejecutivos;
    }   

    /* METODOS DE SUCURSAL */
        /* Esta clase no tiene metodos */
}

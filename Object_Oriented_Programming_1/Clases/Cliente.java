/*  Alumno: Franco Calderas Sergio Alberto
    Grupo: 3BV1
    Carrera: Ingenieria en Inteligencia Artificial
    Ultima fecha de modificacion: 11 de noviembre del 2023
    
    La funcionalidad de la clase Cliente es definir a una clase hijo de la clase Persona, la cual 
    heredara todos los atributos de la clase Persona, adicionalmete tendra atributos pripios, como 
    su ID propio para identificarlo del resto de clientes que se creen posteriormente, al igual que 
    la cuenta que se le creara 
*/

public class Cliente extends Persona{
    public int id;          
    public String autenticacion;    
    public Cuenta cuenta;   
    
    // CONSTRUCTOR DE Cliente
    public Cliente(Sucursal sucursal, String nombre, char sexo, int anio_nacim, String direccion, String num_cuenta, int nip, int id, String autenticacion, Cuenta cuenta){
        super(sucursal, nombre, sexo, anio_nacim, direccion, num_cuenta, nip); /* Llamada a los atributos de la clase padre Persona */
        this.id = id;
        this.autenticacion = autenticacion;
        this.cuenta = cuenta;
    }
    
    // Getters y Setters de los Cliente
    public int getID(){
        return id;
    }
    public void setID(int id){
        this.id = id;
    }
    
    public String getAutenticacion(){
        return autenticacion;
    }
    public void setAutenticacion(String autenticacion){
        this.autenticacion = autenticacion;
    }
    
    public Cuenta getCuenta(){
        return cuenta;
    }
    public void setCuenta(Cuenta cuenta){
        this.cuenta = cuenta;
    }
    /* METODOS DE Cliente */
        /* Esta clase no tiene metodos */
}

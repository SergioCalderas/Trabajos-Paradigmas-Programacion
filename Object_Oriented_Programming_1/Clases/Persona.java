/*  Alumno: Franco Calderas Sergio Alberto
    Grupo: 3BV1
    Carrera: Ingenieria en Inteligencia Artificial
    Ultima fecha de modificacion: 11 de noviembre del 2023
    
    La funcionalidad de la clase Persona es definir a la persona que interactuara con la clase principal appBanca
*/

public class Persona{
    /* Atributos de la clase Persona */
    public Sucursal sucursal;   /* La sucursal a la que sera asignada */
    public String nombre;       /* El nombre de la persona */
    public char sexo;           /* El sexo de la persona */
    public int anio_nacim;      /* Año de nacimiento de la persona */
    public String direccion;    /* La direccion de la persona */
    public String num_cuenta;   /* El numero de cuenta de la person */
    public int nip;             /* El NIP con el que la persona ingresara para hacer operaciones */
    
    // CONSTRUCTOR DE Persona
    public Persona(Sucursal sucursal, String nombre, char sexo, int anio_nacim, String direccion, String num_cuenta, int nip){
        this.sucursal = sucursal;
        this.nombre = nombre;
        this.sexo = sexo;
        this.anio_nacim = anio_nacim;
        this.direccion = direccion;
        this.num_cuenta = num_cuenta;
        this.nip = nip;
    }
    
    // Getters y Setters de los Persona
    public Sucursal getSucursal(){
        return sucursal;
    }
    public void setSucursal(Sucursal sucursal){
        this.sucursal = sucursal;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public char getSexo(){
        return sexo;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    
    public int getAnio_Nacim(){
        return anio_nacim;
    }
    public void setAnio_Nacim(int anio_nacim){
        this.anio_nacim = anio_nacim;
    }
    
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public String getNum_Cuenta(){
        return num_cuenta;
    }
    public void setNum_Cuenta(String num_cuenta){
        this.num_cuenta = num_cuenta;
    }
    
    public int getNIP(){
        return nip;
    }
    public void setNIP(int nip){
        this.nip = nip;
    }
    
    /* METODOS DE Persona */
        /* Esta clase no tiene metodos */
}
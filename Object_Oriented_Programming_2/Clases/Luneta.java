/*  Alumno: Franco Calderas Sergio Alberto
    Grupo: 3BV1
    Carrera: Ingenieria en Inteligencia Artificial
    Ultima fecha de modificacion: 28 de noviembre del 2023
    
    La funcionalidad de la clase Luneta es ser una clase hija de la clase zona,
    la cual tiene de diferencia que se puede escoger una seccion, una fila y un
    asiento para asiganrselo al boleto.
    Los Metodos de Luenta son:
    - toString: Este metodo se utiliza para poder visualizar todos
      los atributos de la zona, como lo son el nombre de la zona, el precio de 
      acuerdo a la zona que se escogio, la seccion, la fila y el asiento.
*/
public class Luneta extends Zona{
    private char seccion;
    private int fila;
    private int asiento;

    // CONSTRUCTOR de Luneta
    public Luneta(String nombreZona, double costo, char seccion, int fila, int asiento){
        super(nombreZona, costo);
        this.seccion = seccion;
        this.fila = fila;
        this.asiento = asiento;
    }

    // Getters y Setters de Luneta
    public char getSeccion(){
        return seccion;
    }
    public void setSeccion(char seccion){
        this.seccion = seccion;
    }
    
    public int getFila(){
        return fila;
    }
    public void setFila(int fila){
        this.fila = fila;
    }
    
    public int getAsiento(){
        return asiento;
    }
    public void setAsiento(int asiento){
        this.asiento = asiento;
    }

    /* METODOS DE LUNETA */
    @Override
    public String toString(){
       return ", Precio: "+ getCosto() + ", Zona: " + getNombreZona() + ", Seccion " +  getSeccion() + ", Fila: " + getFila() + ", Asiento: " + getAsiento();
    }
    
}


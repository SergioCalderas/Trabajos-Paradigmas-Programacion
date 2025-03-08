/*  Alumno: Franco Calderas Sergio Alberto
    Grupo: 3BV1
    Carrera: Ingenieria en Inteligencia Artificial
    Ultima fecha de modificacion: 28 de noviembre del 2023
    
    La funcionalidad de la clase Zona es ser la clase padre de todas las demas
    zonas que puede eligir el usuario para la creacion de su boleto
    Los Metodos de Zona son:
    - toString: Este metodo se utiliza para poder visualizar todos
      los atributos de la zona, como lo son el nombre de la zona y el precio de 
      acuerdo a la zona que se escogio.
*/
public class Zona{
    private String nombreZona;
    private double costo;

    // CONSTRUCTOR de Zona
    public Zona(String nombreZona, double costo){
        this.nombreZona = nombreZona;
        this.costo = costo;
    }

    // Getters y Setters de Zona
    public String getNombreZona(){
        return nombreZona;
    }
    public void setNombreZona(String nombreZona){
        this.nombreZona = nombreZona;
    }
    
    public double getCosto(){
        return costo;
    }
    public void setCosto(double costo){
        this.costo = costo;
    }

    /* METODOS DE ZONA */
    @Override
    public String toString(){
        return  ", Precio: " + getCosto() + ", Zona: " + getNombreZona();
    }
    
}


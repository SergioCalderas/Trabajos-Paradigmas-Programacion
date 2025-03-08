/*  Alumno: Franco Calderas Sergio Alberto
    Grupo: 3BV1
    Carrera: Ingenieria en Inteligencia Artificial
    Ultima fecha de modificacion: 28 de noviembre del 2023
    
    La funcionalidad de la clase Palco es ser una clase hija de la clase zona,
    la cual tiene de diferencia que la persona puede estar en un palco el cual
    podra compartir hasta con un maximo de 20 personas. 
    Los Metodos de Palco son:
    - toString: Este metodo se utiliza para poder visualizar todos
      los atributos de la zona, como lo son el nombre de la zona, el precio de 
      acuerdo a la zona que se escogio, el numero del palco y la cantidad de 
      personas que hay en total en el palco.
*/
public class Palco extends Zona{
    private int numeroPalco;
    private int numeroPersonas;

    // CONSTRUCTOR de Palco
    public Palco(String nombreZona, double costo, int numeroPalco, int numeroPersonas){
        super(nombreZona, costo);
        this.numeroPalco = numeroPalco;
        this.numeroPersonas = numeroPersonas;
    }

    // Getters y Setters de Palco
    public int getNumeroPalco(){
        return numeroPalco;
    }
    public void setNumeroPalco(int numeroPalco){
        this.numeroPalco = numeroPalco;
    }
    
    public int getNumeroPersonas(){
        return numeroPersonas;
    }
    public void setNumeroPersonas(int numeroPersonas){
        this.numeroPersonas = numeroPersonas;
    }

    /* METODOS DE PALCO */
    @Override
    public String toString(){
        return ", Precio: "+ getCosto() + ", Zona: " + getNombreZona() + ", Numero de Palco " + 
                getNumeroPalco() + ", Personas totales en el palco: " +  getNumeroPersonas();
    }
    
}


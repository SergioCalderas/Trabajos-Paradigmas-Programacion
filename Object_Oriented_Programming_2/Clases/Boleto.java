/*  Alumno: Franco Calderas Sergio Alberto
    Grupo: 3BV1
    Carrera: Ingenieria en Inteligencia Artificial
    Ultima fecha de modificacion: 27 de noviembre del 2023
    
    La funcionalidad de la clase Boleto es crear todos los boletos para los 
    eventos que se creen con todos los atributos de la propria clase mas los 
    datos del evento.
    Los Metodos de Boleto son:
    - toString: Este metodo se utiliza para poder visualizar todos
      los atributos de cada boleto creado, esto tambien incluye los
      datos del evento al que asistira.
*/

public class Boleto{
    private Evento evento;
    private Zona zona;
    private int numero_serie;

    // CONSTRUCTOR de Boleto
    public Boleto(Evento evento, int numero_serie, Zona zona){
        this.evento = evento;
        this.numero_serie = numero_serie;
        this.zona = zona;
    }

    // Getters y Setters del Boleto
    public Evento getEvento(){
        return evento;
    }
    public void setEvento(Evento evento){
        this.evento = evento;
    }

    public Zona getZona(){
        return zona;
    }
    public void setZona(Zona zona){
        this.zona = zona;
    }

    public int getNumeroSerie(){
        return numero_serie;
    }
    public void setNumeroSerie(int numero_serie){
        this.numero_serie = numero_serie;
    }

    /* METODOS DE BOLETO */
    @Override
    public String toString(){
        return getEvento() + "" + getZona() + ", Numero de Serie: " + getNumeroSerie();
    }
    
}



/*  Alumno: Franco Calderas Sergio Alberto
    Grupo: 3BV1
    Carrera: Ingenieria en Inteligencia Artificial
    Ultima fecha de modificacion: 27 de noviembre del 2023
    
    La funcionalidad de la clase Evento es crear los eventos a los que asistiran 
    las personas por medio de los boletos que se creen posteriormente.
    Los Metodos de Evento son:
    - toString: Este metodo es utilizado para poder visualizar todos los 
      atributos de cada boleto.
*/
public class Evento{
    /* Atributos de la clase Evento */
    private String nombre;                
    private String fecha;                          
    private int codigo_evento;

    // CONSTRUCTOR de Evento
    public Evento(String nombre, String fecha, int codigo_evento){
        this.nombre = nombre;
        this.fecha = fecha;
        this.codigo_evento = codigo_evento;
    }

    // Getters y Setters del Evento
    public String getNombreEvento(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getFechaEvento(){
        return fecha;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    
    public int getCodigoEvento(){
        return codigo_evento;
    }
    public void setCodigoEvento(int codigo_evento){
        this.codigo_evento = codigo_evento;
    }

    /* METODOS DE EVENTO */
    @Override
    public String toString(){
        return " Nombre del Evento: " + getNombreEvento() +   ", Fecha del Evento: " + getFechaEvento() +", ID del Evento: " + getCodigoEvento();
    }
    
}


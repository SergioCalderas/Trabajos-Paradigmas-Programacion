package carrito;

class Comida extends Producto{
    private String fecha_caducidad;
    private String origen;

    // CONSTRUCTOR DE Comida
    public Comida(String nombre, String fecha_caducidad, String origen, int precio, String tipo, int codigo_unico, double cantidad) {
        super(nombre, precio, tipo, codigo_unico, cantidad);
        this.fecha_caducidad = fecha_caducidad;
        this.origen = origen;
    }

    // Getters y Setters de Comida  
    public String getFecha_caducidad() {
        return fecha_caducidad;
    }
    public void setFecha_caducidad(String fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
   
}

package carrito;

public class Producto {
    private String nombre;
    private int precio;
    private String tipo;
    private int codigo_unico;
    private double cantidad;
    
    // CONSTRUCTOR DE Producto
    public Producto(String nombre, int precio, String tipo, int codigo_unico, double cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
        this.codigo_unico = codigo_unico;
        this.cantidad = cantidad;
    }
    
    // Getters y Setters de Producto
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getCodigo_unico() {
        return codigo_unico;
    }
    public void setCodigo_unico(int codigo_unico) {
        this.codigo_unico = codigo_unico;
    }

    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
       
}

package carrito;

public class Ropa extends Producto{
    private char talla;
    private String color;

    // CONSTRUCTOR DE Ropa
    public Ropa(String nombre, char talla, String color, int precio, String tipo, int codigo_unico, int cantidad) {
        super(nombre, precio, tipo, codigo_unico, cantidad);
        this.talla = talla;
        this.color = color;
    }
    
    // Getters y Setters de Ropa
    public char getTalla() {
        return talla;
    }
    public void setTalla(char talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
        
}

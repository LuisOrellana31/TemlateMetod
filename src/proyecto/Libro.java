package proyecto;

/**
 * 
 * @author 
 */
public abstract class Libro {
    
    private String titulo;
    private String autor;
    private String edicion;
    private double precio;
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public double calcularPrecioFinal() {
        return precio + calcularComision();
    }

    @Override
    public String toString() {
        return titulo + " | " + autor + " | " + edicion + " | " + calcularPrecioFinal();
    }
    
    protected abstract double calcularComision();
}
package proyecto;

/**
 * 
 * @author 
 * 
 */
public class LibroDigital extends Libro {

    private int porcentajeComision;
    
    public LibroDigital() {
    }
    
    public LibroDigital(String titulo, String autor, String edicion, double precio) {
        super.setTitulo(titulo);
        super.setAutor(autor);
        super.setEdicion(edicion);
        super.setPrecio(precio);
    }
    
    public LibroDigital(String titulo, String autor, String edicion,
                        double precio, int porcentajeComision) {
        super.setTitulo(titulo);
        super.setAutor(autor);
        super.setEdicion(edicion);
        super.setPrecio(precio);
        this.porcentajeComision = porcentajeComision;
    }

    public int getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(int porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }
    
    @Override
    protected double calcularComision() {
        return (super.getPrecio() * porcentajeComision) / 100;
    }
}
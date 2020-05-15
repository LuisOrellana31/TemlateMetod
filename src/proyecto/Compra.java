package proyecto;

import java.util.List;

/**
 * 
 * @author 
 * 
 */
public class Compra {
    
    private int id;
    private List<Libro> libros;

    public Compra() {
    }

    public Compra(int id, List<Libro> libros) {
        this.id = id;
        this.libros = libros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}
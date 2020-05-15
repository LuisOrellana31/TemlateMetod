package proyecto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author 
 * 
 */
public class Cliente {
    
    private int id;
    private double credito;
    private List<Compra> compras;

    public Cliente() {
        this.compras = new ArrayList<>();
    }
    
    public Cliente(int id, double credito) {
        this.id = id;
        this.credito = credito;
        this.compras = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }
    
    public void comprar(Compra compra) {
        this.compras.add(compra);
        Iterator<Libro> libros = compra.getLibros().iterator();
        while(libros.hasNext()) {
            debitarCredito(libros.next().calcularPrecioFinal());
        }
    }
    
    public void debitarCredito(double monto) {
        this.credito -= monto;
    }
    
    public void recargarCredito(double monto) {
        this.credito += monto;
    }
}
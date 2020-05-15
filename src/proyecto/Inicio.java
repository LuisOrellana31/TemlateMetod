package proyecto;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author 
 */
public class Inicio {

    public static void main(String[] args) {
        Libro l1 = new LibroDigital("Hacking Etico", "M. Meyers", "1ra", 15, 3);
        Libro l2 = new LibroDigital("POO", "G. Philips", "5ta", 20, 5);
        Libro l3 = new LibroImpreso("Algebra Lineal", "H. Marks", "2da", 15);
        Libro l4 = new LibroImpreso("Calculo Integral", "A. Rainold", "2da", 120);
        
        List<Libro> lista1 = new ArrayList<>();
        List<Libro> lista2 = new ArrayList<>();
        
        lista1.add(l1);
        lista1.add(l2);
        lista2.add(l3);
        lista2.add(l4);
        
        Cliente cliente = new Cliente(1,100);
        cliente.recargarCredito(500);
        cliente.comprar(new Compra(1,lista1));
        cliente.comprar(new Compra(2,lista2));
        
        for (Compra compra : cliente.getCompras()) {
            for (Libro libro : compra.getLibros()) {
                System.out.println(libro.toString());
            }
        }
    }   
}
package Biblioteca;

import java.util.ArrayList;

public class AppBiblioteca {
    public static void main(String[] args){
        Libro l1 = new Libro("Don Quijote", "Miguel de Cervantes", 1605);
        Libro l2 = new Libro("Cien anos de soledad", "Gabriel Garcia Marques", 1998);
        Libro l3 = new Libro("1984", "George Orwell", 1949);

        Libro lInvalido1 = new Libro("", "George Orwell", 1949);
        Libro lInvalido2 = new Libro("1984", null, 1949);

        ArrayList<Libro> libros = new ArrayList<>();
        libros.add(l1);
        libros.add(l2);
        libros.add(l3);
        libros.add(lInvalido1);
        libros.add(lInvalido2);
        System.out.println(libros);

        GestionBiblioteca gestor = new GestionBiblioteca(libros);

        System.out.println("Despues de las modificaciones");
        gestor.imprimirLibrosPosteriorA(1900);





    }
}

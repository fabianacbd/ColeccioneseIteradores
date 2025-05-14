package Biblioteca;

import java.util.ArrayList;
import java.util.Iterator;

public class GestionBiblioteca {
    ArrayList<Libro> listaLibros;

    public GestionBiblioteca(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public void imprimirLibrosPosteriorA(int anio){
        Iterator<Libro> iterator = listaLibros.iterator();
        while (iterator.hasNext()) {
            Libro libro = iterator.next();
            try {
                validarLibro(libro);
                if(libro.getAnio() > anio) {
                    System.out.println(libro);
                }
            } catch (LibroInvalidoException e){
                System.err.println("Error: " + e.getMessage());
            }
        }
    }

    private void validarLibro(Libro libro) throws LibroInvalidoException {
        if (libro.getTitulo() == null || libro.getTitulo().trim().isEmpty()){
            throw new LibroInvalidoException("Titulo no valido");
        }
        if (libro.getAutor() == null || libro.getAutor().trim().isEmpty()){
            throw new LibroInvalidoException("Autor no valido");
        }
    }
}

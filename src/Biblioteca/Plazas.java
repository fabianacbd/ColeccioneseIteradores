package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class CatalogoServicios {
    private ArrayList<ServicioViaje> listaServicios;
    private ArrayList<String> nombres;

    public CatalogoServicios(ArrayList<ServicioViaje> listaServicios) {
        this.listaServicios = listaServicios;
    }

    public void agregarServicio(ServicioViaje servicios) {
        listaServicios.add(servicios);

    }

    public Iterator<ServicioViaje> obtenerIteradorServicio() {
        return listaServicios.iterator();
    }

    public ServicioViaje obtenerServicioPorNombre(String nombre) throws ServicioNoEncontradoException {
        boolean encontrado = false;
        for (int i = 0; i < nombres.size(); i++) {
            if (nombres.get(i).equalsIgnoreCase(nombre)) {
                System.out.println("Contacto encontrado: " + nombres.get(i));
                encontrado = true;
                break;
            }
        }
        throw new ServicioNoEncontradoException("Error: Servicio no encontrado");
    }

    public void eliminarServicio(String nombre) throws ServicioNoEncontradoException {
        Iterator<ServicioViaje> iterator = obtenerIteradorServicio();
        while (iterator.hasNext()) {
            ServicioViaje servicioViaje = iterator.next();
            if (servicioViaje.getDisponibilidad() <= 0) {
                listaServicios.remove(nombre);
            }
        }
        throw new ServicioNoEncontradoException("Error: Servicio no encontrado");
    }

    public void actualizarDisponibilidad(String nombre, int nuevaDisponibilidad) throws ServicioSinDisponibilidadException, ServicioNoEncontradoException {
        Iterator<ServicioViaje> iterator = obtenerIteradorServicio();
        while (iterator.hasNext()) {
            ServicioViaje servicioViaje = iterator.next();
            servicioViaje.setDisponibilidad(5);
            if (nuevaDisponibilidad <= 0) {
                throw new ServicioSinDisponibilidadException("No se puede establecer una disponibilidad negativa para el servivio: " + nombre);
            }
        }
        throw new ServicioNoEncontradoException("Error: Servicio no encontrado");
    }

    public void calcularTotalPlazasDisponibles(int){
        Iterator<ServicioViaje> iterator = obtenerIteradorServicio();

    }

    public void listarCatalogo(){
        ArrayList<ServicioViaje> lista = ArrayList
        for(ServicioViaje s: listaServicios){
        System.out.println(listaServicios);
        }
    }
}
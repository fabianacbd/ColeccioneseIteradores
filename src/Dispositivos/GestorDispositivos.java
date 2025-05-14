package Dispositivos;

import java.util.ArrayList;
import java.util.Iterator;

public class GestorDispositivos {
    ArrayList<Dispositivo> listaDispositivos;

    public GestorDispositivos() {
        this.listaDispositivos = new ArrayList<>();
    }

    public void anadirDispositivo(Dispositivo dispositivo){
        listaDispositivos.add(dispositivo);
    }

    public Iterator<Dispositivo> obtenerIterador(){
        return listaDispositivos.iterator();
    }

    public Dispositivo buscaDispositivosPorModelo(String modelo) throws DispositivoNoEncontrado{
        Iterator<Dispositivo> iterator = obtenerIterador();
        while (iterator.hasNext()) {
            Dispositivo dispositivo = iterator.next();
            if (dispositivo.getModelo().equalsIgnoreCase(modelo)) {
                return dispositivo;
            }
        }
        throw new DispositivoNoEncontrado("Dispositivo no encontrado");
    }

    public void imprimirDispositivoConMayorRAM(int ramMinima){
        for (Dispositivo d: listaDispositivos) {
            if(d instanceof DispositivoInformatico){
                DispositivoInformatico di = (DispositivoInformatico) d; // Casting de variables, Ej: double precio = 4.05 -> int truncarDouble = (int) precio -> esto se convierte en 4
                if(di.getRAM() >= ramMinima){
                    System.out.println("Dispositivo informatico " + di.getMarca()
                        + di.getMarca() + " RAM: " + di.getRAM());
                }
            }
        }
    }
}
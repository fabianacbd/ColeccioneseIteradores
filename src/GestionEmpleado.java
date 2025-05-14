import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class GestionEmpleado {
    private ArrayList<Empleado> listaEmpleado;

    public GestionEmpleado(ArrayList<Empleado> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }

    public void agregarEmpleado(Empleado empleado){
        listaEmpleado.add(empleado);
    }

    public Iterator<Empleado> obtenerIteradorEmpleado(){
        return listaEmpleado.iterator();
    }

    public void aumentarSalarioEmpleadoMayoresde30(double porcentaje) {
        Iterator<Empleado> iterator = obtenerIteradorEmpleado();

        while (iterator.hasNext()){
            Empleado empleado = iterator.next();
            if (empleado.getEdad() > 30){
                empleado.setSueldo(empleado.getSueldo() * (1+ porcentaje / 100));
            }
        }
    }

    public Empleado buscarEmpleadoPorNombre(String nombre) throws EmpleadoNoEncontradoException {
        Iterator<Empleado> iterator = obtenerIteradorEmpleado();
        while (iterator.hasNext()){
            Empleado empleado = iterator.next();
            if(empleado.getNombre().equalsIgnoreCase(nombre)){
                System.out.println("Empleado encontrado");
                return empleado;
            }
        }
        throw new EmpleadoNoEncontradoException("Empleado no encontrado");
    }
}

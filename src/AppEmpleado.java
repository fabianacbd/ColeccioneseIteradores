import java.util.ArrayList;

public class AppEmpleado {
    public static void main(String[] args){
        Empleado e1 = new Empleado("Macarena", 23, 26000);
        Empleado e2 = new Empleado("Alonso", 19, 18000);
        Empleado e3 = new Empleado("Carlo", 33, 18000);

        ArrayList<Empleado> listaEmpleado = new ArrayList<>();

        GestionEmpleado gestionEmpleado = new GestionEmpleado(listaEmpleado);
        gestionEmpleado.agregarEmpleado(e2);
        gestionEmpleado.agregarEmpleado(e1);
        gestionEmpleado.agregarEmpleado(e3);

        System.out.println(listaEmpleado);
        gestionEmpleado.aumentarSalarioEmpleadoMayoresde30(10);
        System.out.println(listaEmpleado);

        try {
            gestionEmpleado.buscarEmpleadoPorNombre("Macarena");
            gestionEmpleado.buscarEmpleadoPorNombre("Denis");
        } catch (EmpleadoNoEncontradoException e){
            System.err.println("Error: " + e.getMessage());
        }



    }
}

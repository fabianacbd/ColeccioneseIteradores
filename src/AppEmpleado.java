import java.util.ArrayList;
/**
 * Main application class for managing travel services.
 */
public class AppInventario {
    public static void main(String[] args) {
        // Create travel services
        ServicioViaje cruceroEuropa = new ServicioViaje("Crucero Europa", 10, 2000);
        ServicioViaje viajeEgipto = new ServicioViaje("Viaje Egipto", 15, 2500);
        ServicioViaje vuelosAsia = new ServicioViaje("Vuelos Asia", 6, 1000);
        // Print service details
        System.out.println("Service Details:");
        cruceroEuropa.imprimirServicioViaje();
        viajeEgipto.imprimirServicioViaje();
        vuelosAsia.imprimirServicioViaje();
        // Create catalog and add services
        ArrayList<ServicioViaje> listaServicios = new ArrayList<>();
        CatalogoServicios catalogoServicios = new CatalogoServicios(listaServicios);
        catalogoServicios.agregarServicio(cruceroEuropa);
        catalogoServicios.agregarServicio(viajeEgipto);
        catalogoServicios.agregarServicio(vuelosAsia);
        // List catalog
        System.out.println("\nCatalog:");
        catalogoServicios.listarCatalogo();
        // Update availability
        catalogoServicios.actualizarDisponibilidad(viajeEgipto.getNombre(), 0);
        // Remove services
        catalogoServicios.eliminarServicio("Viaje Egipto");
        // Handle exceptions
        try {
            catalogoServicios.actualizarDisponibilidad("Viaje Egipo", 0);
        } catch (ServicioSinDisponibilidadException e) {

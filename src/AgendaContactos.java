
import java.util.ArrayList;
import java.util.Scanner;

    public class AgendaContactos {
        // Listas para nombres y teléfonos
        private ArrayList<String> nombres;
        private ArrayList<String> telefonos;

        public AgendaContactos() {
            nombres = new ArrayList<>();
            telefonos = new ArrayList<>();
        }

        // Método para agregar un contacto
        public void agregarContacto(String nombre, String telefono) {
            nombres.add(nombre);
            telefonos.add(telefono);
            System.out.println("Contacto agregado.");
        }

        // Método para mostrar todos los contactos
        public void verContactos() {
            if (nombres.isEmpty()) {
                System.out.println("La agenda está vacía.");
            } else {
                System.out.println("Lista de contactos:");
                for (int i = 0; i < nombres.size(); i++) {
                    System.out.println((i + 1) + ". " + nombres.get(i) + " - " + telefonos.get(i));
                }
            }
        }

        // Método para buscar contacto por nombre
        public void buscarPorNombre(String nombreBuscado) {
            boolean encontrado = false;
            for (int i = 0; i < nombres.size(); i++) {
                if (nombres.get(i).equalsIgnoreCase(nombreBuscado)) {
                    System.out.println("Contacto encontrado: " + nombres.get(i) + " - " + telefonos.get(i));
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("No se encontró un contacto con ese nombre.");
            }
        }

        // Método principal con el menú
        public static void main(String[] args) {
            AgendaContactos agenda = new AgendaContactos();
            Scanner scanner = new Scanner(System.in);
            int opcion;

            do {
                System.out.println("\nAgenda de Contactos");
                System.out.println("1. Agregar Contacto");
                System.out.println("2. Ver Contactos");
                System.out.println("3. Buscar por Nombre");
                System.out.println("4. Salir");
                System.out.print("Selecciona una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer

                switch (opcion) {
                    case 1:
                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Teléfono: ");
                        String telefono = scanner.nextLine();
                        agenda.agregarContacto(nombre, telefono);
                        break;
                    case 2:
                        agenda.verContactos();
                        break;
                    case 3:
                        System.out.print("Nombre a buscar: ");
                        String nombreBuscado = scanner.nextLine();
                        agenda.buscarPorNombre(nombreBuscado);
                        break;
                    case 4:
                        System.out.println("Saliendo de la agenda...");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }

            } while (opcion != 4);

            scanner.close();
        }
    }

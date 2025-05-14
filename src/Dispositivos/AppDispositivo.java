package Dispositivos;

public class AppDispositivo {
    public static void main(String[] agrs){
        GestorDispositivos gestor = new GestorDispositivos();

        gestor.anadirDispositivo(new Dispositivo() {
            @Override
            public String getMarca() {
                return "Apple";
            }

            @Override
            public String getModelo() {
                return "iPhone 16 PRO";
            }

            @Override
            public int getAnio() {
                return 2024;
            }
        });

        gestor.anadirDispositivo(new DispositivoInformatico() {
            @Override
            public int getRAM() {
                return 16;
            }

            @Override
            public String getProcesador() {
                return "M3";
            }

            @Override
            public String getMarca() {
                return "Apple";
            }

            @Override
            public String getModelo() {
                return "MacBook Pro";
            }

            @Override
            public int getAnio() {
                return 2024;
            }
        });

        gestor.anadirDispositivo(new Dispositivo() {
            @Override
            public String getMarca() {
                return "Poco";
            }

            @Override
            public String getModelo() {
                return "X6 PRO";
            }

            @Override
            public int getAnio() {
                return 2023;
            }
        });

        gestor.anadirDispositivo(new DispositivoInformatico() {
            @Override
            public int getRAM() {
                return 8;
            }

            @Override
            public String getProcesador() {
                return "Intel i7";
            }

            @Override
            public String getMarca() {
                return "HP";
            }

            @Override
            public String getModelo() {
                return "Zen";
            }

            @Override
            public int getAnio() {
                return 2020;
            }
        });

        try {
            gestor.buscaDispositivosPorModelo("iPhone 16 Pro");
            gestor.buscaDispositivosPorModelo("Galaxy A35");
        } catch (DispositivoNoEncontrado e){
            System.err.println("Error: " + e.getMessage());
        }

        gestor.imprimirDispositivoConMayorRAM(16);
    }
}

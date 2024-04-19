package clase18042024;

import java.util.Scanner;

public class Coche {
    String marca, modelo, color,traccion, motor;
    boolean encendido, girando, avanzando, retrocediendo;

    public Coche(String marca, String modelo, String color, String traccion, String motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.traccion = traccion;
        this.motor = motor;
        this.encendido = false;
        this.girando = false;
        this.avanzando = false;
        this.retrocediendo = false;
    }

    public void encender() {
        encendido = true;
        System.out.println("El coche está encendido.");
    }

    public void apagar() {
        encendido = false;
        girando = false;
        avanzando = false;
        retrocediendo = false;
        System.out.println("El coche está apagado.");
    }

    public void girar() {
        if (encendido) {
            girando = true;
            System.out.println("El coche está girando.");
        } else {
            System.out.println("El coche debe estar encendido para girar.");
        }
    }

    public void avanzar() {
        if (encendido) {
            avanzando = true;
            System.out.println("El coche está avanzando.");
        } else {
            System.out.println("El coche debe estar encendido para avanzar.");
        }
    }

    public void retroceder() {
        if (encendido) {
            retrocediendo = true;
            System.out.println("El coche está retrocediendo.");
        } else {
            System.out.println("El coche debe estar encendido para retroceder.");
        }
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche("Toyota", "Corolla", "Rojo", "4x4", "2.0L");
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú de acciones:");
            System.out.println("1. Encender");
            System.out.println("2. Apagar");
            System.out.println("3. Girar");
            System.out.println("4. Avanzar");
            System.out.println("5. Retroceder");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    miCoche.encender();
                    break;
                case 2:
                    miCoche.apagar();
                    break;
                case 3:
                    miCoche.girar();
                    break;
                case 4:
                    miCoche.avanzar();
                    break;
                case 5:
                    miCoche.retroceder();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 6);
    }
}
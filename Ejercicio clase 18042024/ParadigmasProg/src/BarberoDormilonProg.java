import java.util.concurrent.Semaphore;

public class BarberoDormilonProg {
    private static final int NUM_CHAIRS = 3; // Número de sillas disponibles
    private static Semaphore chairs = new Semaphore(NUM_CHAIRS, true); // Semáforo para las sillas
    private static Semaphore barber = new Semaphore(0); // Semáforo para el peluquero
    private static boolean barberAsleep = true; // Indica si el peluquero está dormido

    public static void main(String[] args) {
        Thread peluquero = new Thread(new Barber());
        peluquero.start();

        // Crear y comenzar los hilos de los clientes
        for (int i = 1; i <= 10; i++) {
            Thread cliente = new Thread(new Client(i));
            cliente.start();
        }
    }

    private static class Barber implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    barber.acquire(); // Esperar a que haya un cliente
                    barberAsleep = false; // El peluquero está despierto
                    System.out.println("El peluquero está cortando el cabello.");
                    Thread.sleep(2000); // Simular el corte de cabello
                    chairs.release(); // Liberar una silla
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class Client implements Runnable {
        private final int id;

        public Client(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            try {
                chairs.acquire(); // Tomar una silla disponible
                System.out.println("Cliente " + id + " tomó una silla.");

                if (barberAsleep) {
                    System.out.println("Cliente " + id + " despertando al peluquero.");
                    barber.release(); // Despertar al peluquero
                }

                barber.acquire(); // Esperar al peluquero
                System.out.println("Cliente " + id + " está siendo atendido.");
                chairs.release(); // Liberar la silla
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
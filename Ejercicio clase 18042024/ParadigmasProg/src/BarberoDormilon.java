public class BarberoDormilon {

    // Número de sillas de la sala de espera
    static final int SILLAS = 5;

    // Variables compartidas
    static int clientesSentados = 0;
    static boolean barberoOcupado = false;
    static boolean barberoDurmiendo = true; // Indicar que el barbero está dormido al inicio

    public static void main(String[] args) {
        // Simular la llegada de 10 clientes
        for (int i = 1; i <= 10; i++) {
            System.out.println("Llega el cliente " + i);

            // Si el barbero está durmiendo, despertarlo
            if (barberoDurmiendo) {
                System.out.println("El cliente " + i + " despierta al barbero");
                barberoDurmiendo = false;
                barberoOcupado = true; // El barbero pasa a estar ocupado
                System.out.println("El barbero esta cortando el cabello al cliente " + i); 
            } else if (i == 1 && !barberoOcupado) {
                System.out.println("El cliente " + i + " se sienta");
                System.out.println("El barbero corta el cabello al cliente " + i);
                barberoOcupado = true;
            }

            // Si hay sillas disponibles
            else if (clientesSentados < SILLAS) {
                clientesSentados++;
                System.out.println("El cliente " + i + " se sienta");

                // Si el barbero no está ocupado
                if (!barberoOcupado) {
                    // Simular el trabajo del barbero
                    System.out.println("El barbero corta el cabello al cliente " + i);
                    // No reducir clientesSentados aquí
                    barberoOcupado = true; // El barbero está ocupado cortando el cabello
                }
                // Si no, el cliente espera su turno
                else {
                    System.out.println("El cliente " + i + " espera su turno");
                }

                // Si no hay sillas disponibles
            } else {
                System.out.println("No hay sillas disponibles, el cliente " + i + " se va");
            }
        }
    }
}
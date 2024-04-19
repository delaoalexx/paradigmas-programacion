import java.util.Scanner;

public class ContadorVocales {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Texto en minúsculas:");
        String texto = leer.nextLine();

        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i' ||
                texto.charAt(i) == 'o' || texto.charAt(i) == 'u') {
                contador++;
            }
        }

        System.out.println("El número de vocales en la cadena es: " + contador);
    }
}

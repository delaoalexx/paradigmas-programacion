import java.util.Scanner;

public class ConversorMedidas 
{
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        int opci, opcion;
        float medida, medidaFinal;

        System.out.print("Que quiere convertir? \n1)Milimetros 2)centimetros 3)Metros 4)Kilometros \nOpcion: ");
        opci = leer.nextInt();

        switch (opci) 
        {
            case 1:
                System.out.print("1)Milimetros a centimetros \n2)Milimetros a metros \n3)Milimetros a kilometros \nOpcion:  ");
                opcion = leer.nextInt();
                System.out.print("Milimetros: ");
                medida = leer.nextFloat();
                switch (opcion) 
                {
                    case 1:
                        medidaFinal = medida / 10;
                        break;
                    case 2:
                        medidaFinal = medida / 1000;
                        break;
                    case 3:
                        medidaFinal = medida / 1000000;
                        break;
                    default:
                        System.out.println("Opción no válida");
                        return;
                }
                break;
            case 2:
                System.out.print("1)Centimetros a milimetros \n2)Centimetros a metros \n3)Centimetros a kilometros \nOpcion:  ");
                opcion = leer.nextInt();
                System.out.print("Centimetros: ");
                medida = leer.nextFloat();
                switch (opcion) 
                {
                    case 1:
                        medidaFinal = medida * 10;
                        break;
                    case 2:
                        medidaFinal = medida / 100;
                        break;
                    case 3:
                        medidaFinal = medida / 100000;
                        break;
                    default:
                        System.out.println("Opción no válida");
                        return;
                }
                break;
            case 3:
                System.out.print("1)Metros a milimetros  \n2)Metros a centimetros \n3)Metros a kilometros \nOpcion:  ");
                opcion = leer.nextInt();
                System.out.print("Metros: ");
                medida = leer.nextFloat();
                switch (opcion) 
                {
                    case 1:
                        medidaFinal = medida * 1000;
                        break;
                    case 2:
                        medidaFinal = medida * 100;
                        break;
                    case 3:
                        medidaFinal = medida / 1000;
                        break;
                    default:
                        System.out.println("Opción invalida");
                        return;
                }
                break;
            case 4:
                System.out.print("1)Kilometros a milimetros \n2)Kilometros a centimetros \n3)Kilometros a metros \nOpcion:  ");
                opcion = leer.nextInt();
                System.out.print("Kilometros: ");
                medida = leer.nextFloat();
                switch (opcion) 
                {
                    case 1:
                        medidaFinal = medida * 1000000;
                        break;
                    case 2:
                        medidaFinal = medida * 100000;
                        break;
                    case 3:
                        medidaFinal = medida * 1000;
                        break;
                    default:
                        System.out.println("Opción invalida");
                        return;
                }
                break;
            default:
                System.out.println("Opción invalida");
                return;
        }
        System.out.println("Resultado: " + medidaFinal);
    }
}
import java.util.Scanner;

public class OperacionesFloat 
{
	public static void main(String[] args) 
	{
		Scanner leer = new Scanner(System.in);
		int opci;
		float v1, v2, suma, resta, multi, divi;
		
		System.out.print("Elija una opcion: 1) suma 2)resta 3)multiplicacion 4)division" + "\nOpcion:");
		opci = leer.nextInt();
		System.out.print("Ingrese el primer valor: ");
		v1 = leer.nextFloat();
		System.out.print("Ingrese el segundo valor: ");
		v2 = leer.nextFloat();
		
		switch(opci)
		{
		case 1:
			suma = v1 + v2;
			System.out.println(v1 + " + " + v2 + " = " + suma);
			break;
		case 2:
			resta = v1 - v2;
			System.out.println(v1 + " - " + v2 + " = "  + resta);
			break;
		case 3:
			multi = v1 * v2;
			System.out.println(v1 + " * " + v2 + " = " + multi);
			break;
		case 4:
			divi = v1 / v2;
			System.out.println(v1 + " / " + v2 + " = " + divi);
			break;
		}
	}
}

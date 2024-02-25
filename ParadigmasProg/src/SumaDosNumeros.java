import java.util.Scanner;

public class SumaDosNumeros {

	public static void main(String[] args)
	{
	
		Scanner leer = new Scanner(System.in);
		float n1=0;
		float n2=0;
		float result;
	
		System.out.print("Ingrese el primer numero: ");
		n1 = leer.nextFloat();
		System.out.print("Ingrese el segundo numero: ");
		n2 = leer.nextFloat();
	
		result =n1+n2;
		System.out.println("El resultado es: " + result); 
	}
}

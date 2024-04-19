import java.util.Scanner;

public class MenorDosNumeros {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner(System.in);
		float n1=0, n2=0;
		
		System.out.print("Ingrese el primer numero: ");
		n1 = leer.nextFloat();
		
		System.out.print("Ingrese el segundo numero: ");
		n2 = leer.nextFloat();
		
		if(n1>n2)
		{
		System.out.println("El menor es " + n2);
		}else {
			System.out.println("El menor es " + n1);
		}
	}
}

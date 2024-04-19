import java.util.Scanner;

public class Promedio5Numeros {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner(System.in);
		float n1=0,  n2=0 , n3=0, n4=0, n5=0, prom;
	
		System.out.print("Ingrese el primer numero: ");
		n1 = leer.nextFloat();
		System.out.print("Ingrese el segundo numero: ");
		n2 = leer.nextFloat();
		System.out.print("Ingrese el tercer numero: ");
		n3 = leer.nextFloat();
		System.out.print("Ingrese el cuarto numero: ");
		n4 = leer.nextFloat();
		System.out.print("Ingrese el quinto numero: ");
		n5 = leer.nextFloat();
	
		prom =(n1+n2+n3+n4+n5)/5;
		System.out.println("El promedio es: " + prom); 
	}
}
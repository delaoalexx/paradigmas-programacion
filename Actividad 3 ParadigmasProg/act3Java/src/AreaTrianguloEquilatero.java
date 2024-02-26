import java.util.Scanner;

public class AreaTrianguloEquilatero {
	
	public static void main(String[] args)
	{
		Scanner leer = new Scanner(System.in);
		float base=0,  altura=0, resultado;
		
		System.out.print("Ingrese la base del triangulo: ");
		base = leer.nextFloat();
		System.out.print("Ingrese la altura del triangulo: ");
		altura = leer.nextFloat();
		
		resultado = (base*altura)/2;
		System.out.println("El resultado es: " + resultado);
		
	}

}

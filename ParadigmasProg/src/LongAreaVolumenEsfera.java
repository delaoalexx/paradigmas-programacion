import java.util.Scanner;

public class LongAreaVolumenEsfera 
{
	public static void main(String[] args) 
	{
		Scanner leer = new Scanner(System.in);
		double radio, longitud, area, volumen;
		
		System.out.print("Ingrese el radio: ");
		radio = leer.nextDouble();
		
		longitud = 2*3.14159*radio;
		area = 4*3.14159*(radio*radio);
		volumen =(((radio*radio*radio)*4)/3)*3.14159;
		
		System.out.println("Longitud de la circunferencia: " + longitud + " unidades.");
		System.out.println("Area de la circunferencia: " + area + " unidades^2.");
		System.out.println("Volumen de la esfera: " + volumen + " unidades^3.");
	}
}

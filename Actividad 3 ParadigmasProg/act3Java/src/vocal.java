import java.util.Scanner;
import java.util.SimpleTimeZone;

public class vocal {
	
	public static void main(String[] args)
	{
		Scanner leer = new Scanner(System.in);
		char letra;
		
		System.out.print("Ingrese la letra: ");
		letra = leer.next().charAt(0);
		
		if(letra=='a'|| letra=='e'||letra=='i'|| letra=='o' || letra=='u'|| 
				letra=='A' || letra=='E'|| letra=='I'||letra=='O'|| letra=='U')
		{
			System.out.println( letra + " es una vocal.");
		}else {
			System.out.println( letra + " no es una vocal.");
		}
		
	   
	}
}





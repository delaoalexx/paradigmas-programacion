import java.util.Scanner;

public class numerosPrimos {
	
	public static void main(String[] args)
	{
		Scanner leer = new Scanner(System.in);
		boolean primo=true;
		int numero;
		
		System.out.print("Ingrese el numero: ");
		numero = leer.nextInt();
		
		 if (numero <= 1 || (numero == 4))
			 primo = false;
	        else if (numero <= 3)
	        	primo = true;
	        else if (numero % 2 == 0 || numero % 3 == 0)
	        	primo = false;
	        else {
	            int i = 5;
	            while (i * i <= numero) {
	                if (numero % i == 0 || numero % (i + 2) == 0) {
	                	primo = false;
	                    break;
	                }
	                i += 6;
	            }
	        }
	        
	        if (primo)
	            System.out.println(numero + " es un numero primo.");
	        else
	            System.out.println(numero + " no es un numero primo.");
	   
	}

}


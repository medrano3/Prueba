	import java.util.Scanner;
public class Par
{


	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		System.out.print("ingrese numero: ");
		int numero= teclado.nextInt();
		if (numero %2==0){
			System.out.print("el numero es par");
		}
			
		else{
			System.out.print("el numero es impar");

		}
	}
}

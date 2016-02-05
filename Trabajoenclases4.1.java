	import java.util.Scanner;
public class Trabajoenclases4.1
{


	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		System.out.print("ingrese numero1: ");
		int numero1= teclado.nextInt();

		if (numero1>=1){
			System.out.print("positivo:" +numero1);
		}
			
		else{
			System.out.print("negativo:" + numero1);

		}
	}
}

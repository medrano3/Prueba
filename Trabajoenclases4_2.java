	import java.util.Scanner;
public class Trabajoenclases4_2
{


	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		System.out.print("ingrese letra: ");
		char letra= teclado.next().charAt(0);

		switch(letra){
			case 'S':System.out.println("Caracter correcto");
			break;
			case 's':System.out.println("Caracter correcto");
			break;
			case 'N':System.out.println("Caracter correcto");
			break;
			case 'n':System.out.println("Caracter correcto");
			break;
			default:System.out.println("Caracter no es vocal");
			break;
		}

	}
}

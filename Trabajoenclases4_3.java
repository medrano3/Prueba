	import java.util.*;
public class Trabajoenclases4_3
{


	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		System.out.print("ingrese letra: ");
		char letra= teclado.next().charAt(0);


		switch(letra){
			case 'A':System.out.println("es vocal");
			break;
			case 'a':System.out.println("es vocal");
			break;
			case 'E':System.out.println("es vocal");
			break;
			case 'e':System.out.println("es vocal");
			break;
			case 'I':System.out.println("es vocal");
			break;
			case 'i':System.out.println("es vocal");
			break;
			case 'O':System.out.println("es vocal");
			break;
			case 'o':System.out.println("es vocal");
			break;
			case 'U':System.out.println("es vocal");
			break;
			case 'u':System.out.println("es vocal");
			break;

			default:System.out.println("Caracter no es vocal");
			break;
		}

	}
}
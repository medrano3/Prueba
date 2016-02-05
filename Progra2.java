import java.util.Scanner;
public class Progra2{


	public static void main (String args[]){

		Scanner teclado=new Scanner(System.in);
		System.out.println("ingrese primer valor");
		int valor1 = teclado.nextInt();
		if ( valor1<1){
			System.out.println("Valor ingresado es incorrecto");
			Progra2.main (null);

		}
		else{
			int i=1;
		while(i<=valor1){
			System.out.println(i);
			i++;

		}
	}
}
}

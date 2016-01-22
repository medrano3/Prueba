import java.util.Scanner;
public class Trabajoenclases2
{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese el nombre del alumno:");


		String nombre= teclado.nextLine();
		System.out.print("Ingrese numero de cuenta:");
		int cuenta = teclado.nextInt();
		System.out.print("Nota 1:");
		double nota1=teclado.nextDouble();
		System.out.print("Nota 2:");
		double nota2=teclado.nextDouble();
		System.out.print("Nota 3:");
		double nota3=teclado.nextDouble();
		System.out.print("Nota 4:");
		double nota4=teclado.nextDouble();
		System.out.print("Nota 5:");
		double nota5=teclado.nextDouble();
		

		double promedio=(nota1+nota2+nota3+nota4+nota5)/5;
		System.out.print("\n\n\n");
		System.out.println("Nombre del Alumno es:" + nombre);
		System.out.println("Numero de cuenta:" + cuenta);
		System.out.println("Nota 1:" + nota1);
		System.out.println("Nota 2:" + nota2);
		System.out.println("Nota 3:" + nota3);
		System.out.println("Nota 4:" + nota4);
		System.out.println("Nota 5:" + nota5);
		System.out.println("Promedio" + promedio);



	}
}
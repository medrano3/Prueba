import java.util.Scanner;
public class Trabajoenclases4_4
{

  
	public static void main(String args[]){

	Scanner teclado=new Scanner(System.in);
	System.out.println("Ingrese numero1");
	int n1=teclado.nextInt();
	System.out.println("Ingrese numero2");
	int n2=teclado.nextInt();
	System.out.println("ingrese numero3");
	int n3=teclado.nextInt();
     

	if(n1<n2&&n1<n3&&n2<n3){
		System.out.println("Los numeros ingresados en forma ascendente");
	}
	else{
		System.out.println("Error");
	}
	if(n1>n2&&n1>n3&&n2>n3){
		System.out.println("Los numeros ingresados en forma Descendete");
	}
	else{
		System.out.println("Error");
	}
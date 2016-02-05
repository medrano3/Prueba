	import java.util.Scanner;
public class Trabajoenclases4
{

  
	public static void main(String args[]){

	Scanner teclado=new Scanner(System.in);
	System.out.println("Ingrese numero1");
	int n1=teclado.nextInt();
	System.out.println("Ingrese numero2");
	int n2=teclado.nextInt();
	System.out.println("ingrese numero3");
	int n3=teclado.nextInt();
        int mayor , menor , medio = 0;

	if(n1>n2&&n1>n3){
    mayor= n1;
    if(n2>n1&&n2>n3){
	mayor=n2;
}

	
}
	else{
	mayor=n3;
}

	if(n1<n2&&n1<n3){
	menor=n1;
	if(n2<n1&&n2<n3){
	menor=n2;
}

	
}
	else{
	menor=n3;
	
}
	medio=(n1+n2+n3)-(mayor+menor);	
	System.out.println("");
	System.out.println("el ascendente de los numeros ingresados es: ");
	System.out.println(menor+"  "+medio+" "+mayor);

		
	}
    
}
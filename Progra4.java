import java.util.Scanner;

public class Progra4 {
    public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
        int x,factorial,valor;
        System.out.print("Ingrese un valor:");
        valor=teclado.nextInt();
        x=1;
        factorial=1;
        while (x<=valor) {
            factorial=factorial*x;
            x=x+1;
        }
      
        System.out.print("La suma de los 10 valores es:");
        System.out.println(factorial);
    }
}
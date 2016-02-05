  import java.util.Scanner;
public class Tarea1
{
	public static void main(String args []){
                Scanner teclado = new Scanner(System.in);
                System.out.print("Ingrese el nombre del empleado");
                String nombre= teclado.nextLine();
                System.out.print("Ingrese Codigo de Empleado:");
                short cod_citas= teclado.nextShortgit();
                System.out.print("Sexo 'F','M':");
                String sexo=teclado.next();
                System.out.print("Ingrese Horas Trabajadas:");
                int horas_trabajadas=teclado.nextInt();
                System.out.print("Ingrese Horas Extras Trabajadas:");
                int horasE_trabajadas=teclado.nextInt();
                System.out.print("Ingrese Pago Por Horas");
                double pago_por_horas=teclado.nextDouble();
                double sueldo_diario=horas_trabajadas*pago_por_horas;
                double sueldo_semanal=(sueldo_diario)*7;
                long sueldo_mensual=sueldo_semanal*4;
                double pagoHE=pago_por_horas*horasE_trabajadas;
                double deducciones=(sueldo_mensual)*0.8;
                float sueldo_anual=(sueldo_mensual)*12;
                double sueldo_hora=(sueldo_mensual/30)/horas_trabajadas;
                double sueldo_despues_deducciones=sueldo_diario+pagoHE-deducciones;





                System.out.print("\n\n\n");
                System.out.println("Codigo de empleado:" + cod_citas);
                System.out.println("Nombre del Empleado" + nombre);
                System.out.println("Sexo:"+sexo);
                System.out.println("Horas Trabajadas" + horas_trabajadas);
                System.out.println("Pago Por Hora" + pago_por_horas);
                System.out.println("Sueldo diario:" + sueldo_diario);
                System.out.println("Sueldo semanal:"+sueldo_semanal);
                System.out.println("Sueldo mensual:" + sueldo_mensual);
                System.out.println("Sueldo anual:" + sueldo_anual);
                System.out.println("Sueldo hora:" + sueldo_hora);
                System.out.println("*--------------------------------------=");
                System.out.println("Pago Horas Extras:"+pagoHE);
                System.out.println("Deducciones:"+ deducciones);
                System.out.println("Sueldo Despues De Deducciones:" + sueldo_despues_deducciones);







		
	}
}

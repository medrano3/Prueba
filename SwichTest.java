public class SwichTest
{
	public static void main(String[] args) {
		char vaChar = 'N';

		switch(vaChar){
			case 'N':System.out.println("Caracter Valido");
			break;
			case 'n':System.out.println("Caracter Valido");
			break;
			case 'S':System.out.println("Caracter Valido");
			break;
			case 's':System.out.println("Caracter Valido");
			break;
			default:System.out.println("Caracter no valido");
			break;


		}
	}
}
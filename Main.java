/**
 * @author Gladys de la Roca, Jackeline Hidalgo
 * Clase Main
 * Main del programa
 * @version 15/08/2016
 */

public class Main {

	public static void main(String[] args) {

		//Mensaje de bienvenida y se muestra el resultado de la operacion
		System.out.println("Bienvenido a la calculadora POST-FIX.\nUsted habrá llenado el respectivo archivo con las operaciones.");
		public StackFactory factor = new StackFactory();
        	public Stack<String> miStack = factor.getStack(parametro()); 
		//String cadena = Calculadora.LeerArchivo("datos.txt");
		
		Scanner keyboard = new Scanner(System.in); 
		public int parametro(){
			int option1 = 0;
			while (option1 == 0){
				System.out.println("[1] ArrayList");
				System.out.println("[2] Vector");
				System.out.println("[3] Lista");
				System.out.print("Seleccione la implementacion para la pila que desee: ");
				try{
					option1 = Integer.parseInt(keyboard.nextLine());
					}
				catch (NumberFormatException e){
					System.out.println();
					System.out.println("Error: opcion invalida");
					System.out.println();
					option1 = 0;
				}
			}
			return option1;
		}
	}
}

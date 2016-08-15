/**
 * @author 
 * Clase Main
 * Main del programa
 * @version 24/07/2016
 */

public class Main {

	public static void main(String[] args) {

		//Mensaje de bienvenida y se muestra el resultado de la operacion
		System.out.println("Bienvenido invocador a la calculadora POST-FIX.\nUsted habrá llenado el respectivo archivo con las operaciones.");
		Factory miFactory = new Factory();
		//String cadena = Calculadora.LeerArchivo("datos.txt");
		
		Scanner keyboard = new Scanner(System.in); 
		int option1 = 0;
        while (option1 == 0){
		    System.out.println("[1] ArrayList");
		    System.out.println("[2] Vector");
		    System.out.println("[3] Lista");
		    System.out.print("Seleccione la implementacion para la pila que desee: ");
		    try{
		    	option1 = Integer.parseInt(keyboard.nextLine());
		    } catch (NumberFormatException e){
			    System.out.println();
			    System.out.println("Error: opcion invalida");
			    System.out.println();
			    option1 = 0;
		    }
        }
        if (option1 == 1){
        	
        }
        if (option1 == 2){
        	
        }
        if (option1 == 3){
        	int option = 0;
            	while (option == 0){
            		System.out.println("[1] Simplemente encadenada");
    		    	System.out.println("[2] Doblemente encadenada");
    		    	System.out.println("[3] Circular");
    		    	System.out.print("Seleccione la implementacion de lista que desee: ");
    		    	try{
    		    		option = Integer.parseInt(keyboard.nextLine());
    		    	} 
    		    	catch (NumberFormatException e){
    		    		System.out.println();
    			    	System.out.println("Error: opcion invalida");
    			    	System.out.println();
    			    	option = 0;
    		    	}
        	}
        	if (option == 1){
        
        	}
        	if (option == 2){
                
        	}
        	if (option == 3){
                
        	}
        }
	}
}	

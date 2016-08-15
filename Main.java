/**
 * @author Gladys de la Roca, Jackeline Hidalgo
 * Clase Main
 * Main del programa
 * @version 15/08/2016
 */

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		//Mensaje de bienvenida y se muestra el resultado de la operacion
		System.out.println("Bienvenido a la calculadora POST-FIX.\nUsted habrá llenado el respectivo archivo con las operaciones.");
		public StackFactory factor = new StackFactory();
        	public Stack<String> miStack = factor.getStack(parametro()); 
		//String cadena = Calculadora.LeerArchivo("datos.txt");
		
		Scanner keyboard = new Scanner(System.in); 
		public int parametro(){
			System.out.println("[1] ArrayList");
			System.out.println("[2] Vector");
			System.out.println("[3] Lista");
			System.out.print("Seleccione la implementacion para la pila que desee: ");
			option1 = keyboard.nextLine();
			return option1;
		}
		
	//PRUEBA
	File f = new File( "src/texto.txt" );
        
        BufferedReader entrada;
        
        public void calculadora4() {
        try {
       
        entrada = new BufferedReader( new FileReader( f ) );
        String linea;
        
        while(entrada.ready()){
            //Detecta lo que se encuentra en la linea leÃ­da del archivo.txt
            linea = entrada.readLine();
            System.out.println(linea);
            linea = linea.substring(0);
            System.out.println(linea);
            numero = linea.length(); 
            //Imprime lo que detecta para verificaciÃ³n
            System.out.println(numero); 
            for (int x=0; x < linea.length(); x++) {
                if (linea.charAt(x) != ' '){
                    //Guarda en una cadena la linea del calculo sin espacios
                    sCadenaSinBlancos += linea.charAt(x);
                }
            }
            //Imprime la linea sin espacios para verificaciÃ³n
            System.out.println(sCadenaSinBlancos);
            
            //EvalÃºa lo que se encuentra dentro de la linea sin espacios hasta que se haya completado el largo
            for(int x=0; x<sCadenaSinBlancos.length(); x++){
                String dato =  Character.toString(sCadenaSinBlancos.charAt(x));
                //Si el caracter no es una operaciÃ³n se guarda el dato
                if( (dato.equals("+") || dato.equals("-") || dato.equals("*") || dato.equals("/")) != true){
                    
                    miStack.push(dato);
                }
                //Si el caracter es una suma saca de la pila los dos ultimos ingresado y realiza operacion
                if(Character.toString(sCadenaSinBlancos.charAt(x)).equals("+")){
                    n2 = Double.parseDouble(miStack.pop());
                    n1 = Double.parseDouble(miStack.pop());
                    miStack.push(Double.toString(n1 + n2));
                }
                //Si el caracter es una resta saca de la pila los dos ultimos ingresado y realiza operacion
                if(Character.toString(sCadenaSinBlancos.charAt(x)).equals("-")){
                    n2 = Double.parseDouble(miStack.pop());
                    n1 = Double.parseDouble(miStack.pop());
                    miStack.push(Double.toString(n1 - n2));
                }
                //Si el caracter es una multiplicacion saca de la pila los dos ultimos ingresado y realiza operacion
                if(Character.toString(sCadenaSinBlancos.charAt(x)).equals("*")){
                    n2 = Double.parseDouble(miStack.pop());
                    n1 = Double.parseDouble(miStack.pop());
                    miStack.push(Double.toString(n1 * n2));
                }
                //Si el caracter es una division saca de la pila los dos ultimos ingresado y realiza operacion
                if(Character.toString(sCadenaSinBlancos.charAt(x)).equals("/")){
                    n2 = Double.parseDouble(miStack.pop());
                    n1 = Double.parseDouble(miStack.pop());
                    miStack.push(Double.toString(n1 / n2));
                }
                
            }
            //ImpresiÃ³n de resultado
            System.out.println(miStack.pop());
            
        }
        }catch (IOException e) {
        e.printStackTrace();
        }
        }
    }
    
    

	}
}

/**
 * @author 
 * Clase Calculadora
 * Clase que maneja la calculadora
 * @version 24/07/2016
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;


    public class Calculadora {
        public StackFactory factor = new StackFactory();
        public IStack<String> miStack = factor.getStack(parametro()); 
        
        int numero;
        double operando1;
        double operando2;
        String sCadenaSinBlancos = "";
        String opcion;
        
     
        public String parametro(){
            opcion = JOptionPane.showInputDialog("Bienvenido a la calculadora POST-FIX\nUsted habrá llenado el respectivo archivo con las operaciones.\nSeleccione implementacion que desee para la pila: \n [1] ArrayList \n [2] Vector \n [3] Lista");
            return opcion;
        }
        File f = new File( "datos.txt" );
        
        BufferedReader entrada;
        
        public void calcular() {
        try {
       
        entrada = new BufferedReader( new FileReader( f ) );
        String linea;
        
        while(entrada.ready()){
            //Detecta lo que se encuentra en la linea leida del archivo.txt
            linea = entrada.readLine();
            System.out.println(linea);
            
            for (int x=0; x < linea.length(); x++) {
                if (linea.charAt(x) != ' '){
                    //Guarda en una cadena la linea del calculo sin espacios
                    sCadenaSinBlancos += linea.charAt(x);
                }
            }
            
            //Evalua lo que se encuentra dentro de la linea sin espacios hasta que se haya completado el largo
            for(int x=0; x<sCadenaSinBlancos.length(); x++){
                String dato =  Character.toString(sCadenaSinBlancos.charAt(x));
                //Si el caracter no es una operacion se guarda el dato
                if( (dato.equals("+") || dato.equals("-") || dato.equals("*") || dato.equals("/")) != true){
                    
                    miStack.Push(dato);
                }
                //Si el caracter es una suma saca de la pila los dos ultimos ingresado y realiza operacion
                if(Character.toString(sCadenaSinBlancos.charAt(x)).equals("+")){
                    operando2 = Double.parseDouble(miStack.Pop());
                    operando1 = Double.parseDouble(miStack.Pop());
                    miStack.Push(Double.toString(operando1 + operando2));
                }
                //Si el caracter es una resta saca de la pila los dos ultimos ingresado y realiza operacion
                if(Character.toString(sCadenaSinBlancos.charAt(x)).equals("-")){
                    operando2 = Double.parseDouble(miStack.Pop());
                    operando1 = Double.parseDouble(miStack.Pop());
                    miStack.Push(Double.toString(operando1 - operando2));
                }
                //Si el caracter es una multiplicacion saca de la pila los dos ultimos ingresado y realiza operacion
                if(Character.toString(sCadenaSinBlancos.charAt(x)).equals("*")){
                    operando2 = Double.parseDouble(miStack.Pop());
                    operando1 = Double.parseDouble(miStack.Pop());
                    miStack.Push(Double.toString(operando1 * operando2));
                }
                //Si el caracter es una division saca de la pila los dos ultimos ingresado y realiza operacion
                if(Character.toString(sCadenaSinBlancos.charAt(x)).equals("/")){
                    operando2 = Double.parseDouble(miStack.Pop());
                    operando1 = Double.parseDouble(miStack.Pop());
                    miStack.Push(Double.toString(operando1 / operando2));
                }
                
            }
            //Resultado
            System.out.println("El resultado es: " + miStack.Pop());
            
        }
        }catch (IOException e) {
        e.printStackTrace();
        }
        }
    }
	
	
		




import java.io.*;
import java.util.StringTokenizer;

/**
 * 
 * @author Pablo Sao
 * @version 1.3
 */

public class PostfixFactory {
    
    //final static String PATH_DATOS = "datos.txt";
    final static String PATH_DATOS = "C:\\datos.txt";
    //identificador de los delimitadores para eliminarse en la informacion
    final static String DELIMITADOR = " \t\n\r\fABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz|°!\"#$%&()=?¡¿'\\´¨[]{}_-:.;,^`¬~";
    
    final static FactoryStack FACTORY = new FactoryStack();
    
    static AbstractList pila = null;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        //Variable de control 
        boolean control_global = true;
        
        //Iniciando el programa con el menu
        
        while(control_global){
            
            //Desplegando menu en la linea de comando
            System.out.println("\nIntrese el número de la opción a implementar que desea utilizar:\n");
            System.out.println("1. Vector");
            System.out.println("2. Arraylist");
            System.out.println("3. Lista Singlenton)");
            System.out.println("4. Lista Circular");
            System.out.println("5. Lista Doble Encadenada");
            System.out.println("6. Salir");
            
            System.out.print("Ingrese opción: ");
            switch(Keyboard.readInt()){
                
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("\n\n\tSaliendo del cálculo");
                    control_global = false;
                    break;
            }
            
        }
        
        
    }
    
    
    private static void calcData() throws IOException, FileNotFoundException{
        iPila pila = new Pila();
        iCalculadora calc = new Calculadora();
        
        double res = 0;
        double a, b;
        int cont = 1;
        int cont2 = 1;
        System.out.println(pila);
        
        StringTokenizer token = new StringTokenizer(getDataFile(), DELIMITADOR);
        /*
        Tokenizer va a separar / parsear el string proporionado por el metodo getDataFile(),
        este metodo toma un buffered reader y un FileReader para leer "Datos.txt"
        * */

        while(token.hasMoreTokens()){


            for (char c: token.nextToken().toCharArray()){
                /*
                Iteramos el String devuelto luego de convertirlo a arreglo de Char

                */
                if (c == '+' || c == '-' || c == '/' || c == '*'){
                    // si esto se cumple es un operador entonces usamos la calculadora
                    //  tambien verificamos si hay suficientes operandos
                    System.out.println("Encontramos un operador : " + Character.toString(c));
                    System.out.println("Stack size: " + pila.size());

                    if (pila.size() < 2){
                        continue;
                        //  no hay suficientas operandos, sigamos buscando operandos
                        // y se tomara el siguiente operador para la operacion

                    } else {
                        switch (c){
                            case '+':
                                while (!pila.empty()){
                                    if (pila.size() == 1){
                                        //  es el ultimo valor
                                        break;

                                    } else {
                                        res = calc.sumar((double)pila.pop(), (double)pila.pop());
                                        pila.push(res);
                                        break; //
                                    }

                                }


                                break;

                            case '-':
                                while (!pila.empty()){
                                    if (pila.size() == 1){
                                        //  es el ultimo valor
                                        break;

                                    } else {
                                        res = calc.restar((double)pila.pop(), (double)pila.pop());
                                        pila.push(res);
                                        break;
                                    }

                                }

                                break;

                            case '*':
                                while (!pila.empty()){
                                    if (pila.size() == 1){
                                        //  es el ultimo valor
                                        break;

                                    } else {
                                        res = calc.multiplicar((double)pila.pop(), (double)pila.pop());
                                        pila.push(res);
                                        break;
                                    }

                                }


                                break;

                            case '/':
                                while (!pila.empty()){
                                    if (pila.size() == 1){
                                        //  es el ultimo valor
                                        break;

                                    } else {
                                        res = calc.dividir((double)pila.pop(), (double)pila.pop());
                                        pila.push(res);
                                        break;
                                    }

                                }

                                break;
                        }
                    }

                } else if (Character.isDigit(c)){
                    pila.push((double)(c - '0'));
                    //  Ya que estamos trabajando con Characters, tienen un valor en ascii
                    // al restarles char '0' restamos 50 y eso nos da el valor real.
                    // tambien podiamos usar Double.parseDouble pero esto es mas cool.
                    System.out.println("Añadiendo a stack: " + c);
                    System.out.println("Stack size: " + pila.size());



                } else {
                    /*
                    Si no es ni numero ni operador podemos obviarlo.
                     */
                    continue;
                }
            }


        }
        System.out.println("Resultado final: " + Double.toString(res));
    }
    
    
    
    /***
     * Metodo para obtener en un string toda la información contenida dentro del archivo .txt
     * 
     * @return String todos los datos ingresados en el archivo de texto 
     */
    public static String getDataFile() throws IOException, FileNotFoundException{
        
        BufferedReader reader;
        File file;
        String linea,datos = "";
        try{
            if((new File(PATH_DATOS)).exists()){ //verificamos que el archivo exista
                
                
                reader = new BufferedReader(new FileReader(PATH_DATOS));
                
                while((linea = reader.readLine()) != null){
                    //concatenamos con un tabular la lectura de la linea,
                    //el tabular se eliminara al separar las expresiones.
                    datos += linea + "\t";
                }
                
                reader.close();
            }
            else{
                System.out.println("El archivo ingresado no fue encontrado.");
            }
            
        }
        //Tomaremos todo tipo de error en la ejecución del bloque de codigo dentro del catch
        catch(Exception e){
            e.printStackTrace();
        }
        
        return datos;
    }
}

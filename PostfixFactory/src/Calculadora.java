//package Main;


/**
 * Clase que utiliza la implementación de la interfaz de iCalculadora
 * @author Pablo Sao
 * @date 28/01/2019
 * @version 1.0
 */
public class Calculadora implements iCalculadora{
    
    /** 
     * Método para realizar la suma entre dos números
     * @param a double primer dígito a sumar
     * @param b double segundo dígito a sumar
     * @return double resultado entre la suma entre a y b
     */

    public double sumar(double a, double b) {
        return a + b;
    }
    
    /** 
     * Método para realizar la resta entre dos números
     * @param a double número al que se le restara el segundo valor
     * @param b double valor a restar al primer número
     * @return double resultado entre la resta de a (primer número) y b (segundo número)
     */

    public double restar(double a, double b) {
        return a - b;
    }
    
    /** 
     * Método para realizar la multiplicación entre dos números
     * @param a double primer número a multiplicar
     * @param b double segundo número a multiplicar
     * @return double resultado de la multiplicación entre los dos números
     */

    public double multiplicar(double a, double b) {
        return a * b;
    }

    /** 
     * Método para realizar una división entre dos números
     * @param a double dividendo
     * @param b double divisor
     * @return double resultado entre los dos números
     */

    public double dividir(double a, double b) {

        return(b == 0)? 0.0 : (a / b);
    }
    
}

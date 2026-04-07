
/**
 * Ingresar dos números decimales y mostrar el resultado de la suma utilizando printf,
con dos decimales.
 * @author msosa 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class main
{
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("ingrese un numero decimal");
        
        double numero = entrada.nextDouble();
        
        System.out.printf("ingrese otro numero decimal");
        
        double numero_Dos = entrada.nextDouble();
        
        double resultado = numero + numero_Dos;
        
        System.out.printf("El resultado es %.2f%n", resultado);      // lo interesante es que trunca, a tener en cuenta  
    }
}

/**
* Pedir un número entero y mostrar:
    a. su doble
    b. su triple
    c. su mitad en formato decimal.
* 
* @author msosa
*/

import java.util.Scanner;

public class main
{
    public static void main (String[] args){
    
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Ingresa un numero: ");
    int numero = entrada.nextInt();
    
    int doble = numero + numero;
    
    int triple = numero + numero + numero;
    
    float mitad = numero / 2;
    
    System.out.println(" El doble del numero es " + doble);
    System.out.println(" El triple del numero es " + triple);
    System.out.println(" La mitad del numero es " + mitad);
    
    
    
    }
    
}
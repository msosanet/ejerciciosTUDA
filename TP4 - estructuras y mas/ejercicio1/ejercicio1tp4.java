    
/**
 * 1. Escribir un programa que solicite al usuario una nota numérica del 1 al 10 e informe
si el alumno está desaprobado, aprobado o promocionado.
 * 
 * @author msosa     
 * @version 
*/
import java.util.Scanner;

public class ejercicio1tp4
{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("ingrese un numero: ");
        
        int numero = scanner.nextInt();
        
        if (numero >= 6 ) {
        System.out.printf("aprobaste");    
        } if (numero >= 8 ) {
            System.out.printf("promocionaste"); }   
        else {
        System.out.printf("Desaprobaste");
        }
    } 
}
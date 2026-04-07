
/**
 * Pide segundos y devuelve horas, minutos y segundos.
 * 
 * @author msosa 
 */
import java.util.Scanner;


public class main
{
    public static void main (String[] ars){
    Scanner scanner = new Scanner(System.in);
        
    System.out.print("ingrese la cantidad de segundos a convertir: ");
    int segundos = scanner.nextInt();
    
    int horas = segundos / 3600;
    int resto = segundos % 3600;
    int minutos = resto / 60;
    int segundosFinal = resto % 60;
    
    System.out.println(horas + " horas, " + minutos + " minutos, " + segundosFinal + " segundos");
    scanner.close();
        
    }
}
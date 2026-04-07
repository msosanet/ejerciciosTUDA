
/**
 * Solicitar al usuario una cantidad de kilómetros y convertirla a metros y centímetros.
 * 
 * @author msosa  
 * @version 
 */
import java.util.Scanner;

public class ejercicio4
{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // pedido inicial
    
    System.out.print("Ingrese la cantidad de kilometros: ");
    double kilometros = scanner.nextDouble();
    
    // conversiones 
    
    System.out.println("Eso en metro es: " + (kilometros*1000) +
                        "\n En centimetros es :" + (kilometros*100000)); 
    
    } 
}
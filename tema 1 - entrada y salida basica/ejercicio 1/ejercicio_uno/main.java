import java.util.Scanner;

/**
 * Pide la ciudad y la provincia de donde es y da un mensaje. E1 - T1
 * @author msosa
 */
public class main
{
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Escribe tu ciudad: ");
    String ciudad = entrada.nextLine();
    
    System.out.print("Escribe tu provincia: ");
    String provincia = entrada.nextLine();
    
    System.out.println("Hola sos de " + ciudad +", y vives en " + provincia + ". Gracias" );
}
}

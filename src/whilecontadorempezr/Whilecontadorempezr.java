
package whilecontadorempezr;
import java.util.Scanner;

public class Whilecontadorempezr {

    
    public static void main(String[] args) {
        int i=1;
        int contador;
        
        System.out.println("CUANTOS NUMEROS QUIERE EN PANTALLA ");
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE UN CONTADOR");
        contador=entrada.nextInt();
        
        while(i <=contador){
            System.out.println(i);
            i++;
            
            
            
        }
        
    }
    
}

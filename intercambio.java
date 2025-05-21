
import java.util.Scanner;


public class intercambio {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int a,b,aux;
        
        System.out.println("ingrese el valor de a");
        a = teclado.nextInt();
        
        System.out.println("ingrese el valor de b");
        b = teclado.nextInt();
        
        System.out.println("los valores antes del cambio son: ");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        
        
        //cambio
        
        aux=a;
        a = b;
        b = aux;
        
         System.out.println("los valores despues del cambio son: ");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }
}

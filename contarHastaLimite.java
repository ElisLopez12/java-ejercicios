import java.util.Scanner;
public class main{
 public static void main(String[]args){
   int limite,inicio=1;
   Scanner teclado=new Scanner(System.in);
   System.out.println("¿Hasta que numero desea contar?");
   limite= teclado.nextInt();
   for(inicio=1;inicio<=limite;inicio++){
     System.out.println(inicio);
    }
   }
}
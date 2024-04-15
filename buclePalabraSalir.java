import java.util.Scanner;
public class salir{
  public static void main(String[]args){
   Scanner teclado=new Scanner(System.in);
   String palabra;
   System.out.println("ingrese una palabra");
   palabra= teclado.nextLine();
   while(!palabra.equalsIgnoreCase("salir")){
   System.out.println("LA PALABRA INGRESADA ES: "+palabra);
    System.out.println("Ingrese otra palabra");
     palabra= teclado.nextLine();
  }
  }
}
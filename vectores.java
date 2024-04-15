import java.util.Scanner;
public class app{
  public static void main(String[]args){
    int vector[]=new int[5];
    System.out.println("hola");
    for(int i=0;i<vector.length;i++){
      System.out.println("ingrese el numero del espacio " +(i+1));
      Scanner teclado=new Scanner(System.in);
      vector[i]=teclado.nextInt();
    }
    System.out.println("-------Los numeros del vector son:-------");
    for(int i=0;i<vector.length;i++){
      System.out.println(vector[i]);
    }
    }
  }
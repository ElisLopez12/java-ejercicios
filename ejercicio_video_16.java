//Realizar un programa que permita cargar 15 números en un vector. Una vez cargados, se necesita que el programa cuente e informe por pantalla cuántas veces se cargó el número 3
import java.util.Scanner;
public class app{
  public static void main(String[]args){
    int vector[]=new int[15];
    int contador=0;
    Scanner teclado= new Scanner(System.in);
    for(int i=0;i<vector.length;i++){
      System.out.println("Ingrese el valor del elemento "+ (i+1) + " del vector");
      vector[i]=teclado.nextInt();
    }
    for(int i=0;i<vector.length;i++){
      if(vector[i]==3){
        contador=contador+1;
      }
    }
      System.out.println("-------Los elementos del vector son: --------");
      for(int i=0;i<vector.length;i++){
        System.out.println(vector[i]);
      }
      System.out.println("--------------------------------------------------");
      System.out.println("el numero 3 fue cargado un total de "+ contador + " veces.");
  }
}
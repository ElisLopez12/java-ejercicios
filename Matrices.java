import java.util.Scanner;
public class app{
  public static void main(String[]args){
    int [][]matriz= new int[5][5];
    System.out.println("-------PROCESO DE LLENADO DE LA MATRIZ------");
    for(int i=0;i<5;i++){
      for(int j=0;j<5;j++){
    System.out.println("ingrese el elemento de la fila "+(i+1) +" y culumna "+(j+1));
        Scanner teclado= new Scanner(System.in);
        matriz[i][j]=teclado.nextInt();
      }
    }
    System.out.println("-----EL CONTENIDO DE LA MATRIZ ES:------");
    for(int i=0;i<5;i++){
      for(int j=0;j<5;j++){
        System.out.print(matriz[i][j]+" ");
      }
      System.out.println("");
    }
  }
}
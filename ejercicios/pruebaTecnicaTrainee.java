/*
Suponer un sistema de reserva de asientos para un anfiteatro. El teatro cuenta con 10 filas de 10 asientos cada una. Se necesita desarrollar un sistema (sin uso de bases de datos, unicamente manejo de datos de forma lógica) que permita llevar a cabo lo siguiente:

1. Cargar el "mapa de las filas y asientos. Indicando con una "X" los asientos ocupados y con una "L" los asientos libres. Al iniciar el programa, todos los asientos deben estar libres.

2. Manejar la reserva de asientos contemplando que un asiento SOLO PUEDE SER RESERVADO si se encuentra en estado "L", en caso de que esté en estado "X", se debera permitir al comprador elegir otro asiento. Si se encuentra en estado "L". deberá pasar automaticamente al estado X.

3. Para finalizar el programa se deberá ingresar un valor en particular. Contemplar que no existe una cantidad exacta de veces que el programa se pueda ejecutar.

4. Contemplar que SOLO EXISTEN 10 FILAS y 10 ASIENTOS. No se pueden vender asientos fuera de esas numeraciones. No se permite "sobreventa".

Consideraciones. No es necesaria implementación ni de IGU ni de BD. Se evaluará 100% el manejo logico del desarrollo de la aplicación.

Extra: En caso de que un cliente solicite visualizar cuáles son los asientos libres, el sistema debe permitir mostrar de forma gráfica el mapa de asientos. NO UTILIZAR IOU para este caso. Utilizar UNICAMENTE lógica y la salida por consola
*/
import java.util.Scanner;
public class trainee{
  public static void main(String[]args){
    char [][]asiento= new char[10][10];
    int f,c;
    String repe="s";
    for(f=0;f<10;f++){
      for(c=0;c<10;c++){
        asiento[f][c]='L';
      }
    }
    Scanner tecladoResp=new Scanner(System.in);
    while(repe.equalsIgnoreCase("s")){
      System.out.println("¿Desea ver los asientos disponibles? S para si y  cualquier otra letra para no");
    String resp=tecladoResp.nextLine();
/* ver los asientos */  
if(resp.equalsIgnoreCase("s")){
      for(f=0;f<10;f++){
        System.out.print((f+1)+" ");
         for(c=0;c<10;c++){
        System.out.print("["+asiento[f][c]+"]");
      }
      System.out.println("");
    }
    System.out.println("");
    }
    System.out.println("ingrese el numero de fila en el que desea reservar");
    Scanner tecladoint=new Scanner(System.in);
    f=tecladoint.nextInt();
    while(f<1 || f>10){
      System.out.println("solo valores entre 1-10");
      f=tecladoint.nextInt();
    }
    System.out.println("ingrese el asiento que desea reservar");
    c=tecladoint.nextInt();
    while(c<1 || c>10){
      System.out.println("solo valores entre 1-10");
      c=tecladoint.nextInt();
    }
    if(asiento[f-1][c-1]==('L')){
      asiento[f-1][c-1]='X';
      System.out.println("Asiento Reservado ");
      for(f=0;f<10;f++){
        System.out.print((f+1)+" ");
         for(c=0;c<10;c++){
        System.out.print("["+asiento[f][c]+"]");
      }
      System.out.println("");
    }
    System.out.println("");
    }else{
      System.out.println("Ese asiento está ocupado");
    }
    System.out.println("¿Desea reservar otro asiento? S para si y  cualquier otra letra para no");
    repe=tecladoResp.nextLine();
    }
  }
}

//tuve bastantes complicaciones, pero todo lo resolvi por mi cuenta, eran errores logicos
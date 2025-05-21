//En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de secundaria. Cada fila corresponde a las notas y al promedio de cada alumno. Se necesite un programa que permita a un profesor cargar, en las 3 posiciones (columnas) de cada fila, las notas del alumno y que en la última columna se calculen los promedios. Una vez realizados los cálculos, se desea mostrar las 3 notas de cada alumno y el promedio correspondiente recorriendo la matriz
import java.util.Scanner;

public class ejercicio_video_17{
  public static void main(String[]args){
    float notas[][]= new float [4][4];
    int i= 0, j=0;
    
    Scanner teclado=new Scanner(System.in);
    for(i=0;i<4;i++){
      float prom=0;
      for(j=0;j<3;j++){
        System.out.println("Ingrese la nota numero "+(j+1)+ " del estudiante #"+(i+1));
        notas[i][j]=teclado.nextFloat();
        while(notas[i][j]<0 || notas[i][j]>10){
          System.out.println("Ingrese una nota valida, solo numeros del 0 al 10");
          notas[i][j]=teclado.nextFloat();
        }
        prom=prom+notas[i][j];
      }
      notas[i][3]=prom/3;
    }
    System.out.println("------------Listado de notas----------------");
    for(i=0;i<4;i++){
      System.out.println("Las notas del estudiante #"+(i+1) + " son:");
      for(j=0;j<3;j++){
        System.out.println(notas[i][j]);
      }
      System.out.println("Su promedio y nota final es: "+ notas[i][3]);
      System.out.println("------------------------------------");
     }
  }
}
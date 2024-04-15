//En tres vectores diferentes se guardan los nombres, temperaturas mínimas y máximas de 5 ciudades. En el primer vector se guardan los nombres de las ciudades, en el segundo las temperaturas mínimas alcanzadas y en el tercero las temperaturas máximas alcanzadas en la última semana. Se necesita un programa que permita la carga de las ciudades, sus temperaturas mínimas y máximas; además, deberá poder informar por pantalla cual fue la ciudad con la temperatura más baja y cual con la temperatura más alta (dando a conocer al mismo tiempo la cantidad de grados).
import java.util.Scanner;
public class ejercicioTemperatura{
  public static void main(String[]args){
   int i, ciudadMin=1,ciudadMax=1;
   String ciudad[]=new String [5];
    Double temperaturaMin[]=new Double [5];
    Double temperaturaMax[]=new Double [5];
    Double minima=0.1,maxima=0.1;
    Scanner teclado=new Scanner(System.in);
    Scanner teclado2=new Scanner(System.in);
    //rellenar los vectores
    for(i=0;i<5;i++){
      System.out.println("Ingrese el nombre de la ciudad #"+(i+1));
      ciudad[i]=teclado.nextLine();
      System.out.println("Ingrese su temperatura minima");
      temperaturaMin[i]=teclado2.nextDouble();
      System.out.println("Ingrese su temperatura maxima");
      temperaturaMax[i]=teclado2.nextDouble();
    }
    //temperatura minima 
    if(!ciudad[4].equals(" ")){
      minima=temperaturaMin[0];
      ciudadMin=0;
      for(i=1;i<5;i++){
        if(temperaturaMin[i]<minima){
          minima=temperaturaMin[i];
          ciudadMin=i;
        }
      }
    }
    //temperatura maxima
    if(!ciudad[4].equals(" ")){
      maxima=temperaturaMax[0];
      ciudadMax=0;
      for(i=1;i<5;i++){
        if(temperaturaMax[i]>maxima){
          maxima=temperaturaMax[i];
          ciudadMax=i;
        }
      }
    }
    //mostrar la temperatura maxima y su ciudad
    System.out.println("La temperatura maxima fue de "+maxima+"°c y se dio en "+ciudad[ciudadMax]);
    //mostrar la temperatura minima y su ciudad
    System.out.println("La temperatura minima fue de "+minima+"°c y se dio en "+ciudad[ciudadMin]);
  }
}
//duré porque no notaba algunos errores yontos que tenía, pero 
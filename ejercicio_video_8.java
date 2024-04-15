import java.util.Scanner;
public class app{
  public static void main(String[]args){
    int puesto;
    double sueldo=0;
    System.out.println("---------ingrese que tipo de puesto ocupa--------");
    System.out.println("1 para repositor");
    System.out.println("2 para cajero");
    System.out.println("3 para supervisor");
    Scanner teclado= new Scanner(System.in);
    puesto=teclado.nextInt();
    while(puesto<1 || puesto>3){
      System.out.println("ingrese un valor entre 1-3");
      puesto=teclado.nextInt();
    }
     
    switch(puesto){
      case 1: sueldo=15890 + (15890*0.1);
      System.out.println("su sueldo es: "+ sueldo);
      break;
      case 2: sueldo=25630.89;
      System.out.println("su sueldo es: "+ sueldo);
      break;
      case 3: sueldo=36560.20-(36560.20*0.11);
      System.out.println("su sueldo es: "+ sueldo);
      break;
    }
  }
}
/*Una pequeña despensa desea calcular los sueldos de sus empleados. Los puestos de los mismos pueden tener 3 categorías: 1- repositor, 2-cajero y 3- supervisor.

• Los repositores cobran $15.890 + un bono del 10%

Los cajeros cobran $25.630,89 fijos

• Los supervisores cobran $35.560,20 en bruto al cual se les descuenta un 11% de jubilación.

Se necesita un programa que, dependiendo del tipo de empleado del que se trate, calcule y muestre en pantalla el correspondiente sueldo.*/
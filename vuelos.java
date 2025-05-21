/*
Una compañia de vuelos cuenta con 6 destinos a los que realiza 3 vuelos diariamente, uno por la mañana, otro al mediodía y otro por la noche. Para administrar estos datos, utiliza una matriz, donde cada fila es un destino y en cada columna se guarda la cantidad de asientos disponibles. Por Ejemplo:

rio de Janeiro 
Cancún
Madrid
Roma
Milán
Iguazú

i. Se necesita un programa que permita la carga de la matriz con la cantidad de asientos para cada vuelo.

ii. Al mismo tiempo, el programa debe permitir a un usuario ingresar el número de destino al que quiere dirigirse, el número de vuelo (dependiendo si quiere viajar a la mañana, al mediodia o a la noche) y la cantidad de pasajes que necesita.

iii. A partir de la solicitud del usuario, el programa debe controlar si hay la cantidad suficiente de asientos para la cantidad de pasajes que se requiere. En caso de que asi sea, se debe mostrar un cartel por pantalla que diga "su reserva fue realizada con éxito" y se debe descontar del total de asientos los solicitados por el usuario. En caso de no haber más asientos disponibles, se debe informar otro cartel que diga "disculpe, no se pudo completar su operación dado que no hay asientos disponibles"
*/
import java.util.Scanner;
public class vuelos{
  public static void main(String[]args){
    int vuelos[][]=new int [6][3];
    String destinos[]= {"rio de Janeiro","Cancún","Madrid","Roma","Milán","Iguazú"};
    Scanner teclado=new Scanner(System.in);
    Scanner tecladoResp=new Scanner(System.in);
    
    //rellenar los vuelos
    String mañanaTardeNoche;
    for(int d=0;d<6;d++){
      for(int v=0;v<3;v++){
        
        if(v==0){
          mañanaTardeNoche="mañana";
        }else if(v==1){
          mañanaTardeNoche="tarde";
        }else {
          mañanaTardeNoche="noche";
        }
        System.out.println("Indique la cantidad de asientos disponibles hasta "+destinos[d]+" en el vuelo de la "+mañanaTardeNoche);
        vuelos[d][v]=teclado.nextInt();
        while(vuelos[d][v]<0){
        System.out.println("No puede ingresr un número negativo");
        vuelos[d][v]=teclado.nextInt()-1;
        } 
      }
    }
    
    //solicitudes de usuario
    String resp="s";
    int auxDestino,auxHorario,boletosCantidad;
    while(resp.equalsIgnoreCase("s")){
      System.out.println("----BIENVENIDO AL SISTEMA DE RESERVA DE VUELOS----");
      //Selecionar Destino
      System.out.println("Seleccione su destino (marque el número correspondiente)");
      System.out.println("1 rio de Janeiro");
      System.out.println("2 Cancún");
      System.out.println("3 Madrid");
      System.out.println("4 Roma");
      System.out.println("5 Milán");
      System.out.println("6 Iguazú");
      auxDestino=teclado.nextInt()-1;
      while(auxDestino>5 || auxDestino<0){
        System.out.println("Ingrese un número valido 1-6");
        auxDestino=teclado.nextInt()-1;
      }
      
      //Seleccionar vuelo
      System.out.println("Seleccione el horario en el que desea volar");
      System.out.println("1 Manaña");
      System.out.println("2 Tarde");
      System.out.println("3 Noche");
      auxHorario=teclado.nextInt()-1;
      while(auxHorario>2 || auxHorario<0){
        System.out.println("Ingrese un número valido 1-3");
        auxHorario=teclado.nextInt()-1;
      }
      //catidad de boletos
      System.out.println("indique cuantos boletos desea");
      boletosCantidad=teclado.nextInt();
      
      if(boletosCantidad<=vuelos[auxDestino][auxHorario]){
        vuelos[auxDestino][auxHorario]=vuelos[auxDestino][auxHorario]-boletosCantidad;
        System.out.println("Su reserva fue realizada con éxito");
      }else{
        System.out.println("disculpe, no se pudo completar su operación dado que no hay asientos disponibles");
      }
      System.out.println("Cantidad de asientos restantes en ese vuelo: "+vuelos[auxDestino][auxHorario]);
      System.out.println("¿Desea hacer otra reserva? s para si, cualquier otra letra para no");
      resp=tecladoResp.next();
    }
  }
}
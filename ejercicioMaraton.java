/*
En la ciudad de Oberá, Misiones se realiza año a año la "Maratón del Inmigrante" en el marco de la Fiesta Nacional del Inmigrante. El evento cuenta con un dia de inscripciones el día anterior a la carrera, por lo que se desconoce la cantidad exacta de inscritos que puede llegar a haber. Desde la Federación de Colectividades (Organismo que organiza), manifestaron que se solicitan los siguientes datos para la inscripción de cada participante: dni, nombre y edad.
En cuanto a las categorías posibles para una inscripción, se manejan las siguientes:

  Menores A (de 6 a 10 años)

  Menores B (de 11 a 17 años)

  Juveniles (de 18 a 30 años)

  Adultos (de 31 a 50 años)

  Adultos mayores (mayores de 50 años)


Se necesita un programa que, a partir del ingreso de los datos y edad de cada participante, se muestre por pantalla a qué categoria debe ser inscripto. Cabe destacar que, al finalizar el día, para dar fin a las inscripciones, se debe ingresar un dni con el valor 0, y un nombre con la palabra "fin".
*/
import java.util.Scanner;
import java.io.IOException;
public class ejercicioMaraton{
  public static void main(String[]args){
    int edad, dni;
    String nombre="", categoria="",continuar;
    Scanner tecladoString= new Scanner(System.in);
    Scanner tecladoInt= new Scanner(System.in);

    System.out.println("---Inscripciones para el Maraton Del Inmigrante---");
    do{
      System.out.println("Ingrese su nombre y apellido");
      nombre= tecladoString.nextLine();
      System.out.println("Ingrese su DNI");
      dni= tecladoInt.nextInt();
      System.out.println("Ingrese su edad");
      edad=tecladoInt.nextInt();
      if(edad<6){
        System.out.println("la edad minima es de 6 años");
        }
        else if(edad>5 && edad<11){
          categoria="Menores A";
        }else if(edad>10 && edad<18){
            categoria="Menores B";
        }else if(edad>17 && edad<31){
          categoria="Juveniles";
        }else if(edad>30 && edad<51){
          categoria="adultos";
        }else if(edad>51){
          categoria="adultos mayores";
        }
      if(edad!=0 && !nombre.equalsIgnoreCase("fin") && edad>5){
        System.out.println("-------DATOS DE INSCRIPCION-------");
      System.out.println("Participante: "+ nombre);
      System.out.println("DNI: "+dni);
      System.out.println("Edad:" + edad);
      System.out.println("Categoría: "+categoria);
      System.out.println("--------------------------------------");
      }
      // Esperar a que el usuario presione enter para continuar
        System.out.println("\nPresione Enter para continuar...");
         try {
           System.in.read();
         } catch (IOException e) {
          e.printStackTrace();
         }


    }while(dni!=0 && !nombre.equalsIgnoreCase("fin"));
  }
}
//tuve un problemita, cuando se repetía eo ciclo, se saltaba el ingreso del nombre, se lo pregunté a chat gpt y llegé a la respuesta, hay que limpiar el buffer del Sacnner antes de volver a ingresar un String, eso se hace poniendo al final del ciclo "nombredelscanner.nextLine()". ES MUCHO MEJOR declarar un Scanner diferente para cada tipo de dato, asi ni se rompe nada y no hace falta limpiar el buffer 
//ademas, las funcionalidades de presionar enter y limpiar la consola las agregué con chatgpt, debo aprender a haceras por mi cuents
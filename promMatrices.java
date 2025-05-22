
import java.util.Scanner;

public class promMatrices {

    public static void main(String args[]) {
        int notas[][] = new int[4][3];
        int prom[] = new int[4];
        int aux, promedio;
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            aux = 0;
            System.out.println("Notas del estudiante numero: " + (i + 1));
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese la nota numero: " + (j + 1));
                notas[i][j] = teclado.nextInt();
                while (notas[i][j] < 1 || notas[i][j] > 10) {
                    System.out.println("ingrese una calificacion valida, solo notas entre 1 y 10");
                    notas[i][j] = teclado.nextInt();
                }
                aux = aux + notas[i][j];
            }
            promedio = aux / 3;
            prom[i] = promedio;
        }

        //mostrar las notas y  promedios de los estudiantes
        System.out.println("---------------------calificaciones finales del los estudiantes-----------------------");
        for (int i = 0; i < 4; i++) {
            System.out.print("estudiante: " + (i + 1)+ "|");
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + notas[i][j]);
            }
            System.out.print(" promedio: " + prom[i]);
            System.out.println(" ");
        }
    }
}

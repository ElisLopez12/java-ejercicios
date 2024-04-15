//el bucle do while es un bucle while que obligatoriamente se ejecuta al menos una vez
public class EjemploDoWhile {
    public static void main(String[] args) {
        int contador = 1;
        
        do {
            System.out.println("El contador es: " + contador);
            contador++;
        } while (contador <= 5);
    }
}
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int response = 0;

        // Do While
        do {
            System.out.println("Selecciona el numero de la opcion deseada");
            System.out.println("1. Movies");
            System.out.println("2 Series");
            System.out.println("0. Salir");

            // Leer desde el teclado
            // System.in Representa la entrada del flujo de datos
            Scanner sc = new Scanner(System.in);
            // Obteniendo la respuesta
            response = Integer.valueOf(sc.nextLine());

            switch(response) {
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("Selecciona una opcion correcta");
            }
        } while(response != 0);
        System.out.println("Se termino el programa");
    }
}

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcio;
        do {
            System.out.println("** Menú **");
            System.out.println("1. Veure menú");
            System.out.println("2. Realitzar comanda");
            System.out.println("3. Imprimir factura");
            System.out.println("4. Sortir");

            // Llegeix l'opció seleccionada per l'usuari
            opcio = input.nextInt();

            // Executa la funcionalitat corresponent a l'opció seleccionada
            switch (opcio) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    // Surt del programa
                    System.out.println("Adeu!");
                    break;
                default:
                    // Opció no vàlida
                    System.out.println("Opció no vàlida.");
            }
        } while (opcio != 4); // Add this line to close the do-while loop
    }
}

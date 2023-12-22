import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcioprincipal = 1;
        int opciocarta = 1;
        do {
            System.out.println("** Menú **");
            System.out.println("1. Veure menú");
            System.out.println("2. Realitzar comanda");
            System.out.println("3. Imprimir factura");
            System.out.println("4. Sortir");

            // Llegeix l'opció seleccionada per l'usuari
            opcioprincipal = input.nextInt();

            // Executa la funcionalitat corresponent a l'opció seleccionada
            switch (opcioprincipal) {
                case 1:
                    //Opció per mostrar el menú
                    System.out.println("** Menú **");
                    System.out.println("** 1. Amanides **");
                    System.out.println("** 2. Pastes **");
                    System.out.println("** 3. Carns **");
                    System.out.println("** 4. Peixos **");
                    System.out.println("** 6. Begudes Alcoholiques **");
                    System.out.println("** 7. Begudes no Alcoholiques **");
                    System.out.println("");
                    System.out.println("Introdueix un nombre del 1 al 7 per escollir...");
                    opciocarta = input.nextInt();
                    switch (opciocarta) {
                        case 1:
                            System.out.println("** Amanides **");
                        break;
                        case 2:
                            System.out.println("** Pastes **");
                            break;
                    }
                    break;
                case 2:
                    //Opció per mostrar la comanda

                    break;
                case 3:
                    //Opció per imprimir la factura

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

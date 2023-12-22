import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcioprincipal = 0;
        int opciocarta = 0;

        do {

            System.out.println("");
            System.out.println("** Menú **");
            System.out.println("1. Veure menú");
            System.out.println("2. Realitzar comanda");
            System.out.println("3. Imprimir factura");
            System.out.println("4. Sortir");
            System.out.println("");
            System.out.print("Introdueix un nombre del 1 al 4 per seleccionar una opció de les disponibles: ");

            // Llegeix l'opció seleccionada per l'usuari
            opcioprincipal = input.nextInt();

            // Executa la funcionalitat corresponent a l'opció seleccionada
            switch (opcioprincipal) {
                case 1:
                    //Opció per mostrar el menú
                    System.out.println("");
                    System.out.println("** Menú **");
                    System.out.println("** 1. Amanides **");
                    System.out.println("** 2. Pastes **");
                    System.out.println("** 3. Carns **");
                    System.out.println("** 4. Peixos **");
                    System.out.println("** 5. Begudes Alcoholiques **");
                    System.out.println("** 6. Begudes no Alcoholiques **");
                    System.out.println("");
                    System.out.print("Introdueix un nombre del 1 al 6 per escollir. Posa un 0 per tornar al menu principal: ");

                    do {
                        opciocarta = input.nextInt();
                        switch (opciocarta) {
                            case 1:
                                System.out.println("");
                                System.out.println("** Amanides **");
                                System.out.println("** ID(1): Amanida Cèsar (10 euros) **");
                                System.out.println("** ID(2): Amanida amb formatge de cabra (12 euros) **");
                                System.out.println("** ID(3): Amanida verda (8 euros) **");
                                System.out.println("");
                                System.out.print("Recorda: Posa un 0 per tornar al menu principal: ");
                                break;
                            case 2:
                                System.out.println("");
                                System.out.println("** Pastes **");
                                System.out.println("** ID(4): Macarrons a la bolonyesa (14 euros) **");
                                System.out.println("** ID(5): Pasta fresca (12 euros) **");
                                System.out.println("** ID(6): Spaghetti amb formatge (12 euros) **");
                                System.out.println("");
                                System.out.print("Recorda: Posa un 0 per tornar al menu principal: ");
                                break;
                            case 3:
                                System.out.println("");
                                System.out.println("** Carns **");
                                System.out.println("** ID(7): Llibrets amb formatge (14 euros) **");
                                System.out.println("** ID(8): Entrecot 400g (20 euros) **");
                                System.out.println("** ID(9): Costelles de xai (22 euros) **");
                                System.out.println("");
                                System.out.print("Recorda: Posa un 0 per tornar al menu principal: ");
                                break;
                            case 4:
                                System.out.println("");
                                System.out.println("** Peixos **");
                                System.out.println("** ID(10): Durada a la planxa (16 euros) **");
                                System.out.println("** ID(11): Rap (23 euros) **");
                                System.out.println("** ID(12): Llenguado (30 euros) **");
                                System.out.println("");
                                System.out.print("Recorda: Posa un 0 per tornar al menu principal: ");
                                break;
                            case 5:
                                System.out.println("");
                                System.out.println("** Begudes Alcoholiques **");
                                System.out.println("** ID(13): Vi blanc (8 euros) **");
                                System.out.println("** ID(14): Vi negre (8 euros) **");
                                System.out.println("** ID(15): Sangria (8 euros) **");
                                System.out.println("");
                                System.out.print("Recorda: Posa un 0 per tornar al menu principal: ");
                                break;
                            case 6:
                                System.out.println("");
                                System.out.println("** Begudes no Alcoholiques **");
                                System.out.println("** ID(16): Aigua (1 euro) **");
                                System.out.println("** ID(17): Refresc (2,5 euros) **");
                                System.out.println("** ID(18): Café (4 euros) **");
                                System.out.println("");
                                System.out.print("Recorda: Posa un 0 per tornar al menu principal: ");
                                break;
                            case 0:
                                // L'usuari vol tornar al menú principal
                                break;
                            default:
                                // Opció no vàlida
                                System.out.println("Opció no vàlida.");
                                System.out.println("");
                        }
                    } while (opciocarta != 0);

                    break;
                case 2:
                    //Opció per mostrar la comanda
                    break;
                case 3:
                    //Opció per imprimir la factura
                    break;
                case 4:
                    // Surt del programa
                    System.out.println("Adeu! Fins aviat!");
                    break;
                default:
                    // Opció no vàlida
                    System.out.println("Opció no vàlida.");
                    System.out.println("");
            }
        } while (opcioprincipal != 4);
    }
}

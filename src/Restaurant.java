import java.util.Scanner;
import java.util.ArrayList;

public class Restaurant {
    public static void main(String[] args) {

        //Inicialitzem el Scanner
        Scanner input = new Scanner(System.in);

        // Inicialitzem les variables
        int opcioprincipal;
        int opciocarta;
        int opcioComanda;
        boolean sortir;
        boolean isComandaEmpty = true;
        double IVA = 0.21;

        // Fem l'array per a la comanda
        int[] comanda = new int[10]; // Array with a maximum of 10 items

        // Colors per el text
        final String BLACK = "\033[30m";
        final String RED = "\033[31m";
        final String GREEN = "\033[32m";
        final String YELLOW = "\033[33m";
        final String BLUE = "\033[34m";
        final String PURPLE = "\033[35m";
        final String CYAN = "\033[36m";
        final String WHITE = "\033[37m";
        final String ORANGE = "\033[91m";

        // Colors Brillants
        final String BRIGHT_BLACK = "\033[90m";
        final String BRIGHT_RED = "\033[91m";
        final String BRIGHT_GREEN = "\033[92m";
        final String BRIGHT_YELLOW = "\033[93m";
        final String BRIGHT_BLUE = "\033[94m";
        final String BRIGHT_PURPLE = "\033[95m";
        final String BRIGHT_CYAN = "\033[96m";
        final String BRIGHT_WHITE = "\033[97m";

        // Colors per el fons
        final String BG_BLACK = "\033[40m";
        final String BG_RED = "\033[41m";
        final String BG_GREEN = "\033[42m";
        final String BG_YELLOW = "\033[43m";
        final String BG_BLUE = "\033[44m";
        final String BG_PURPLE = "\033[45m";
        final String BG_CYAN = "\033[46m";
        final String BG_WHITE = "\033[47m";

        // Colors brillants per el fons
        final String BG_BRIGHT_BLACK = "\033[100m";
        final String BG_BRIGHT_RED = "\033[101m";
        final String BG_BRIGHT_GREEN = "\033[102m";
        final String BG_BRIGHT_YELLOW = "\033[103m";
        final String BG_BRIGHT_BLUE = "\033[104m";
        final String BG_BRIGHT_PURPLE = "\033[105m";
        final String BG_BRIGHT_CYAN = "\033[106m";
        final String BG_BRIGHT_WHITE = "\033[107m";

        // Altres estils
        final String RESET = "\u001B[0m";
        final String BOLD = "\033[1m";
        final String UNDERLINE = "\033[4m";
        final String REVERSED = "\033[7m";

        // Definim els colors que volem fer servir
        final String RED_ON_YELLOW = RED + BG_YELLOW;

        //Fem el String amb els Productes i els seus Preus
        String[][] productes = {
                { "Amanida Cèsar", "10"},
                {"Amanida amb formatge de cabra", "12"},
                {"Amanida verda", "8"},
                {"Macarrons a la bolonyesa", "14"},
                {"Pasta fresca", "12"},
                {"Spaghetti amb formatge", "12"},
                {"Llibrets amb formatge", "14"},
                {"Entrecot 400g", "20"},
                {"Costelles de xai", "22"},
                {"Durada a la planxa", "16"},
                {"Rap", "23"},
                {"Llenguado", "30"},
                {"Vi blanc", "8"},
                {"Vi negre", "8"},
                {"Sangria", "8"},
                {"Aigua", "1"},
                {"Refresc", "2.5"},
                {"Café", "4"}
        };

        do {
            System.out.println("");
            System.out.println("** Menú **");
            System.out.println(BLUE + "1. Veure menú" + RESET);
            System.out.println(ORANGE + "2. Realitzar comanda" + RESET);
            System.out.println(GREEN + "3. Imprimir factura" + RESET);
            System.out.println(RED + "4. Sortir" + RESET);
            System.out.println("");
            System.out.print("Introdueix un nombre del 1 al 4 per seleccionar una opció de les disponibles: ");

            opcioprincipal = input.nextInt();

            switch (opcioprincipal) {
                case 1:
                    //Opció per mostrar el menú
                    System.out.println("");
                    System.out.println("** Menú **");
                    System.out.println(GREEN + "** 1. Amanides **" + RESET);
                    System.out.println(YELLOW + "** 2. Pastes **" + RESET);
                    System.out.println(RED + "** 3. Carns **" + RESET);
                    System.out.println(BLUE + "** 4. Peixos **" + RESET);
                    System.out.println(PURPLE + "** 5. Begudes Alcoholiques **" + RESET);
                    System.out.println(WHITE + "** 6. Begudes no Alcoholiques **" + RESET);
                    System.out.println("");
                    System.out.print("Introdueix un nombre del 1 al 6 per escollir. Posa un 0 per tornar al menu principal: ");

                    do {
                        opciocarta = input.nextInt();
                        switch (opciocarta) {
                            case 1:
                                System.out.println("");
                                System.out.println(GREEN + "** Amanides **" + RESET);
                                System.out.println("** " + RED + "ID(1)" + GREEN + ": Amanida Cèsar" + BLUE + " (10 euros)" + RESET + " **");
                                System.out.println("** " + RED + "ID(2)" + GREEN + ": Amanida amb formatge de cabra" + BLUE + " (12 euros)" + RESET + " **");
                                System.out.println("** " + RED + "ID(3)" + GREEN + ": Amanida verda " + GREEN + "(SENSE GLUCOSA)" + BLUE + " (8 Euros)" + RESET + " **");
                                System.out.println("");
                                System.out.print("Recorda: Posa un 0 per tornar al menu principal: ");
                                break;
                            case 2:
                                System.out.println("");
                                System.out.println(YELLOW + "** Pastes **" + RESET);
                                System.out.println("** " + RED + "ID(4)" + YELLOW + ": Macarrons a la bolonyesa" + BLUE + " (14 euros)" + RESET + " **");
                                System.out.println("** " + RED + "ID(5)" + YELLOW + ": Pasta fresca" + BLUE + " (12 euros)" + RESET + " **");
                                System.out.println("** " + RED + "ID(6)" + YELLOW + ": Spaghetti amb formatge" + BLUE + " (12 euros)" + RESET + " **");
                                System.out.println("");
                                System.out.print("Recorda: Posa un 0 per tornar al menu principal: ");
                                break;
                            case 3:
                                System.out.println("");
                                System.out.println(RED + "** Carns **" + RESET);
                                System.out.println("** " + RED + "ID(7)" + RED + ": Llibrets amb formatge" + BLUE + " (14 euros)" + RESET + " **");
                                System.out.println("** " + RED + "ID(8)" + RED + ": Entrecot 400g" + BLUE + " (20 euros)" + RESET + " **");
                                System.out.println("** " + RED + "ID(9)" + RED + ": Costelles de xai" + BLUE + " (22 euros)" + RESET + " **");
                                System.out.println("");
                                System.out.print("Recorda: Posa un 0 per tornar al menu principal: ");
                                break;
                            case 4:
                                System.out.println("");
                                System.out.println(BLUE + "** Peixos **" + RESET);
                                System.out.println("** " + RED + "ID(10)" + BLUE + ": Durada a la planxa" + BLUE + " (16 euros)" + RESET + " **");
                                System.out.println("** " + RED + "ID(11)" + BLUE + ": Rap" + BLUE + " (23 euros)" + RESET + " **");
                                System.out.println("** " + RED + "ID(12)" + BLUE + ": Llenguado" + BLUE + " (30 euros)" + RESET + " **");
                                System.out.println("");
                                System.out.print("Recorda: Posa un 0 per tornar al menu principal: ");
                                break;
                            case 5:
                                System.out.println("");
                                System.out.println(PURPLE + "** Begudes Alcoholiques **" + RESET);
                                System.out.println("** " + RED + "ID(13)" + PURPLE + ": Vi blanc" + BLUE + " (8 euros)" + RESET + " **");
                                System.out.println("** " + RED + "ID(14)" + PURPLE + ": Vi negre" + BLUE + " (8 euros)" + RESET + " **");
                                System.out.println("** " + RED + "ID(15)" + PURPLE + ": Sangria" + BLUE + " (8 euros)" + RESET + " **");
                                System.out.println("");
                                System.out.print("Recorda: Posa un 0 per tornar al menu principal: ");
                                break;
                            case 6:
                                System.out.println("");
                                System.out.println(WHITE + "** Begudes no Alcoholiques **" + RESET);
                                System.out.println("** " + RED + "ID(16)" + CYAN + ": Aigua" + BLUE + " (1 euro)" + RESET + " **");
                                System.out.println("** " + RED + "ID(17)" + ORANGE + ": Refresc" + BLUE + " (2,5 euros)" + RESET + " **");
                                System.out.println("** " + RED + "ID(18)" + BLACK + ": Café" + BLUE + " (4 euros)" + RESET + " **");
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
                    do {
                        System.out.println("");
                        System.out.println("** Comanda **");
                        for (int item : comanda) {
                            if (item != 0) {
                                isComandaEmpty = false;
                                break;
                            }
                        }
                        if (isComandaEmpty) {
                            System.out.println("La comanda esta buida...");
                        } else {
                            // Imprimim els items que estan a la comanda (no son un 0)
                            for (int item : comanda) {
                                if (item != 0) {
                                    System.out.print(item + " ");
                                }
                            }
                            System.out.println("");
                        }
                        System.out.println("");
                        System.out.println(BLUE + "1. Afegir objectes");
                        System.out.println(ORANGE + "2. Treure objectes");
                        System.out.println(GREEN + "0. Tornar");
                        System.out.print(RED + "Selecciona una opció: ");
                        System.out.println("");

                        opcioComanda = input.nextInt();

                        switch (opcioComanda) {
                            case 1:
                                // Codi per afegir un item al Array
                                System.out.print("Introdueix l'ID de l'objecte a afegir: ");
                                int itemAfegir = input.nextInt();

                                boolean afegit = false;
                                for (int i = 0; i < comanda.length; i++) {
                                    if (comanda[i] == 0) { // Buscar el primer lloc lliure
                                        comanda[i] = itemAfegir;
                                        afegit = true;
                                        System.out.println("Objecte amb ID " + itemAfegir + " afegit a la comanda.");
                                        break;
                                    }
                                }
                                if (!afegit) {
                                    System.out.println("Comanda plena. No es pot afegir més items.");
                                }
                                break;

                            case 2:
                                // Code to remove an item from the array
                                System.out.println("Introdueix l'ID de l'objecte a treure: ");
                                int itemTreure = input.nextInt();

                                boolean trobat = false;
                                for (int i = 0; i < comanda.length; i++) {
                                    if (comanda[i] == itemTreure) {
                                        comanda[i] = 0; // Treure un element tornant a posar un 0 (valor nul)
                                        trobat = true;
                                        System.out.println("Objecte amb ID " + itemTreure + " tret de la comanda.");
                                        break;
                                    }
                                }
                                if (!trobat) {
                                    System.out.println("L'objecte amb ID " + itemTreure + " no es troba a la comanda.");
                                }
                                break;

                            case 0:
                                // L'usuari vol tornar al menú principal
                                break;

                            default:
                                System.out.println(RED +"Opció no vàlida.");
                        }
                    } while (opcioComanda != 0);
                    break;

                case 3:
                    double totalSinIVA = 0;
                    System.out.println("");
                    System.out.println("Imprimint factura...");
                    System.out.println("");
                    System.out.println("Items comandats:");
                    for (int id : comanda) {
                        if (id > 0 && id <= productes.length) {
                            String nombre = productes[id - 1][0];
                            double precio = Double.parseDouble(productes[id - 1][1]);
                            System.out.println(nombre + ": " + precio + " euros");
                            totalSinIVA += precio;
                        }
                    }
                    double totalConIVA = totalSinIVA * (1 + IVA);
                    System.out.println("");
                    System.out.println(GREEN + "Total sin IVA: " + totalSinIVA + " euros");
                    System.out.println(RED +"Total con IVA (" + (IVA * 100) + "%): " + totalConIVA + " euros");
                    System.out.println("");
                    System.out.print(BLUE + "Desitja realitzar una altre comanda? (True (Si) o False (No)):");
                    sortir = input.nextBoolean();
                    if (sortir) {
                        break;
                    } else {
                        opcioprincipal = 4;
                    }

                case 4:
                    // Exit the program
                    System.out.println("");
                    System.out.println("Adeu! Fins aviat!");
                    break;

                default:
                    // Invalid option
                    System.out.println(RED + "Opció no vàlida.");
            }
        } while (opcioprincipal != 4);

        input.close(); // Always close your resources!
    }
}
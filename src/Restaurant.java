import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {

        // Inicialitzem el Scanner
        Scanner input = new Scanner(System.in);

        // Inicialitzem les variables
        int opcioprincipal = 0;
        int opciocarta = 0;
        int opcioComanda = 0;
        boolean sortir = true;
        boolean isComandaBuida = true;
        double totalSinIVA = 0;
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

        // Fem el String amb els Productes i els seus Preus
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
            // Posem les opcions del menú principal
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
                // Case 1: Veure Menú
                case 1:
                    // Opció per mostrar la carta de productes del restaurant
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

                            // Mostrem l'apartat de les Amanides
                            case 1:
                                System.out.println("");
                                System.out.println(GREEN + "** Amanides **" + RESET);
                                System.out.println("** " + RED + "ID(1)" + GREEN + ": Amanida Cèsar" + BLUE + " (10 euros)" + RESET + " **");
                                System.out.println("** " + RED + "ID(2)" + GREEN + ": Amanida amb formatge de cabra" + BLUE + " (12 euros)" + RESET + " **");
                                System.out.println("** " + RED + "ID(3)" + GREEN + ": Amanida verda " + GREEN + "(SENSE GLUCOSA)" + BLUE + " (8 Euros)" + RESET + " **");
                                System.out.println("");
                                System.out.print("Recorda: Posa un 0 per tornar al menu principal: ");
                                break;

                            // Mostrem l'apartat de les Pastes
                            case 2:
                                System.out.println("");
                                System.out.println(YELLOW + "** Pastes **" + RESET);
                                System.out.println("** " + RED + "ID(4)" + YELLOW + ": Macarrons a la bolonyesa" + BLUE + " (14 euros)" + RESET + " **");
                                System.out.println("** " + RED + "ID(5)" + YELLOW + ": Pasta fresca" + BLUE + " (12 euros)" + RESET + " **");
                                System.out.println("** " + RED + "ID(6)" + YELLOW + ": Spaghetti amb formatge" + BLUE + " (12 euros)" + RESET + " **");
                                System.out.println("");
                                System.out.print("Recorda: Posa un 0 per tornar al menu principal: ");
                                break;

                            // Mostrem l'apartat de les Carns
                            case 3:
                                System.out.println("");
                                System.out.println(RED + "** Carns **" + RESET);
                                System.out.println("** " + RED + "ID(7)" + RED + ": Llibrets amb formatge" + BLUE + " (14 euros)" + RESET + " **");
                                System.out.println("** " + RED + "ID(8)" + RED + ": Entrecot 400g" + BLUE + " (20 euros)" + RESET + " **");
                                System.out.println("** " + RED + "ID(9)" + RED + ": Costelles de xai" + BLUE + " (22 euros)" + RESET + " **");
                                System.out.println("");
                                System.out.print("Recorda: Posa un 0 per tornar al menu principal: ");
                                break;

                            // Mostrem l'apartat dels Peixos
                            case 4:
                                System.out.println("");
                                System.out.println(BLUE + "** Peixos **" + RESET);
                                System.out.println("** " + RED + "ID(10)" + BLUE + ": Durada a la planxa" + BLUE + " (16 euros)" + RESET + " **");
                                System.out.println("** " + RED + "ID(11)" + BLUE + ": Rap" + BLUE + " (23 euros)" + RESET + " **");
                                System.out.println("** " + RED + "ID(12)" + BLUE + ": Llenguado" + BLUE + " (30 euros)" + RESET + " **");
                                System.out.println("");
                                System.out.print("Recorda: Posa un 0 per tornar al menu principal: ");
                                break;

                            // Mostrem la llista de Begudes Alcoholiques
                            case 5:
                                System.out.println("");
                                System.out.println(PURPLE + "** Begudes Alcoholiques **" + RESET);
                                System.out.println("** " + RED + "ID(13)" + PURPLE + ": Vi blanc" + BLUE + " (8 euros)" + RESET + " **");
                                System.out.println("** " + RED + "ID(14)" + PURPLE + ": Vi negre" + BLUE + " (8 euros)" + RESET + " **");
                                System.out.println("** " + RED + "ID(15)" + PURPLE + ": Sangria" + BLUE + " (8 euros)" + RESET + " **");
                                System.out.println("");
                                System.out.print("Recorda: Posa un 0 per tornar al menu principal: ");
                                break;

                            // Mostrem la llista de Begudes NO Alcoholiques
                            case 6:
                                System.out.println("");
                                System.out.println(WHITE + "** Begudes no Alcoholiques **" + RESET);
                                System.out.println("** " + RED + "ID(16)" + CYAN + ": Aigua" + BLUE + " (1 euro)" + RESET + " **");
                                System.out.println("** " + RED + "ID(17)" + ORANGE + ": Refresc" + BLUE + " (2,5 euros)" + RESET + " **");
                                System.out.println("** " + RED + "ID(18)" + BLACK + ": Café" + BLUE + " (4 euros)" + RESET + " **");
                                System.out.println("");
                                System.out.print("Recorda: Posa un 0 per tornar al menu principal: ");
                                break;

                            // Opció per tornar al menú principal
                            case 0:
                                // L'usuari vol tornar al menú principal (no posem codi i deixem només un break perquè surti)
                                break;

                            // Si no posa cap opció vàlida...
                            default:
                                System.out.println("Opció no vàlida.");
                                System.out.println("");
                        }
                    } while (opciocarta != 0);
                    break;

                // Case 2: Realitzar Comanda
                case 2:
                    do {
                        System.out.println("");
                        System.out.println("** Comanda **");
                        for (int item : comanda) { //Per a cada element a comanda, assigna l'element a item i executa el cos del bucle
                            if (item != 0) {
                                isComandaBuida = false;
                                break;
                            }
                        }
                        // En cas de que la camnda esta buida o tota plena de 0's...
                        if (isComandaBuida) {
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

                        // Opcions del Case 2
                        System.out.println("");
                        System.out.println(BLUE + "1. Afegir objectes");
                        System.out.println(ORANGE + "2. Treure objectes");
                        System.out.println(GREEN + "0. Tornar");
                        System.out.print(RED + "Selecciona una opció: ");
                        System.out.println("");

                        opcioComanda = input.nextInt();

                        switch (opcioComanda) {

                            //  L'Usuari vol afegir un objecte
                            case 1:
                                // Codi per afegir un item a l'Array
                                System.out.print("Introdueix l'ID de l'objecte a afegir: ");
                                int itemAfegir = input.nextInt();

                                // Busquem el primer 0 (espai buit) disponible i el cambiem pel número que diu l'Usuari
                                boolean afegit = false;
                                for (int i = 0; i < comanda.length; i++) {
                                    if (comanda[i] == 0) {
                                        comanda[i] = itemAfegir;
                                        afegit = true;
                                        System.out.println("Objecte amb ID " + itemAfegir + " afegit a la comanda.");
                                        break;
                                    }
                                }

                                // Si no hi ha lloc (no hi han 0's) i el boolean és fals...
                                if (!afegit) {
                                    System.out.println("Comanda plena. No es pot afegir més items.");
                                }
                                break;

                            // L'Usuari vol treure un objecte de l'Array
                            case 2:

                                // Per saber quin objecte vol treure el usuari...
                                System.out.println("Introdueix l'ID de l'objecte a treure: ");
                                int itemTreure = input.nextInt();

                                boolean trobat = false;

                                // Fem un cambiazo i un cop trobem l'objecte de l'Array que és igual al número que ha posat l'Usuari el cambien per un 0 (lloc buit per si vol afegir alguna cosa o no)
                                for (int i = 0; i < comanda.length; i++) {
                                    if (comanda[i] == itemTreure) {
                                        comanda[i] = 0;
                                        trobat = true;
                                        System.out.println("Objecte amb ID " + itemTreure + " tret de la comanda.");
                                        break;
                                    }
                                }

                                // Si no hi ha el número que diu l'usuari...
                                if (!trobat) {
                                    System.out.println("L'objecte amb ID " + itemTreure + " no es troba a la comanda.");
                                }
                                break;

                            case 0:
                                // L'usuari vol tornar al menú principal
                                break;

                            // Si no posa cap opció vàlida...
                            default:
                                System.out.println(RED + "Opció no vàlida.");
                        }
                    } while (opcioComanda != 0);
                    break;

                case 3:

                    // Imprimim línies en blanc i un missatge que indica que s'està imprimint la factura.
                    System.out.println("");
                    System.out.println("Imprimint factura...");
                    System.out.println("");
                    System.out.println("Items comandats:");

                    // Comencem un bucle for-each per recórrer tots els elements de la matriu 'comanda'.
                    for (int id : comanda) {
                        if (id > 0 && id <= productes.length) {
                            // Obtenim el nom i el preu del producte utilitzant l'identificador 'id', ajustant l'índex perquè comenci des de 0.
                            String nombre = productes[id - 1][0];
                            double precio = Double.parseDouble(productes[id - 1][1]); // Convertim el preu de String a double amb "Double.parseDouble" (Double.parseDouble és una funció de la classe Double en Java).
                            System.out.println(nombre + ": " + precio + " euros");
                            totalSinIVA += precio;
                        }
                    }

                    // Imprimim el que haurà de pagar l'Usuari
                    double totalConIVA = totalSinIVA * (1 + IVA);
                    System.out.println("");
                    System.out.println(GREEN + "Total sin IVA: " + totalSinIVA + " euros");
                    System.out.println(RED +"Total con IVA (" + (IVA * 100) + "%): " + totalConIVA + " euros");
                    System.out.println("");
                    System.out.print(BLUE + "Desitja realitzar una altre comanda? (True (Si) o False (No)):");

                    // Si l'Usuari vol realitzar una altre comanda retorna al menu principal, sinó acaba el programa anant al case 4 (Sortir)
                    sortir = input.nextBoolean();
                    if (sortir) {
                        break;
                    } else {
                        opcioprincipal = 4;
                    }

                case 4:
                    // Sortir del Programa
                    System.out.println("");
                    System.out.println("Adeu! Fins aviat!");
                    break;

                default:
                    // Si no posa cap opció vàlida...
                    System.out.println(RED + "Opció no vàlida.");
            }
        } while (opcioprincipal != 4);

        // Tanquem l'esbirro (Scanner) per reduïr els recursos
        input.close();
    }
}
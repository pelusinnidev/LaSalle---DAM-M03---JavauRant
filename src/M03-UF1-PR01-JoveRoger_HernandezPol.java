import java.util.Scanner;
public class M03-UF1-PR01-JoveRoger-HernandezPol {
    public static void main (String[] args) {

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
        final String WEAKGREEN = "\u001B[92m";

        // Colors Brillants
        final String BRIGHT_BLACK = "\033[90m";
        final String BRIGHT_RED = "\033[91m";
        final String BRIGHT_GREEN = "\033[92m";
        final String BRIGHT_YELLOW = "\033[93m";
        final String BRIGHT_BLUE = "\033[94m";
        final String BRIGHT_PURPLE = "\033[95m";
        final String BRIGHT_CYAN = "\033[96m";
        final String BRIGHT_WHITE = "\033[97m";
        final String BRIGHT_WEAKGREEN = "\u001B[92;1m";
        final String SHINY_BLACK = "\u001B[30;1m";
        final String SHINY_WHITE = "\u001B[97;1m";
        final String SHINY_TEXT = "\033[1m";


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

        // Definim els colors que volem fer servir com a variables
        final String RED_ON_YELLOW = RED + BG_YELLOW;
        final String MENU = UNDERLINE + BRIGHT_WHITE + UNDERLINE;
        final String TITULS = UNDERLINE;
        final String PREU= WEAKGREEN + BRIGHT_WEAKGREEN;
        final String ID= SHINY_BLACK;
        final String ID_NUMERO= SHINY_WHITE;
        final String SI_NO = SHINY_WHITE;
        final String ADEU = BG_BRIGHT_WHITE + SHINY_TEXT + SHINY_BLACK;

        // Fem el String amb els Productes i els seus Preus
        String[][] productes = {
                {GREEN + "Amanida Cèsar", "10"},
                {GREEN + "Amanida amb formatge de cabra", "12"},
                {GREEN + "Amanida verda", "8"},
                {YELLOW + "Macarrons a la bolonyesa", "14"},
                {YELLOW + "Pasta fresca", "12"},
                {YELLOW + "Spaghetti amb formatge", "12"},
                {RED + "Llibrets amb formatge", "14"},
                {RED + "Entrecot 400g", "20"},
                {RED + "Costelles de xai", "22"},
                {BLUE + "Durada a la planxa", "16"},
                {BLUE + "Rap", "23"},
                {BLUE + "Llenguado", "30"},
                {PURPLE + "Vi blanc", "8"},
                {PURPLE + "Vi negre", "8"},
                {PURPLE + "Sangria", "8"},
                {BLACK + "Aigua", "1"},
                {BLACK + "Refresc", "2.5"},
                {BLACK + "Café", "4"}
        };

        do {
            // Posem les opcions del menú principal
            System.out.println("");
            System.out.println(MENU + "** Menú **" + RESET);
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
                    System.out.println(MENU + "** Menú **" + RESET);
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
                                System.out.println(TITULS + GREEN + "** Amanides **" + RESET);
                                System.out.println("** " + ID + "ID" + ID_NUMERO + "(1)" + GREEN + ": Amanida Cèsar" + PREU + " (10 euros)" + RESET + " **");
                                System.out.println("** " + ID + "ID" + ID_NUMERO + "(2)" + GREEN + ": Amanida amb formatge de cabra" + PREU + " (12 euros)" + RESET + " **");
                                System.out.println("** " + ID + "ID" + ID_NUMERO + "(3)" + GREEN + ": Amanida verda " + GREEN + "(SENSE GLUCOSA)" + PREU + " (8 Euros)" + RESET + " **");
                                System.out.println("");
                                System.out.print("Recorda: Posa un 0 per tornar al menu principal: ");
                                break;

                            // Mostrem l'apartat de les Pastes
                            case 2:
                                System.out.println("");
                                System.out.println(TITULS + YELLOW + "** Pastes **" + RESET);
                                System.out.println("** " + ID + "ID" + ID_NUMERO + "(4)" + YELLOW + ": Macarrons a la bolonyesa" + PREU + " (14 euros)" + RESET + " **");
                                System.out.println("** " + ID + "ID" + ID_NUMERO + "(5)" + YELLOW + ": Pasta fresca" + PREU + " (12 euros)" + RESET + " **");
                                System.out.println("** " + ID + "ID" + ID_NUMERO + "(6)" + YELLOW + ": Spaghetti amb formatge" + PREU + " (12 euros)" + RESET + " **");
                                System.out.println("");
                                System.out.print("Recorda: Posa un 0 per tornar al menu principal: ");
                                break;

                            // Mostrem l'apartat de les Carns
                            case 3:
                                System.out.println("");
                                System.out.println(TITULS + RED + "** Carns **" + RESET);
                                System.out.println("** " + ID + "ID" + ID_NUMERO + "(7)" + RED + ": Llibrets amb formatge" + PREU + " (14 euros)" + RESET + " **");
                                System.out.println("** " + ID + "ID" + ID_NUMERO + "(8)" + RED + ": Entrecot 400g" + PREU + " (20 euros)" + RESET + " **");
                                System.out.println("** " + ID + "ID" + ID_NUMERO + "(9)" + RED + ": Costelles de xai" + PREU + " (22 euros)" + RESET + " **");
                                System.out.println("");
                                System.out.print("Recorda: Posa un 0 per tornar al menu principal: ");
                                break;

                            // Mostrem l'apartat dels Peixos
                            case 4:
                                System.out.println("");
                                System.out.println(TITULS + BLUE + "** Peixos **" + RESET);
                                System.out.println("** " + ID + "ID" + ID_NUMERO + "(10)" + BLUE + ": Durada a la planxa" + PREU + " (16 euros)" + RESET + " **");
                                System.out.println("** " + ID + "ID" + ID_NUMERO + "(11)" + BLUE + ": Rap" + PREU + " (23 euros)" + RESET + " **");
                                System.out.println("** " + ID + "ID" + ID_NUMERO + "(12)" + BLUE + ": Llenguado" + PREU + " (30 euros)" + RESET + " **");
                                System.out.println("");
                                System.out.print("Recorda: Posa un 0 per tornar al menu principal: ");
                                break;

                            // Mostrem la llista de Begudes Alcoholiques
                            case 5:
                                System.out.println("");
                                System.out.println(TITULS + PURPLE + "** Begudes Alcoholiques **" + RESET);
                                System.out.println("** " + ID + "ID" + ID_NUMERO + "(13)" + PURPLE + ": Vi blanc" + PREU + " (8 euros)" + RESET + " **");
                                System.out.println("** " + ID + "ID" + ID_NUMERO + "(14)" + PURPLE + ": Vi negre" + PREU + " (8 euros)" + RESET + " **");
                                System.out.println("** " + ID + "ID" + ID_NUMERO + "(15)" + PURPLE + ": Sangria" + PREU + " (8 euros)" + RESET + " **");
                                System.out.println("");
                                System.out.print("Recorda: Posa un 0 per tornar al menu principal: ");
                                break;

                            // Mostrem la llista de Begudes NO Alcoholiques
                            case 6:
                                System.out.println("");
                                System.out.println(TITULS + WHITE + "** Begudes no Alcoholiques **" + RESET);
                                System.out.println("** " + ID + "ID" + ID_NUMERO + "(16)" + CYAN + ": Aigua" + PREU + " (1 euro)" + RESET + " **");
                                System.out.println("** " + ID + "ID" + ID_NUMERO + "(17)" + ORANGE + ": Refresc" + PREU + " (2,5 euros)" + RESET + " **");
                                System.out.println("** " + ID + "ID" + ID_NUMERO + "(18)" + BLACK + ": Café" + PREU + " (4 euros)" + RESET + " **");
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

                        opcioComanda = input.nextInt();

                        switch (opcioComanda) {

                            //  L'Usuari vol afegir un objecte
                            case 1:
                                // Codi per afegir un item a l'Array
                                System.out.println("");
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
                            System.out.println(nombre + ": " + precio + PREU +" euros");
                            totalSinIVA += precio;
                        }
                    }

                    // Imprimim el que haurà de pagar l'Usuari
                    double totalConIVA = totalSinIVA * (1 + IVA);
                    System.out.println("");
                    System.out.println(GREEN + "Total sin IVA: " + totalSinIVA + PREU +" euros");
                    System.out.println(RED +"Total con IVA (" + (IVA * 100) + "%): " + totalConIVA + PREU +" euros");
                    System.out.println("");
                    System.out.print(BLUE + "Desitja realitzar una altre comanda? (" + SI_NO + "True" + BLUE + "(Si) o" + SI_NO +" False" + BLUE + "(No)):");

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
                    System.out.println(ADEU + "Adeu! Fins aviat!");
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
import java.util.Scanner;
import java.util.ArrayList;

    public class Restaurant {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int opcioprincipal = 0;
            int opciocarta = 0;
            int opcioComanda = 0;
            boolean sortir = false;
            double IVA = 0.21;
            ArrayList<Integer> comanda = new ArrayList<>();
            String[][] productes = {
                    {"Amanida Cèsar", "10"},
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
                System.out.println("1. Veure menú");
                System.out.println("2. Realitzar comanda");
                System.out.println("3. Imprimir factura");
                System.out.println("4. Sortir");
                System.out.println("");
                System.out.print("Introdueix un nombre del 1 al 4 per seleccionar una opció de les disponibles: ");

                opcioprincipal = input.nextInt();

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
                        do {
                            System.out.println("");
                            System.out.println("** Comanda **");
                            if (comanda.isEmpty()) {
                                System.out.println("La comanda està buida.");
                            } else {
                                System.out.println(comanda.toString());
                            }

                            System.out.println("");
                            System.out.println("1. Afegir objectes");
                            System.out.println("2. Treure objectes");
                            System.out.println("0. Tornar");
                            System.out.print("Selecciona una opció: ");
                            System.out.println("");

                            opcioComanda = input.nextInt();

                            switch (opcioComanda) {
                                case 1:
                                    System.out.print("Introdueix l'ID de l'objecte a afegir: ");
                                    int itemAfegir = input.nextInt();
                                    comanda.add(itemAfegir);
                                    System.out.println("Objecte amb ID " + itemAfegir + " afegit a la comanda.");
                                    break;
                                case 2:
                                    System.out.print("Introdueix l'ID de l'objecte a treure: ");
                                    int itemTreure = input.nextInt();
                                    if (comanda.contains(itemTreure)) {
                                        comanda.remove(Integer.valueOf(itemTreure));
                                        System.out.println("Objecte amb ID " + itemTreure + " tret de la comanda.");
                                    } else {
                                        System.out.println("L'objecte amb ID " + itemTreure + " no es troba a la comanda.");
                                    }
                                    break;
                                case 0:
                                    // L'usuari vol tornar al menú principal
                                    break;
                                default:
                                    System.out.println("Opció no vàlida.");
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
                            } else {
                                System.out.println("ID de producto no válido: " + id);
                            }
                        }
                        double totalConIVA = totalSinIVA * (1 + IVA);
                        System.out.println("");
                        System.out.println("Total sin IVA: " + totalSinIVA + " euros");
                        System.out.println("Total con IVA (" + (IVA * 100) + "%): " + totalConIVA + " euros");
                        System.out.println("");
                        System.out.print("Desitja realitzar una altre comanda? (True (Si) o False (No)):");
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
                        System.out.println("Opció no vàlida.");
                }
            } while (opcioprincipal != 4);

            input.close(); // Always close your resources!
        }
    }

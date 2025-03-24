package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[2];
        int count = 0;

        while (true) {

            System.out.println("Menu principal :");
            System.out.println("1. Ajouter un nombre");
            System.out.println("2. Afficher les nombres existants");
            System.out.println("3. Quitter");
            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();


            switch (choix) {
                case 1:
                    if (count == tab.length) {
                        tab = Arrays.copyOf(tab, tab.length + 1);
                    }
                    System.out.print("Entrez un nombre à ajouter : ");
                    tab[count] = scanner.nextInt();
                    count++;
                    break;

                case 2:
                    System.out.println("Nombres existants :");
                    for (int i = 0; i < count; i++) {
                        System.out.print(tab[i] + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("À plus dans l'bus !");
                    scanner.close();
                    return;

                default:
                    System.out.println("Veuillez choisir 1, 2 ou 3.");
            }
        }

    }
}

package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb;

        do {
            System.out.print("Veuillez entrer un nombre compris entre 1 et 10 : ");
            nb = scanner.nextInt();

            if (nb < 1 || nb > 10) {
                System.out.println("Le nombre doit être compris entre 1 et 10 ='( ");
            }
        } while (nb < 1 || nb > 10);

        System.out.println("Table de " + nb + " :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(nb + " * " + i + " = " + (nb * i));
        }
        scanner.close();
    }
}

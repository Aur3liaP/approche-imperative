package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int nombreAleatoire = random.nextInt(100) + 1;
        int essais = 0;
        int guess = 0;

        while (guess != nombreAleatoire) {
            System.out.print("Devinez le nombre (entre 1 et 100) : ");
            guess = scanner.nextInt();
            essais++;

            if (guess < nombreAleatoire) {
                System.out.println("C'est plus ! ;) ");
            } else if (guess > nombreAleatoire) {
                System.out.println("C'est moins ! :O ");
            }
        }

        System.out.println("Bravo, vous avez trouvé en " + essais + " coups !");

        scanner.close();
    }
}

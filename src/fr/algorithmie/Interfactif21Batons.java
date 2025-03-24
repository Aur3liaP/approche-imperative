package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interfactif21Batons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int batons = 21;

        boolean tourJoueur = random.nextBoolean();

        System.out.println("Le jeu des 21 bâtons commence !");

        while (batons > 0) {
            if (tourJoueur) {
                System.out.print("Combien de bâtons voulez-vous prendre (1, 2 ou 3) ? ");
                int batonsPris = scanner.nextInt();

                if (batonsPris < 1 || batonsPris > 3) {
                    System.out.println("Vous devez prendre entre 1 et 3 bâtons.");
                    continue;
                }

                batons -= batonsPris;
                System.out.println("Vous avez pris " + batonsPris + " bâtons. Il reste " + batons + " bâtons.");

                if (batons <= 0) {
                    System.out.println("Vous avez perdu ! :'(");
                    break;
                }
                tourJoueur = false;

            } else {
                int batonsPris = random.nextInt(3) + 1;
                batons -= batonsPris;
                System.out.println("L'ordinateur a pris " + batonsPris + " bâtons. Il reste " + batons + " bâtons.");

                if (batons <= 0) {
                    System.out.println("Vous avez gagné ! :D");
                    break;
                }

                tourJoueur = true;
            }
        }

        scanner.close();
    }
}

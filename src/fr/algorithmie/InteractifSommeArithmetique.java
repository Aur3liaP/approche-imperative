package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        System.out.println("Veuillez entrer 10 nombres");
        for (int i = 0; i < 10; i++) {
            System.out.print("n°" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }

        int maxVal = Integer.MIN_VALUE;

        for (int i : array) {
            if (array[i] > maxVal) {
                maxVal = array[i];
            }
        }

        System.out.println("Le plus grand nombre entré est : " + maxVal);

        scanner.close();
    }
}

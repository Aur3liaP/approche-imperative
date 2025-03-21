package fr.algorithmie;

import java.util.Arrays;

public class AffichageInverse {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        System.out.println("Affiche élements du tableau :");
        for (int num : array) {
            System.out.println(num);
        }
        // ou for (int i = 0; i < array.length; i++) {
        //            System.out.println(array[i]);
        //        }

        System.out.println(("Affiche élements inversés :"));
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        System.out.println("tableau arrayCopy :");
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        for (int num : arrayCopy) {
            System.out.println(num);
        }
    }
}

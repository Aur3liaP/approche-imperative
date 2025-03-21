package fr.algorithmie;

public class InversionContenu {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        System.out.println("Affiche élements du tableau :");
        for (int num : array) {
            System.out.println(num);
        }

        // array inversé :
        int[] arrayCopy = new int[array.length];

        for (int i = 0; i <array.length; i++) {
            arrayCopy[i] = array[array.length - 1 -i];
        }

        System.out.println("Affiche tableau arrayCopy :");
        for (int num : arrayCopy) {
            System.out.println(num);
        }
    }
}

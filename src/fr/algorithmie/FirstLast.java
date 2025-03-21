package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {
        int[] array = {8, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;

        boolean valeur = array.length >= 1 && (array[0] == array[array.length - 1] );

        System.out.println(valeur);
    }
}

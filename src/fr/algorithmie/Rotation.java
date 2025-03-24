package fr.algorithmie;

public class Rotation {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3};

        int lastIndex = array[array.length-1];

        for (int i = array.length - 1 ; i > 0; i--) {
            array[i] = array[i-1];
        }
        array[0] = lastIndex;

        for (int num : array) {
            System.out.println(num);
        }

    }
}

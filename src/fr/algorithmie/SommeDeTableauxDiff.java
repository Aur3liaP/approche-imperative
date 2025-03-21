package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18};

        int[] newArray = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            int value2 = (i < array2.length) ? array2[i] : 0;
            newArray[i] = array1[i] + value2;
        }

        // Ou avec if :
        // if (i < array2.length){
        // int value2 = array2[i];
        //} else {
        // int value2 = 0;
        // }

        for (int num : newArray) {
            System.out.println(num);
        }
    }
}

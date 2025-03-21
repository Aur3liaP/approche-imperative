package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {

        System.out.println("Nombres de 1 à 10 :");
        for (int i = 1; i<11; i++) {
            System.out.println(i);
        }

        System.out.println("Nombres pairs de 0 à 10 :");
        for (int i = 0; i<11; i+=2) {
            System.out.println(i);
        }

        System.out.println("Nombres impairs de 0 à 9 :");
        for (int i = 1; i<10; i+=2) {
            System.out.println(i);
        }

        System.out.println("Nombres de 1 à 10 (while) :");
        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }

        System.out.println("Nombres pairs de 0 à 10 (while) :");
        int j = 0;
        while (j <= 10){
            System.out.println(j);
            j+=2;
        }

        System.out.println("Nombres impairs de 0 à 9 (while) :");
        int k = 1;
        while (k <= 9){
            System.out.println(k);
            k+=2;
        }

    }
}

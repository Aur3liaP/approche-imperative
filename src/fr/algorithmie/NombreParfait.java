package fr.algorithmie;

public class NombreParfait {
    public static void main(String[] args) {
        int nombre = 6;
        int somme = 0;

        for (int i = 1; i <= nombre / 2; i++) {
            if (nombre % i == 0) {
                somme += i;
            }
        }

        System.out.println(somme == nombre ? nombre + " est parfait" : nombre + " n'est pas parfait");
    }
}

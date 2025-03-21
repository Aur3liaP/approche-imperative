package fr.operateurs;

public class DeclarationOperateur {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean testEt = a>0 && b<10;

        System.out.println("testEt = " + testEt);

        boolean testOu = a>0 || b<10;

        System.out.println("testOu = " + testOu);

        a=a+1;
        System.out.println(a);

        a++; //++a marche aussi !priorité différentes!
        System.out.println(a);

        a+=1;
        System.out.println(a);

        String c = a>0 ? "a est plus grand que 0": "a est inférieur à 0";
        System.out.println("c = " +c);

        // Attention à l'utilisation du ==

        String ch1 = "coucou"; // On crée une chaine avec l'operateur " => coucou stocké dans le String pol
        String ch2 = "coucou";  // coucou existe déjà dans le String pool et donc ch2 référence la même mémoire

        String ch3 = new String("coucou"); // ici je n'utilise pas l'opérateur " => String pool pas utilisé
         // si on compare ch2 == ch3 le résultat sera différent

        if(ch1==ch2){  // Le double == sur des objets compare les adresses mémoires
            // if (ch3.equals(ch3)) => donnera Egal
            System.out.println("Egal");
        } else {
            System.out.println("Différent");
        }

    }
}

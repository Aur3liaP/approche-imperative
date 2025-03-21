package fr.declaration.variable;

public class DeclarationApp {

    public static void main(String[] args) {
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4545L;
        float e = 15.6f;
        double f = 15.6;
        char g = 'g';
        boolean h = true;
        String i = "Hello";

        // double > float > long > int > short > byte --> hierarchies
        // possible de dire double h = 100L; / byte a = +2; / double h = 1.3e10;

        // raccourci sout pour mettre les print directement
        System.out.println("byte a = " + a);
        System.out.println("short b = " + b);
        System.out.println("int c = " + c);
        System.out.println("long d = " + d);
        System.out.println("float e = " + e);
        System.out.println("double f = " + f);
        System.out.println("char g = " + g);
        System.out.println("boolean h = " + h);
        System.out.println("String i = " + i);

        String randomString = "Voici le résultat d’un calcul :\n1+5=6";
        System.out.println(randomString);

        int j = 053; // notation octale ! donnera 43
        int k = 0b010001; // binaire il faut mettre 0b
    }

}

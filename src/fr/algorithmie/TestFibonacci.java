package fr.algorithmie;

import java.util.Scanner;

public class TestFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le rang N pour calculer le nombre de Fibonacci : ");
        int n = scanner.nextInt();


        int result = InteractifFibonacci.fibonacci(n);
        System.out.println("Le nombre de Fibonacci au rang " + n + " est : " + result);


        scanner.close();
    }
}

package fr.algorithmie;

public class InteractifFibonacci {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int fibo = 1;
        int prevFibo = 0;

        for (int i = 2; i <= n; i++) {
            int temp = fibo;
            fibo += prevFibo;
            prevFibo = temp;
        }
        return fibo;
    }
}


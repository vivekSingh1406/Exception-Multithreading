package org.Multithreading.completableFuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureFactorial {

    public static int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) res *= i;
        return res;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int num = i;
            CompletableFuture
                    .supplyAsync(() -> factorial(num))
                    .thenAccept(result -> System.out.println("Factorial of " + num + " is: " + result));
        }
    }
}

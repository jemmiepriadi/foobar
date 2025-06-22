package org.example;

public class Main {
    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            if (isPrime(i)) {
                continue;
            }

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FooBar ");
            } else if (i % 3 == 0) {
                System.out.print("Foo ");
            } else if (i % 5 == 0) {
                System.out.print("Bar ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
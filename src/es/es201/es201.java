package es.es201;

import java.util.Scanner;

public class es201 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?");

        int n = input.nextInt();

        boolean allPositiveEven = true;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            int number = input.nextInt();

            if (number <= 0 || number % 2 != 0) {
                allPositiveEven = false;
                break;
            }
        }

        if (allPositiveEven) {
            System.out.println("Tutti positivi pari");
        } else {
            System.out.println("Errore");
        }

        input.close();
    }
}

package es.es204;

import java.util.Scanner;

public class es204 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int value;

        System.out.println("Enter a number:");
        value = input.nextInt();

        while ((value < 0 && value % 2 == 0) ||
                (value > 0 && value % 3 == 0)) {
            sum += value;

            System.out.println("Enter a number:");
            value = input.nextInt();
        }

        System.out.println("Sum: " + sum);
        input.close();
    }
}

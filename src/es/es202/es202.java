package es.es202;

import java.util.Scanner;

public class es202 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert one number");
        int a = input.nextInt();
        System.out.println("Please insert a second number");
        int b = input.nextInt();
        System.out.println("Please enter a number 1-5");
        int operation = input.nextInt();
        int result;

        if (operation == 1) {
            result = a + b;
            System.out.println(result);
        } else if (operation == 2) {
            result = a - b;
            System.out.println(result);
        } else if (operation == 3) {
            result = a * b;
            System.out.println(result);
        } else if (operation == 4) {
            if (b == 0) {
                System.out.println("error, the second number cannot be 0 for division");
            } else {
                result = a / b;
                System.out.println(result);
            }
        } else if (operation == 5) {
            if (b == 0) {
                System.out.println("error, the second number cannot be 0 for division");
            } else {
                result = a % b;
                System.out.println(result);
            }
        } else {
            System.out.println("error");
        }

        input.close();
    }
}

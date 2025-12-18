package es.es203;

import java.util.Scanner;

public class es203 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean seenPositive = false;
        boolean okSequence = false;
        int value;

        System.out.println("Enter a number (0 to stop):");
        value = input.nextInt();

        while (value != 0) {
            if (value > 0) {
                seenPositive = true;

            } else if (value < 0 && seenPositive) {
                okSequence = true;
            }

            System.out.println("Enter a number (0 to stop):");
            value = input.nextInt();
        }

        if (okSequence) {
            System.out.println("OK");

        } else {
            System.out.println("KO");
        }

        input.close();
    }
}

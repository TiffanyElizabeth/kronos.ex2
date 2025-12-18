package es.es205;

import java.util.Scanner;

public class es205 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int n = input.nextInt();

        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            int value = input.nextInt();

            if (value % 3 == 0) {
                sum += value;
                count++;
            }
        }

        if (count > 0) {
            int avg = sum / count;
            System.out.println("Average:" + avg);
        } else {
            System.out.println("No numbers entered are divisible by 3");
        }

        input.close();
    }
}

package org.example;

import java.util.Scanner;

public class Project6 {
    public static void main(String[] args) {

        Scanner main = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = main.nextInt();

        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }

    }
}

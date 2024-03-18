package org.example;

public class Project7 {
    public static void main(String[] args) {

        int num = 10;
        int a = 0;
        int b = 1;

        System.out.println("First " + num + " Fibonacci numbers:");

        for (int i = 0; i < num; i++) {
            System.out.println(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }



    }
}

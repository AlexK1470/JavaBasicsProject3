package org.example;

public class Project8 {
    public static void main(String[] args) {
        int [] main = {3, 7, 10, 35, 70, 99, 105, 180, 240};

        int max = main[0];
        int min = main[0];

        for (int i : main) {
            if (max < i) {
                max = i;
            } else {
                min = i;
            }
        }
        System.out.println("The Maximum Number in This Array is " +max);
        System.out.println("The Minimum Number in This Array is " +min);
    }
}

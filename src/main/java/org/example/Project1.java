package org.example;

public class Project1 {
    public static void main(String[] args) {

        int [] temp = {90, 63, 74, 54, 38, 89, 68};

        int max = temp[0];
        int min = temp[0];

        for(int i : temp) {
            if(i>max) {
                max = i;
            } else if(i<min) {
                min = i;
            }
        }
        System.out.println("The Highest Temperature for the Week is " + max);
        System.out.println("The Lowest Temperature for the Week is " + min);


    }
}
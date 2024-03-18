package org.example;

public class Project10 {
    public static void main(String[] args) {

        String [] main = {"Aleksey", "Dima", "John", "Phillip", "Dan", "Dima", "Aleksey", "Mike"};

        for (int i = 0; i < main.length; i++) {
            for (int j = i + 1; j < main.length; j++) {
                if (main[i].equals(main[j])) {
                    System.out.println(main[j]);
                }
            }
        }
    }
}

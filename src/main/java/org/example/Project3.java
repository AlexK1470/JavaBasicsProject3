package org.example;

public class Project3 {
    public static void main(String[] args) {

        int [][] main = {
                {2, 5, 3, 6, 8},
                {5, 3, 7, 2, 7}
        };

        for(int r = 0; r < 2; r++) {
            for(int c = 0; c < 5; c++) {
                if(main[r][c]%2==0) {
                    System.out.print(main[r][c] + " ");
                }
            }
            System.out.println();
        }


    }
}

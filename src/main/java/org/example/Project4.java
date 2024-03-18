package org.example;

public class Project4 {
    public static void main(String[] args) {

        int [][] main = {
                {2, 1, 6, 8, 3},
                {3, 6 ,5, 2, 9}
        };

        int even = 0;
        int odd = 0;

        for (int r = 0; r < 2; r++) {
            for (int c = 0; c < 5; c++) {
                if (main[r][c]%2==0) {
                    even += main[r][c];
                } else {
                    odd += main[r][c];
                }
            }
        }
        System.out.println("The Sum of Even Numbers is " + even);
        System.out.println("The Sum of Odd Numbers is " + odd);


    }
}

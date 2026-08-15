package patternprograms;

import java.util.Scanner;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter a number of rows :");
        int row = sc.nextInt();

        System.out.println("Please Enter a number of columns :");
        int col = sc.nextInt();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

// Output should be :

/*
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
* */


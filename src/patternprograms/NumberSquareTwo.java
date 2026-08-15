package patternprograms;

import java.util.Scanner;

public class NumberSquareTwo {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter a number :");
        int num = obj.nextInt();

        for(int i=1; i<=num; i++){
            for(int j=1; j<=num; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}


// Output should be :

/*
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5
*/

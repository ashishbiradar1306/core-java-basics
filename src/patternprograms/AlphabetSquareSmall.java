package patternprograms;

import java.util.Scanner;

public class AlphabetSquareSmall {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number :");
        int num = sc.nextInt();

        for(int i=1; i<=num; i++){
            for(int j=1; j<=num; j++){
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
    }
}

// Output should be :

/*
a b c d e
a b c d e
a b c d e
a b c d e
a b c d e
* */
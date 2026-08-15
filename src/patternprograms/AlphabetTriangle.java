package patternprograms;

import java.util.Scanner;

public class AlphabetTriangle {
    public static void main(String [] args){

        Scanner obj = new Scanner(System.in);
        System.out.println("Please Enter a number :");
        int num = obj.nextInt();

        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}


// Output Should Be :
/*
A
A B
A B C
A B C D
A B C D E
*/
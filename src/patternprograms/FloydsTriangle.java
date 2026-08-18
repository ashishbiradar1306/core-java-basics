package patternprograms;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[]args){

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a no :");
        int rows = obj.nextInt();

        int a = 1;

        for(int i=1; i<rows; i++){
        for(int j=1; j<i; j++){
            System.out.print(a++ +" ");
        }
            System.out.println();
        }

    }
}

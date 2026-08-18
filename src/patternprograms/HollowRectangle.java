package patternprograms;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter no of rows :");
        int rows = obj.nextInt();
        System.out.println("Enter no of columns");
        int cols = obj.nextInt();

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=cols; j++){
                if(i == 1 || i == cols || i ==5);
            }
        }

    }
}

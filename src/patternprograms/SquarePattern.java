package patternprograms;
import java.util.Scanner;

public class SquarePattern {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter no of rows you want to print :");
        int row = sc.nextInt();

        System.out.println("Please enter no of column you want to print :");
        int col = sc.nextInt();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}


// Output should be :

/*
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *
*/

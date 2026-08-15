package patternprograms;
import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[]args){

        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter a number :");
        int num = obj.nextInt();

        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}


// Output should be :

/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/

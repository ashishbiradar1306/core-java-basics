package arrays;

import java.util.Scanner;

public class OutputInputArray {
    public static void main(String[]args){





        // Printing elements by using the loops
        int [] arr = {10,20,30,40,50};
        System.out.println(arr.length); // Printing array length by using length property/field

        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        // Printing the default values
        // By default values are 0 of array elements
        int [] arr1 = new int[5];
        for(int i=0; i< arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }

        Scanner sc = new Scanner(System.in);
        int [] arr2 = new int[7];
        // INPUT
        for(int i = 0; i<7; i++){
            arr2[i] = sc.nextInt();
        }
        // PRINT
        for(int i =0; i<7; i++){
            System.out.print(arr2[i]+" ");
        }

        // We can also specify the length of an array like this :
        int length = 10;
        int [] arr3 = new int[length];
        System.out.println(arr3.length);
    }
}

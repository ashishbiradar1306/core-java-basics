
// Write a program to store array dynamically by reading the size and elements from the user.

package arrays;

import java.util.Scanner;

public class DynamicArrayInput {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("How many array elements you want to store :");
        int sizeOfAnArray = obj.nextInt();

        int[] arr1 = new int[sizeOfAnArray];

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Please enter an element of an array :");
            arr1[i] = obj.nextInt();
        }
        for (int j = 0; j < arr1.length; j++) {
            System.out.print(arr1[j] + " ");
        }
    }
}

package demo;

import java.util.Arrays;

public class EvenOddIndex {
    public static void main(String[] args) {
        int temp;
        int[] arr = {1, 2, 5, 6, 8 , 10};
        for (int i = 0; i < arr.length-1; i++) {
            if (i % 2 == 0) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
       System.out.println(Arrays.toString(arr));
//        for (int j = 0; j < arr.length; j++) {
//            System.out.print(arr[j]);
//        }
    }
}
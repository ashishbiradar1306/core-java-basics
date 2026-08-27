package arrays;

// Q) Sum of an array elements

public class SumOfElement {
    public static void main(String[] args) {
        int sum=0;
        int[] arr3 = {10, 20, 30, 40, 50};
        for (int i = 0; i < arr3.length; i++){
            sum += arr3[i];
        }
        System.out.println("Sum of array elements array : "+sum);
    }
}

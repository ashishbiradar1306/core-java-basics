package arrays;

// Finding missing elements from an array

public class FindMissingElement {
    public static void main(String[]args){
        int[] arr = {1, 2, 3, 5, 6};
        int sum =0;
        int expectedSum =21;
        for(int i=0; i< arr.length; i++){
            sum += arr[i];
        }
        System.out.print("Sum of an array :"+sum);
        System.out.println();
        int missingNumber = expectedSum - sum;
        System.out.print("Missing element is :"+missingNumber);
    }
}

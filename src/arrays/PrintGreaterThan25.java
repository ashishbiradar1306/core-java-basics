package arrays;

// Print greater than 25 elements

public class PrintGreaterThan25 {
    public static void main(String[]args){
        int[] arr = {10, 25, 30, 15, 40, 55};
        for(int i =0; i< arr.length; i++){
            if(arr[i]>25){
                System.out.print(arr[i]+" ");
            }
        }
    }
}

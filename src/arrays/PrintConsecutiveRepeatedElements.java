package arrays;

// Print consecutive repeated elements

public class PrintConsecutiveRepeatedElements {
    public static void main(String [] args){
        int[] arr = {10, 20, 20, 30, 40, 40, 50};
        for(int i=1; i< arr.length; i++){
            if(arr[i]==arr[i-1]){
                System.out.print(arr[i] + " " );
            }
        }
    }
}

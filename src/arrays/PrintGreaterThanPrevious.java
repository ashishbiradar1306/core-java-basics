package arrays;

// Print the element which is are greater than the previous element

public class PrintGreaterThanPrevious {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        for(int i=1; i< arr.length; i++){
            if(arr[i]>arr[i-1]){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
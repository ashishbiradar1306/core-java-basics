package arrays;

public class PrintSmallerThanPrevious {
    public static void main(String[]args){
        int[] arr = {10, 25, 15, 30, 20, 40};
        for(int i=1; i< arr.length; i++){
            if(arr[i]<arr[i-1]){
                System.out.print(arr[i]+" ");
            }
        }
    }
}

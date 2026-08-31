package arrays;

// Copy array elements into new array

public class CopyArrayElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] newArr = new int[arr.length];
        for(int i=0; i< arr.length; i++){
           newArr[i] = arr[i];
        }
        for(int j=0; j< newArr.length;j++){
            System.out.print(newArr[j]+" ");
        }
    }
}

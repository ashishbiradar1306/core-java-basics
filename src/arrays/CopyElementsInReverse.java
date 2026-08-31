package arrays;

public class CopyElementsInReverse {
    public static void main(String[]args){
        int[] arr = {10, 20, 30, 40, 50};
        int[] newArr = new int[arr.length];
//        int j =0;
        for(int i=arr.length-1; i>=0 ;i--){
            newArr[i] = arr[i];
//            j++;
        }
        for(int i=0; i< newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
    }
}
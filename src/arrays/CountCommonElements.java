package arrays;

// Counting common elements of an array

public class CountCommonElements {
    public static void main(String[]args){
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {30, 40, 60, 70, 80};
        int count = 0;
        for(int i =0; i< arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    count++;
                }
            }
        }
        System.out.print("The common elements count is :"+count);
    }
}

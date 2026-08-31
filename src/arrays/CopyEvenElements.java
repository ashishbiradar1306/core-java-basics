package arrays;

public class CopyEvenElements {
    public static void main(String[]args){
        int[] arr = {10, 15, 20, 25, 30, 35, 40};
        int[] arrNew = new int[arr.length];
        int j=0;
        for(int i=0; i< arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    arrNew[j] = arr[i];
                    j++;
                }
            }

        for(int i=0; i<j; i++){
            System.out.print(arrNew[i]+" ");
        }
    }
}


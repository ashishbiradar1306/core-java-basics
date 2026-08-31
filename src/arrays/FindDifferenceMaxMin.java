package arrays;

public class FindDifferenceMaxMin {
    public static void main(String[]args){
        int[] arr = {25, 10, 40, 15, 30, 50};
        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j< arr.length; j++) {
                if (arr[j]<arr[i]) {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }
            }
        }
        System.out.println("Orignal Array :");
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        int largest = arr[arr.length-1];
        int smallest = arr[0];
        int difference = largest - smallest;
        System.out.println();
        System.out.print("Difference between the largest and smallest element is :"+difference);
    }
}

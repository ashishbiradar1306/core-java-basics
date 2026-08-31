package arrays;

// Count elements greater than the average

public class CountElementsGreaterThanAverage {
    public static void main(String[]args){
        int[] arr = {10, 20, 30, 40, 50};
        int sum=0;
        for(int i=0; i< arr.length;i++){
            sum+=arr[i];
        }
        int average = sum/ arr.length;
        System.out.println("Sum of an array elements are :"+sum);
        System.out.println("Average of an array :"+average);

        int count =0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>average){
                count++;
            }
        }
        System.out.print("Count of greater than average element is : "+count);

    }
}

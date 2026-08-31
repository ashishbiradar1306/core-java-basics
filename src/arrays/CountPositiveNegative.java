package arrays;

public class CountPositiveNegative {
    public static void main(String[]args){
        int[] arr = {10, -5, 20, -15, 0, 30, -10};
        int positiveCount=0;
        int negativeCount=0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]>0){
                positiveCount++;
            }else if(arr[i]<0){
                negativeCount++;
            }
        }
        System.out.print("Orignal Array :");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Positive count :"+positiveCount);
        System.out.println();
        System.out.print("Negative count :"+negativeCount);
    }
}


package demo;

public class OddEven {
    public static void main(String[]args){
        int evenSum = 0;
        int oddSum=0;
        int[] arr = {12,5,2,4,6};
        for(int i =0; i<arr.length; i++){
            if(i % 2==0){
                evenSum = evenSum + arr[i];
            }
            else{
                oddSum = oddSum + arr[i];
            }
        }
        System.out.println("Even Sum :"+evenSum);
        System.out.println("Odd Sum :"+oddSum);
    }
}

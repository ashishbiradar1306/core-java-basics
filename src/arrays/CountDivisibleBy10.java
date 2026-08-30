package arrays;
// Count the elements which is are divisible by 10
public class CountDivisibleBy10 {
    public static void main(String[]args){
        int[] arr = {12, 20, 35, 40, 55, 60, 73, 80};
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 10 == 0){
                count++;
            }
        }
        System.out.print("The elements of an array is divisible by 10 occurred :"+count + "\tTimes");
    }
}

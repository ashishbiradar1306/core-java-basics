package arrays;

public class CountGreayerThan25 {
    public static void main(String[]args){
        int[] arr = {10, 25, 30, 15, 40, 55};
        int count=0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]>25){
                count++;
            }
        }
        System.out.print("Greater 25 elements occurred "+count + "\tTimes");
    }
}

package arrays;

public class FindSecondSmallest {
    public static void main(String[]args){
        int[] arr = {25, 10, 40, 15, 30, 50};
        for(int i=0;i< arr.length;i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Second smallest element: "+arr[1]);
    }
}

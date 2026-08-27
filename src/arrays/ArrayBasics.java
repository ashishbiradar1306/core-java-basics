package arrays;

public class ArrayBasics {
    public static void main(String[]arg){
        // 1 : Declaration - int [] arr;
        // 2 : Initialization -  arr = new int [5];
        // 3 : Declaration and Initialization - int [] arr = {1,2,3,4,5}

        int [] arr = {50,20,15,25,10}; // Initialization

        // System.out.println(arr); // we cannot access the array elements like this
        System.out.println(arr[0]); // Like this we access the array elements

        // Updating array elements
        // We cannot add more elements after the array is created but we can modify the elements
        arr[0] = 10;
        System.out.println(arr[0]);

        int [] arr1 = new int[5]; // So if we declared like this then you can store elements from 0 to 4 (Initialization)
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 5;
        arr1[3] = 3;

        // We can also initializes the array like this :
        int [] arr2 = new int[] {50,20,5,2,5,545,85,545};
        System.out.println(arr2.length);


    }
}

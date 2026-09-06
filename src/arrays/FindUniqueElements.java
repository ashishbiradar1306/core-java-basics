package arrays;

public class FindUniqueElements {

    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4, 3, 4, 6, 7, 8, 1, 2};
        int count = 0;


        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] == arr1[j]) {
                    count++;
                    break;
                }
            }
        }

        int[] newArr = new int[count];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] == arr1[j]) {
                    newArr[index] = arr1[i];
                    index++;
                    break;
                }
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
package arrays;

public class FindIndexOfElement {
    public static void main(String[] args) {
        boolean found = false;
        int index = -1;
        int [] arr8 = {10,50,15,26,45,20};
        for(index=0; index<arr8.length; index++) {
            if (arr8[index] == 10) {
                found = true;
                break;
            }
        }
            if(found){
                System.out.println("Element found at index :"+index);
            }
            else{
                System.out.println("Element not found at any index");
            }
    }
}


// The finally block is a block used for cleanup or resource deallocation code that normally executes whether an exception occurs or not

package exceptionhandling;

public class FinallyBlock {
    public static void main(String[]args){
        try{
            System.out.println("Try");
        }catch (Exception e){
            System.out.println("Catch");
        }finally {
            System.out.println("Finally");
        }
    }
}


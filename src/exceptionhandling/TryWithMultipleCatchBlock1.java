
// Child Exception then parent exception

package exceptionhandling;

public class TryWithMultipleCatchBlock1 {
    public static void main(String[]args){
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic exception is occured");
        }catch (Exception e){
            System.out.println("Exception");
        }
    }
}

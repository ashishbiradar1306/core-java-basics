
// Order - Parent Exception then child exception

/*

package exceptionhandling;

// Try with multiple catch block order is parent child
public class TryWithMultipleCatchBlock {
    public static void main(String[]args){
        try{
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println("Exception");
        }
        catch(ArithmeticException e){
            System.out.println("AE");
        }
    }
}

if we are going to add try with multiple catch block then order is very important (First child then parent) by mistake taking parent
and then the child compile time error we will get


 */
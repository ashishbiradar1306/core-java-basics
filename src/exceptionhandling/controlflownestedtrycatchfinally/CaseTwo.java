package exceptionhandling.controlflownestedtrycatchfinally;

// Case 2 : If an exception raised at stmt-2 and corresponding catch block matched

public class CaseTwo {
    public static void main(String[]args){
        try{
            System.out.println("Stmt 1");
            System.out.println(10/0);
            System.out.println("Stmt 3");
            try{
                System.out.println("Stmt 4");
                System.out.println("Stmt 5");
                System.out.println("Stmt 6");
            }catch (Exception e){
                System.out.println("Stmt 7");
            }finally {
                System.out.println("Stmt 8");
            }
            System.out.println("Stmt 9");
        } catch (Exception e) {
            System.out.println("Stmt 10");
        } finally {
            System.out.println("Stmt 11");
        }
        System.out.println("Stmt 12");
    }
}

// O/p - 1,10,11,12, Normal Termination
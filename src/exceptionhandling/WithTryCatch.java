package exceptionhandling;

public class WithTryCatch {
    public static void main(String[]args){
        System.out.println("Stmt - 1");
        try{
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println(10/2); // Here in this catch block we added a alternative code
        }
        System.out.println("Stmt - 3");
    }
}

package exceptionhandling;

public class MethodsToPrintExceptionInformation {

    public static void main(String[] args) {

        System.out.println("Stmt - 1");
        System.out.println("Stmt - 2");

        try {
            System.out.println(10 / 0);
        }
        catch (Exception e) {

            System.out.println(10 / 2);

            // 1) e
            // Prints the exception name and description.
            System.out.println(e);

            // 2) getMessage()
            // Prints only the description/message of the exception.
            System.out.println(e.getMessage());

            // 3) toString()
            // Prints the exception name and description.
            System.out.println(e.toString());

            // 4) printStackTrace()
            // Prints complete exception information including
            // exception name, description and the location
            // where the exception occurred.
            e.printStackTrace();
        }
    }
}

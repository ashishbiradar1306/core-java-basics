package operators;

public class LogicalOperator {
    public static void main(String[]args){
        String username = "Ashish150";
        String password = "Ashish@150";
        int age = 18;
        int x = 5;
        int y = 10;
        int z = 15;

        // And Operator &&
        // In The Logical Operator - It Combines Multiple Conditions With a Single Expression
        // In The Logical Operator If The Both Conditions are true then The O/P Will Be True , If One Is True And One Is False Then The Result Will Be False
        if(username == password && password == username){
        System.out.println("Login Successfull");
        }else{
            System.out.println("Provided Cridentials are incorrect ");
            System.out.println("Please Provide The Correct Cridentials ");
        }

        // OR Operator ||
        // In The OR Operator If The One or Two Conditions Are True Then The Result will be True And Both Conditions are False Then The Result will be false
        if(age>18 || age==18 ){
            System.out.println("Your Eligible For The Votting");
        }else{
            System.out.println("Your Not Eligible For The Votting");
        }

        // Not Operator !
        // In The Not Operator It Simply Reverse The Results If The Result Is true then it will returns It to the false If The Result is false Then it will returns true
        if(!(x>y)){
            System.out.println("Hello");
        }else{
            System.out.println("Hello Java");
        }
    }
}
package operators;

public class RelationalOperator {
    public static void main(String[]args){

        int a = 20;
        int b = 15;
        int age = 18;
        int newAge = 5;
        int a1 = 50;
        int a2 = 50;
        int b1 = 100;
        int b2 = 250;

        // Greater Than >
        if(a>b){
            System.out.println("A Is Greater Than B");
        }else{
            System.out.println("A Is Less Than B");
        }

        // Greater Than >=
        if(age >= 18){
        System.out.println("Your Eligible for votting");
        }else{
        System.out.println("Your Not Eligible for votting");
        }

        // Less Than <
        if(a<b){
            System.out.println("A Is Greater Than B");
        }else{
            System.out.println("A Is Less Than B");
        }

        // Less Than <=
        if(newAge<=5){
            System.out.println("Your Not Eligible For The Votting");
        }else{
            System.out.println("Your Eligible For The Votting");
        }

        // Equal To
        if(a1==a2){
            System.out.println("A1 Is Equals To A2");
        }else{
            System.out.println("A1 Is Not Equals To A2");
        }

        // Not Equals To
        if(b1 != b2){
            System.out.println("B1 Is Not Equals To B2");
        }else{
            System.out.println("B1 Is Equals To B2");
        }

    }
}

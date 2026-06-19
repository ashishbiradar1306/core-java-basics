package methods;

// Method Syntax one
// Syntax 1 : Syntax 1 Has A Void Return_Type and No Parameter
// static_keyword void_keyword_asAReturnType method_name () {
//
// }

// To Call This Method Simply In

public class MethodSyntaxOne {

    public static void main(String [] args){
        MethodSyntaxOne.greet();
        MethodSyntaxOne.dance();
        MethodSyntaxOne.food();
        MethodSyntaxOne.displayAge();
        MethodSyntaxOne.showName();
        MethodSyntaxOne.showCity();
        MethodSyntaxOne.showMarks();
        MethodSyntaxOne.greetUser();
    }

    // Q1 - Display Name
    static void greet(){
        System.out.println("Hello Ashish");
    }

    // Q2
    static void dance(){    // 2
        System.out.println("Dance Practice");
    }

    // Q3
    static void food(){     // 3
        System.out.println("Get Food From The Mess");
    }

    // Q4 - Diaplay Age
    static void displayAge(){  // 4
         System.out.println("Basically This Method Shows Only Age !");
        System.out.println("So My Current Age Is 19");
    }

    // Q5 - Show Name
    static void showName(){ // 5
        System.out.println("This Method Show My Name !");
        System.out.println("My Name Is Ashish Biradar");
    }

    // Q6 - Show City
    static void showCity(){   // 6
        System.out.println("This Method Shows The City !");
        System.out.println("Currently I'm Living in a Pune ");
    }

    // Q7 - Grets User
    static void greetUser(){ // 7
        System.out.println("This Method greets the user !");
        System.out.println("Hello Ashish Good Morning !");
    }

    // Q8 - Show Marks
    static void showMarks () {  // 8
    System.out.println("This Method Shows The Marks !");
    System.out.println("8.32 SGPA");
    }

}


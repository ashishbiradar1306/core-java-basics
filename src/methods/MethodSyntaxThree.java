package methods;
public class MethodSyntaxThree {
    public static void main(String[] args) {
        int value = getNumber();
        System.out.println(value);
        System.out.println(getMarks());
        int add = addition();
        System.out.println("Addition Of A Two Number Is :"+ add);
        getAge();
        System.out.println("Result Is :"+ calculate());
        System.out.println("Multiplication Is :"+ multiply());


        int result = getNumber2();
        int total = 50 + result;
        System.out.println("Total ="+total);


    }
    // Q1 - Return a number and store it in a variable, then print it.
    static int getNumber() {
        return 50;
    }

    // Q2 - Return marks and print the returned value directly.
    static int getMarks(){
        return 85;
    }

    // Q3 - Return the addition of two numbers and print the stored result.
    static int addition(){
        int a1 = 2456;
        int a2 = 1080;
        return a1+a2;
    }

    // Q4 - Return an age but ignore the returned value.
    static int getAge(){
        return 19;
    }

    // Q5 - Return a different value than the values stored in local variables.
    static int calculate(){
        int x = 10;
        int y = 10;

        return 1000;
    }

    // Q6 - Return the multiplication of two numbers and print it directly.
    static int multiply(){
        int a = 10;
        int b = 5;

        return a * b;
    }

    // Q7 - Return a number, use it in an expression, and print the final result.
    static int getNumber2(){
        return 100;
    }
}

// Q8 - Return a value from a method in another class and print it.
class Testing {
    public static void main(String[] args) {

    }

    {
        int sub = Maths.substrac();
        System.out.println(sub);
    }
}

class Maths {
    static int substrac(){
        int s1 = 100;
        int s2 = 40;
        return s1 - s2;
    }
}




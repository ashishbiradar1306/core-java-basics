package polymorphism.methodoverloading;

// Method Overloading Rules :
// 1) The overloaded method must change the argument list(number of parameters,data type or sequence of parameters)
// 2) The return type of overloaded method can be change

// In the below example we completely follow the rule no1 there we change the number of parameters
public class RuleOne {

    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum :" + sum);
    }

    void add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Sum :" + sum);
    }

    public static void main(String[]args){
        RuleOne obj = new RuleOne();
        obj.add(75,75);
        obj.add(75,75,75);
    }
}

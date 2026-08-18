package polymorphism.methodoverloading;
// Method Overloading rule 3
// 3) We can change the access modifier of the method

// In the below program we completely follow the rule 3


public class RuleThree {

    void methodDemo(){
    System.out.println("Default Modifier");
    }

    public void methodDemo(int a){
        System.out.println("Public Modifier");
    }

    public static void main(String[]args){
        RuleThree obj = new RuleThree();
        obj.methodDemo();
        obj.methodDemo(10);
    }
}

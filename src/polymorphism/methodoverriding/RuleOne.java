package polymorphism.methodoverriding;

// Rule 1:
// A method can be overridden only in a child class
// It requires a parent-child relationship

public class RuleOne {
    void demo(int age , String name){
        System.out.println("Name of the student :"+name);
        System.out.println("Age of the student :"+age);
    }
}
class RuleOneChild extends RuleOne{
    @Override
    void demo(int age , String name){
        super.demo(15,"Ashish"); // we are accessing the parent class method by using the super keyword , also we can call with creating a obj of parent class and upcasting

        System.out.println("Name Of the employee :"+age);
        System.out.println("Age of the employee :"+name);
    }
}

class MainForObj extends RuleOneChild{
    public static void main(String[]args){
        MainForObj obj = new MainForObj();
        obj.demo(20,"Ashish");

    }
}


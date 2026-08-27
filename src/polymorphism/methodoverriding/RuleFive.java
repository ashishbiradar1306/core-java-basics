package polymorphism.methodoverriding;

// Rule Five :
// The method declared final cannot be overriden

/*

public class RuleFive {
    final void demo(){
        System.out.println("In parent class method");
    }
}

class RuleFiveChild extends RuleFive{
    @Override
    void demo(){
        super.demo();
        System.out.println("In child class method");
    }
}

class MainForObj5 extends RuleFiveChild{
    public static void main(String[]args){
        RuleFive obj = new RuleFiveChild();
        obj.demo();
    }
}

*/

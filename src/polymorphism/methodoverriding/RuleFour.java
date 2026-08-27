package polymorphism.methodoverriding;

public class RuleFour {
    void demo(){
        System.out.println("This is a parent class method ");
    }
}

class RuleFourChild extends RuleFour{
    @Override
    protected void demo(){
        System.out.println("This is a child class method ");
    }
}

class MainForObj4{
    public static void main(String[] args) {

    }
}
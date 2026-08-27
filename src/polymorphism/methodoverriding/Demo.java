package polymorphism.methodoverriding;

public class Demo {
    void msg(){
        System.out.println("In a parent class method");
    }
}
class ChildDemo extends Demo{
    @Override
    void msg(){
        System.out.println("In a child class method");
        super.msg();
    }
}

class MainForObj1{
    public static void main(String[]args){
        Demo obj = new ChildDemo();
        obj.msg();
    }
}

// JVM decides which overridden method to execute
// based on the actual object type created at runtime
// not based on the reference variable type
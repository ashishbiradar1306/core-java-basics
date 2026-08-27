package polymorphism.methodoverriding;

// Example : Reducing the visibility of the modifier

public class ParentClass {
    public void m1(){
        System.out.println("Inside a parent class method");
    }
}

class ChildClassNew extends ParentClass{
//    @Override
//    protected void m1(){
//        super.m1();
//        System.out.println("Inside a child class method");
//    }
}
class MainForObj3{
    public static void main(String[] args) {
        ParentClass obj = new ChildClassNew();
        obj.m1();
    }
}

// We cannot reduce the visibility of the access modifiers in java
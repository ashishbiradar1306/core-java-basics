package polymorphism.methodoverriding;

public class WithoutAnnotation {
    private void print(){
        System.out.println("Super class method");
    }
}

class ChildClass extends WithoutAnnotation{
//    @Override
    private void print(){
        System.out.println("Child class method");
    }
}

// A method declared as private in the parent class is not visible to the child class
// So if we create a method with the same signature in the child class
// both methods are as different methods and there is no error
// But if we use the @Override annotation the compiler will give a error
// because the private parent method cannot be overridden
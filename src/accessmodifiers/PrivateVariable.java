package accessmodifiers;

// Create class Student with a private int age = 20 Try to access age from another class
public class PrivateVariable {
private int age = 20;
private int newAge = 21;

void publicMethod(){
    System.out.println(age);
}

public int getAge(){
    return newAge;
}

public void display(){
    System.out.println(getAge());
}

}


class AccessPrivate{
    public static void main(String[]args){
        // We Cannot Access private member directly we can access it by using the getter method and public method
        // There is only 2 way two access the private member (PUBLIC METHOD AND GETTER METHOD)
        PrivateVariable obj = new PrivateVariable();
        obj.publicMethod();
        obj.display();
    }
}

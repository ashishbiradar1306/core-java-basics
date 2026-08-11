package accessmodifiers;

// Create a private method display() in class A. Try to call it from another class
public class PrivateMethod {

    private void displayDetails() {
        String name = "Ashish";
        int age = 20;

        System.out.println(name);
        System.out.println(age);
    }

    public void display() {
        displayDetails();   // Simply call the private method
    }
}

class AccessingPrivate {

    public static void main(String[] args) {

        PrivateMethod obj = new PrivateMethod();
        obj.display();
    }
}
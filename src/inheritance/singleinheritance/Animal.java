package inheritance.singleinheritance;

/* Create a class Animal with the attributes name and age, and a method eat()
Create a subclass Dog that adds the attribute breed and a method bark()
Call all the methods using a Dog object.
 */

public class Animal {
    String name = "Tommy";
    int age = 5;
    void eat(){
        System.out.println("Tommy's Age Is :"+age);
    }
}
class Dog extends Animal{
    String food = "bread";
    void bark(){
        System.out.println(name +" Is Barkking");
        System.out.println(name + " Is Eatting"+ food);
    }

    public static void main(String[] args) {
        Dog d1 =  new Dog();
        d1.eat();
        d1.bark();
    }
}

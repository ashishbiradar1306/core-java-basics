package inheritance.singleinheritance;

/* Create a class Vehicle with the attributes brand and model, and a method startEngine()
Create a subclass Car that adds the attribute fuelType and a method showCarInfo()
Display all the information using a Car  */

public class Vehicle{
    String brand = "TATA";
    String model = "TATA PUNCH";
    void startEngine(){
        System.out.println("Engine Started");
        System.out.println("Brand Name :"+brand);
        System.out.println("Model Name :"+model);
    }
}

class Car extends Vehicle {
    String fuelType = "EV";
    void showCarInfo(){
        System.out.println("Fuel Type Is : "+fuelType);
    }
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.startEngine();
        car1.showCarInfo();
    }
}
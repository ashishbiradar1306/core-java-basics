package abstraction;

public abstract class VehicleSystem {
    String brand;
    VehicleSystem(String brand){
        this.brand = brand;
    }
    abstract void start();
    void showBrand(){
        System.out.println("Brand :"+brand);
    }
}

class Car extends VehicleSystem{
    Car(String brand){
        super(brand);
    }
    @Override
    void start(){
        System.out.println("Car starts using a key");
    }
}

class Bike extends VehicleSystem{
    Bike(String brand){
        super(brand);
    }
    @Override
    void start(){
        System.out.println("Bike starts using a self start button");
    }
}

class ClsForVsObj{
    public static void main(String[]args){
        Car c1 = new Car("Car Brand Is BMW");
        c1.showBrand();
        c1.start();

        Bike b1 = new Bike("Bike Brand Is Ninga Kawasaki");
        b1.showBrand();
        b1.start();
    }
}
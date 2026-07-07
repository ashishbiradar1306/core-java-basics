package inheritance.singleinheritance;

/* Create a class Appliance with the attributes brand and power and a method switchOn()
 Create a subclass WashingMachine that adds the attribute capacity and a method washClothes() Display all the details
 */

public class Appliance {
String brand = "LG";
String power = "1500W";
void switchOn(){
    System.out.println("Brand Is :"+brand);
    System.out.println("Power IS :"+power);
}
}
class WashingMachine extends Appliance{
    String capacity = "6 KG";
    void washClothes(){
        System.out.println("Machine Capacity Is :"+capacity);
    }

    public static void main(String[] args) {
    WashingMachine machine1 = new WashingMachine();
    machine1.switchOn();
    machine1.washClothes();
    }
}
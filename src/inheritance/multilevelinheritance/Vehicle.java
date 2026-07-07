package inheritance.multilevelinheritance;

/* Cab Fare Calculator
Create a class Vehicle with the attribute vehicleNumber
        Create a subclass Cab that adds the attributes driverName and distanceTravelled
        Then create another subclass PremiumCab that adds the attribute ratePerKm */

// Fare = Distance Travelled × Rate Per Km


public class Vehicle {
    int vehicleNumber = 4525;
}
class Cab extends Vehicle{
String driverName = "Pradeep";
int distanceTraveled = 400;
}
class PremiumCab extends Cab{
    int ratePerKm = 25;
    void totalBill(){
        System.out.println("Vehicle Number:"+vehicleNumber);
        System.out.println("DriverName:"+driverName);
        System.out.println("Distance Traveled :"+distanceTraveled);
        System.out.println("Rate Per KM"+ratePerKm);
        int totalBillAmount = (distanceTraveled * ratePerKm);
        System.out.println("Total Bill Amount Is :"+totalBillAmount);
    }

    public static void main(String[] args) {
        PremiumCab p1 = new PremiumCab();
        p1.totalBill();
    }
}

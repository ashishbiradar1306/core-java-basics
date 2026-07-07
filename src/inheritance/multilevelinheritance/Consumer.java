package inheritance.multilevelinheritance;


/*Create a class Consumer with the attributes consumerName and meterNumber
        Create a subclass ElectricityUsage that adds the attribute unitsConsumed
        Then create another subclass ElectricityBill that adds the attribute ratePerUnit
        Calculate the electricity bill using the */



public class Consumer {
    String consumerName = "Ashish";
    long meterNumber = 545652;
}
class electricityUsage extends Consumer{
    long unitsConsumed = 63;
}
class ElectricityBill extends electricityUsage{
    short ratePerUnit = 12;
    void finalBill(){
        long bill = (unitsConsumed * ratePerUnit);
        System.out.println("This Month Total Electricity Bill Is :"+bill);
    }

    public static void main(String[] args) {
        ElectricityBill h1 = new ElectricityBill();
        h1.finalBill();
    }
}

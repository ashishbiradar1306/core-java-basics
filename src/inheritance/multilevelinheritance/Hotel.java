package inheritance.multilevelinheritance;

/* Create a class Hotel with the attributes hotelName and city
        Create a subclass Room that adds the attributes roomNumber and pricePerNight
        Then create another subclass Booking that adds the attribute numberOfDays
        Calculate the total bill based on the number of days stayed and display all the details */

public class Hotel {
    String hotelName = "Krushna";
    String city = "Pune";
}
class Room extends Hotel{
    int roomNumber = 252;
    int pricePerNight = 2000;
}
class Booking extends Room{
    int numberOfDays = 5;
    void totalBill(){
        int bill = (numberOfDays * pricePerNight);
        System.out.println("Hotel Name: " + hotelName);
        System.out.println("City: " + city);
        System.out.println("Room Number : " + roomNumber);
        System.out.println("Total stay" + numberOfDays + " Days");
        System.out.println("Total Bill Amount : " +bill);
    }

    public static void main(String[] args) {
        Booking c1 = new Booking();
        c1.totalBill();
    }
}

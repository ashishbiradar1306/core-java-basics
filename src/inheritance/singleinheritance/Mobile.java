package inheritance.singleinheritance;

/*
 Create a class Mobile with the attributes company and price and a method makeCall()
 Create a subclass Smartphone that adds the attributes RAM and storage
 along with a method browseInternet(). Display all the details.
*/
public class Mobile {
    String company = "Samsung";
    int price = 35000;
    void makeCall(){
        System.out.println("Mobile Company :"+company);
        System.out.println("Mobile Price :"+price);
    }
}
class Smartphone extends Mobile{
String ram = "8 GB";
String storage = "128 GB";
void browseInternet(){
    System.out.println("Mobile RAM :"+ram);
    System.out.println("Mobile Storage:"+storage);
}

    public static void main(String[] args) {
        Smartphone mob1 = new Smartphone();
        mob1.makeCall();
        mob1.browseInternet();
    }
}
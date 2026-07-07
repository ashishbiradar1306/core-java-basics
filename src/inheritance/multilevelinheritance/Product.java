package inheritance.multilevelinheritance;

/* Create a class Product with the attributes productName and price
Create a subclass ElectronicProduct that adds the attributes warranty and discountPercentage
Then create another subclass Laptop that adds the attributes RAM and storage
Calculate the discount amount and the final price after applying the discount. Display all the details.
 */
public class Product {
    String productName = "TV";
    float price = 15000.00f;
}
class ElectronincProduct extends Product {
    int warranty = 1;
    int discountPercentage = 25;
}
class Laptop extends ElectronincProduct{
    int ram = 16;
    int storage = 512;
    void finalBill(){

    }
    void bill(){
        float  discountAmount = (price * discountPercentage) / 100;
        float finalPrice = price - discountAmount;
    }


    public static void main(String[] args) {
        Laptop p1 = new Laptop();
        p1.bill();;
    }
}

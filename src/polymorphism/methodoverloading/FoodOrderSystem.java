package polymorphism.methodoverloading;

public class FoodOrderSystem {

    void placeOrder(String food) {
        System.out.println("Food :" + food);
    }

    void placeOrder(String food, int quantity) {
        System.out.println("Food :" + food + " Quantity :" + quantity);
    }

    void placeOrder(String food, int quantity, String deliveyLocation) {
        System.out.println("Food :" + food + "Quantity" + quantity + "Delivery Collection :"+deliveyLocation);
    }
    public static void main(String[]args){
        FoodOrderSystem obj = new FoodOrderSystem();
        obj.main(args);
        obj.placeOrder("Panner Roll");
        obj.placeOrder("Biryani",2);
        obj.placeOrder( "Panner Biryani",2,"Hadapsar");
    }
}

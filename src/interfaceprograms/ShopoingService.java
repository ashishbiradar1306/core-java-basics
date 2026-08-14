package interfaceprograms;

public class ShopoingService {

}
    interface Order {
        void placeOrder();
        void cancelOrder();
        void trackOrder();
    }

class OnlineOrder implements Order{
    @Override
    public void placeOrder(){
    System.out.println("Your Order is placed successfully !");
    }

    @Override
    public void trackOrder(){
    System.out.println("Your order is coming in few minutes");
    }

    @Override
    public void cancelOrder(){
        System.out.println("At this moment we cannot cancel your order ... Order is at your doorstep ");
    }
}

class StoreOrder implements Order{
    @Override
    public void placeOrder() {
        System.out.println("Your Order is placed successfully !");
    }

    @Override
    public void cancelOrder(){
        System.out.println("Your order is cancel successfully ");
    }

    @Override
    public void trackOrder(){
        System.out.println("We cannot track your order ... Your order is cancel !");
    }
}

class MainForObj6 {
    public static void main(String[] args) {
        OnlineOrder onlineorder1 = new OnlineOrder();
        onlineorder1.placeOrder();
        onlineorder1.trackOrder();
        onlineorder1.cancelOrder();

        StoreOrder storeOrder1 = new StoreOrder();
        storeOrder1.placeOrder();
        storeOrder1.trackOrder();
        storeOrder1.cancelOrder();

    }
}
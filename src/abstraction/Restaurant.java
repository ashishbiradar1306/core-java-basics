package abstraction;

// Food Delivery System :

public abstract class Restaurant {
String restaurantName;
String location;
Restaurant(String restaurantName,String location){
    this.restaurantName=restaurantName;
    this.location=location;
}
    abstract void prepareFood();
    void showRestaurantDetails(){
    System.out.println("Restaurant Name :"+restaurantName);
    System.out.println("Restaurant Location :"+location);
    }
}
class PizzaRestaurant extends Restaurant{
    PizzaRestaurant(String restaurantName,String location){
        super(restaurantName, location);

    }
    @Override
    void prepareFood(){
        System.out.println("Preparing Food");
    }

}

class BiryaniRestaurant extends Restaurant{
    BiryaniRestaurant(String restaurantName,String restaurantLocation){
        super(restaurantName,restaurantLocation);
    }
    @Override
    void prepareFood(){
        System.out.println("Preparing Biryani");
    }
}

class MainForObj{
    public static void main(String[]args){

        Restaurant r1  = new BiryaniRestaurant("Garva Biryani","Sasane Nagar , Hadapsar ");
        r1.showRestaurantDetails();
        r1.prepareFood();

        Restaurant r2 = new PizzaRestaurant("Pizza Hut","Hadapsar Pune");
        r2.showRestaurantDetails();
        r2.prepareFood();

    }
}
package inheritance.singleinheritance;

/* Create a class Shape with the attribute color and a method displayColor()
 Create a subclass Rectangle that adds the attributes length and width
 along with a method calculateArea() Display the color and area
*/
public class Shape {
    String color = "Black";
    void displayColor(){
        System.out.println("Shapes Color Is :"+color);
    }
}
class Rectangle extends Shape{
    float length = 12.5f;
    float breadth = 8.4f;
    void calculate(){
        float area = length * breadth ;
        System.out.println("Area Is :"+area);
    }

    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        obj1.displayColor();
        obj1.calculate();
    }
}
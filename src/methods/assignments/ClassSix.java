package methods.assignments;

public class ClassSix {
    public static void main(String[] args) {

        int number = 100;
        int product = 10;
        int length = 5;
        int breadth = 2;

        ClassSix obj3 = new ClassSix();

        obj3.square(); // 1

        obj3.printNumber(number); // 2

        int productIs = obj3.returnProduct(product); // 3
        System.out.println("Product Of 10 Is :" + productIs);

        int perimeter = obj3.returnPerimeter(length,breadth); // 4
        System.out.println("Perimeter Is :"+perimeter);

    }

    // Q1 Print the square of 5.
    void square() {
        int number = 5;
        int squareOfFive = number * number;
        System.out.println("Square Of Five Is :" + squareOfFive);
    }

    // Q2 Pass a Number , Method should print number + 100
    void printNumber(int number) {
        System.out.println("Result Is :" + (number+ 100));
    }

    // Q3 Return the product of 10 and 10
    int returnProduct(int product) {
        int prod = product * product;
        return prod;
    }


    // Q4 Pass length and breadth Return perimeter.
    int returnPerimeter(int length, int breadth) {
        int perimeter = 2 * (length + breadth);
            return perimeter;
        }
    }





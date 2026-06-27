package methods.assignments;

public class ClassEight {
    public static void main(String[]args){
        int age = 21;
        int length = 10;
        int breadth = 5;

        ClassEight obj5 = new ClassEight();

        obj5.multiply(); // 1

        int agrAfterTenYears = obj5.ageIncrement(age); // 2
        System.out.println("Age After Ten Years :"+agrAfterTenYears);

        int divs = obj5.division(); // 3
        System.out.println("Division Is :"+divs);

        int printArea = obj5.returnArea(length,breadth); // 4
        System.out.println("Area Is :"+printArea);

    }

    // Q1 Print the result of 9 * 9.
    void multiply(){
        int mul = 9 * 9;
        System.out.println("Multiplication Is : "+mul);
    }

    // Q2 Declare age=21, pass it and print age after 10 years.
    int ageIncrement(int age){
        return age + 10;
    }

    // Q3 Return the result of 100 / 5 store and print it.
    int division() {
        int div = 100 / 5;
        return div;
    }

    // Q4 Declare length=10,breadth=5, pass them and return area.
    int returnArea(int lenght , int breadth){
        int area = lenght * breadth;
        return area;
    }
}

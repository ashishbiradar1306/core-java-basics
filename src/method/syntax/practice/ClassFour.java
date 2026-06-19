package method.syntax.practice;

public class ClassFour {
public static void main(String[]args) {
    int id = 101;
    String name = "Ashish";

    ClassFour obj1 = new ClassFour();

    obj1.displayNumber(id); // 1


    int amount = obj1.storeAmount(); // 2
    System.out.println("Amount Is :"+amount);

    obj1.displayName(name); // 3

    char storeGrade = obj1.grade(); // 4
    System.out.println("Grade Is :" +storeGrade);

}


    // Q1 Declare int id=101, pass and print it.
    void displayNumber(int id){
        System.out.println("Number Is :"+id);
    }

    // Q2 Return 999, store in amount and print it.
    int storeAmount(){
    return 999;
    }

    // Q3 Declare String name="Ashish", pass and print it.
    void displayName(String name){
    System.out.println("Student Is :"+ name);
    }

    // Q4 Return 'A', store in grade and print it.
    char grade(){
    return 'A';
    }

}




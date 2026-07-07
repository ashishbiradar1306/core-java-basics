package inheritance.singleinheritance;

/* Create a class Person with the attributes name and age and a method displayPerson()
Create a subclass Teacher that adds the attributes subject and salary
along with a method displayTeacher() Display all the information */


public class Person {
    String name = "Aakash";
    int age = 18;
    void displayPerson(){
        System.out.println("Person Name :"+name);
        System.out.println("Person Age :"+age);
    }
}
class Teacher extends Person{
    String subject = "Java";
    double salary = 75000.75;
    void displayTeacher(){
        System.out.println("Subject Is :"+subject);
        System.out.println("Salary Is :"+salary);
    }
    public static void main(String [] args){
        Teacher teacher1 = new Teacher();
        teacher1.displayPerson();
        teacher1.displayTeacher();
    }
}

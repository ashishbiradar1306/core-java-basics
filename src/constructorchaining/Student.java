package constructorchaining;

public class Student {
    String name;
    int age;
    String course;

    Student(){
        this("Ashish");
        System.out.print("No arg constructor");
    }
    Student(String name){
        this("Ashish",19);
        System.out.print("Name:"+name);
    }
    Student(String name,int age){
        this("Ashish",19,"BBA-CA");
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
    Student(String name,int age,String course){
        this.name=name;
        this.age=age;
        this.course=course;
        System.out.println("Name:"+name);
        System.out.print("Age:"+age);
        System.out.println("Course:"+course);
    }
    public static void main(String[] args) {
    Student obj = new Student();
    }
}

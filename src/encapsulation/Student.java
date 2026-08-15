package encapsulation;

// 1) Student Information System :

public class Student {
    private int studentId;
    private String name;
    private int age;
    private String course;

    // Getter Methods :

    public int getStudentId(){
        return studentId;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getCourse() {
        return course;
    }

    // Setter Methods :

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name){
        this.name= name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setCourse(String course){
        this.course = course;
    }
}

class MainForObj1{
    public static void main(String [] args){
        Student stud1 = new Student();

        stud1.setStudentId(1012);
        stud1.setName("Ashish");
        stud1.setAge(19);
        stud1.setCourse("BCA");

        System.out.println("Student Id: "+stud1.getStudentId());
        System.out.println("Student Name: "+stud1.getName());
        System.out.println("Student Age: "+stud1.getAge());
        System.out.println("Course Name: "+stud1.getCourse());

    }
}

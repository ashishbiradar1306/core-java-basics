package interfaceprograms;

public interface SchoolMember {
    int memberId = 101;
    String memberName = "Ashish";

    int memberId1 = 102;
    String memberName1 = "Akshay";

    int memberId2 = 103;
    String memberName2 = "Nikhil";

    void displayDetails();

    void performRole();
}


class School {
    interface Rules {

        void followUniform();

        void followTiming();
    }
}

class Student implements SchoolMember {
    @Override
    public void displayDetails() {
        System.out.println("Student Name: " + memberName1);
        System.out.println("Student Id: " + memberId1);
    }

    @Override
    public void performRole() {
        System.out.println("Student is studying");
    }
}

class Teacher implements SchoolMember {
    @Override
    public void displayDetails() {
        System.out.println("Teacher Name: " + memberName);
        System.out.println("Teacher Id: " + memberId);
    }

    @Override
    public void performRole() {
        System.out.println("Teacher is teaching");
    }
}

class Admin implements SchoolMember {
    @Override
    public void displayDetails() {
        System.out.println("Admin Name: " + memberName2);
        System.out.println("Admin Id: " + memberId2);
    }

    @Override
    public void performRole() {
        System.out.println("Admin is managing school activities");
    }
}

class SchoolRules implements School.Rules {
    @Override
    public void followUniform() {
        System.out.println("Students must wear proper school uniform");
    }

    @Override
    public void followTiming() {
        System.out.println("Students must follow school timings");
    }
}

class SchoolManagementSystem {
    public static void main(String[] args) {

        Student student = new Student();
        student.displayDetails();
        student.performRole();

        Teacher teacher = new Teacher();
        teacher.displayDetails();
        teacher.performRole();

        Admin admin = new Admin();
        admin.displayDetails();
        admin.performRole();

        SchoolRules rules = new SchoolRules();
        rules.followUniform();
        rules.followTiming();
    }
}
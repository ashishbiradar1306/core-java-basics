package strings;

public class ImmutableClass {
    public static void main(String[]args){
        Course course = new Course(1012,"BCA");
        Ashish ashish = new Ashish("Ashish",1013,course);

        System.out.println("Course from Original  " + course);

       Course course3 = ashish.getCourse();
        System.out.println("ashis oject   "  + ashish  );

        System.out.println("Course from Ashish  " + course3);

        course3.courseName = "Java";
        System.out.println("Course from Ashish  " + course3);
        System.out.println("ashis oject   "  + ashish  );

    }
}

final class Ashish{
    private final String name;
    private final int id;
    private final Course course;

    public Ashish(String name, int id, Course obj) {
        this.name = name;
        this.id = id;
        this.course = new Course(obj);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Course getCourse() {
        Course course1 = new Course(course);
        return course1;

    }

    @Override
    public String toString() {
        return "Ashish{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", obj=" + course +
                '}';
    }
}

class Course{
    int id;
    String courseName;

    public Course(int id, String courseName) {
        this.id = id;
        this.courseName = courseName;
    }

    public Course(Course course){
        this.id = course.id;
        this.courseName = course.courseName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
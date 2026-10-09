package strings;
final class Student {
    private final int id;
    private final String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    private final NormalClass obj = new NormalClass("Ashish 🤣", 1012);
}

class NormalClass {
    String name;
    int age;
    public NormalClass(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        NormalClass obj = new NormalClass("Ashish", 1012);
        NormalClass obj1 = new NormalClass("Pratamesh",1013);

        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}
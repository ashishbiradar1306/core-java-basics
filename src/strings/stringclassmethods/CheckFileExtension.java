package strings.stringclassmethods;

public class CheckFileExtension {
    public static void main(String[] args) {
        String str = "Student.java";
        if (str.endsWith(".java")) {
            System.out.print("File ends with .java");
        }else if (str.endsWith(".class")){
            System.out.print("File ends with .class");
        }else{
            System.out.println("File ends with other extensions");
        }
    }
}

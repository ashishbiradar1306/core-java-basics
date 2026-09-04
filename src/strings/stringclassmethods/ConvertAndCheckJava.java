package strings.stringclassmethods;

public class ConvertAndCheckJava {
    public static void main(String[]args){
        String str = "I Am Learning JAVA";
        str = str.toLowerCase();
        System.out.println("Lowercase string :"+str);
        System.out.print("Contains java :"+str.contains("java"));
    }
}

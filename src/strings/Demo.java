package strings;
import java.lang.String;

public class Demo {
    public static void main(String[]args){
        String s1 = "Ja" + "va";
        String s2 = "Java";
        System.out.print(s1==s2); // True
        System.out.println();

        String s3 = "Hello";
        String s4 = s3 + "World";
        String s5 = "Hello World";
        System.out.print(s4==s5); // False
        System.out.println();

        // String Pool - Hello , World
        // Heap - Hello World

        String s6 = "Hello";
        String s7 = s6;
        System.out.print(s7 == s6); // True

        // The references will be resolved on the compile time

        String s8 = "Hello";
        s8 = "World";
        System.out.print(s8);

         // we can change the content at compile time then for the first content anyone is not pointing so after some time
        // garbage collection will remove it

        String s9 = new String("Hello");
        String s10 = "Hello";
        System.out.print(s9==s10); // False

    }
}

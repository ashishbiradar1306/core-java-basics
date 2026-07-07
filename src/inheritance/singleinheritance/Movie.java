package inheritance.singleinheritance;

/*4. Movie → ActionMovie 🎬

Create a class Movie with:

Attributes:
title
        duration
Method:
displayMovie()

Create a subclass ActionMovie with:

Attribute:
heroName
Method:
displayHero()

Display all the details.
*/
public class Movie {
String title = "KGF Chapter 2";
void displayMovie(){
    System.out.println("Title :"+title);
}
}
class ActionMovie extends Movie{
    String heroName = "YASH";
    void displayHero(){
        System.out.println("Hero Name :"+heroName);
    }

    public static void main(String[] args) {
        ActionMovie mov1 = new ActionMovie();
        mov1.displayMovie();
        mov1.displayHero();
    }
}


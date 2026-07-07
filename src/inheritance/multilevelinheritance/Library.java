package inheritance.multilevelinheritance;
/* Create a class Library with the attribute libraryName Create a subclass Book that adds the attributes bookName and dueDays
        Then create another subclass Member that adds the attribute daysLate
        If the member returns the book after the due date, calculate the fine at ₹5 per late day
        otherwise, display "No Fine". Display all the details */


public class Library {
    String libraryName = "Kj";
}
class Book extends Library{
    String bookName = "Atomoic Habits";
    int dueDays = 5;
}
class Member extends Book{
    int daysLate = 0;
    int fine = 5;
    void libraryCard(){
        int lb = (daysLate * fine);
        System.out.println("Fine Amount : " + lb);
        System.out.println("No Fine");
    }

    public static void main(String[] args) {
        Member m1 = new Member();
        m1.libraryCard();
    }
}

package inheritance.singleinheritance;

/* Create a class Book with the attributes title and author, and a method displayBook()
Create a subclass EBook that adds the attributes fileSize and format
along with a method displayEBook(). Display all the details */ //The Guide by R.K. Narayan

public class Book {
    String title = "The Guide";
    String author = "R K Narayan";
    void displayBook(){
        System.out.println("Book Title :"+title);
        System.out.println("Book Author :"+author);
    }
}

class EBook extends Book{
    String fileSize = "50 MB";
    String format = "PDF";
    void displayEBook(){
        System.out.println("Book File Size:"+ fileSize);
        System.out.println("Book Format:"+ format);
    }
    public static void main(String [] args) {
        EBook book1 = new EBook();
        book1.displayBook();
        book1.displayEBook();
    }
}

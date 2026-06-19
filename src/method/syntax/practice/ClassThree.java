package method.syntax.practice;

public class ClassThree {
    public static void main(String[] args) {

        int marks = 95;
        int num1 = 40;
        int num2 = 30;
        int roomNumber = 301;

        ClassThree obj = new ClassThree();

        obj.displayCourseName(); // 1

        obj.displayRoomNumber(roomNumber); // 2

        int floorNo = obj.getFloorNumber(); // 3
        System.out.println("Floor No Is :"+ floorNo);

        int answer = obj.subtractNumbers(num1, num2); // 4
        System.out.println("Substraction is :"+answer);

        obj.displayMarks(marks); // 5

    }

    // Q1) Create a method displayCourseName() Print "Java Full Stack"
    void displayCourseName(){
        System.out.println("Java Full Stack");
        }

    // Q2) Pass roomNumber to displayRoomNumber() and print it.
    void displayRoomNumber(int roomNumber){
        System.out.println("Room Number Is :"+roomNumber);
    }

    // Q3) Return 3 from getFloorNumber() , store it in floor, and print it.
    int getFloorNumber(){
        return 3;
    }


    // Q4) Pass num1 and num2 to subtractNumbers(), return the result, store it in answer, and print it
    int subtractNumbers(int x, int y) {
        int sub = x - y;
        return sub;
    }

    // Q5 Declare int marks = 95 in main() Pass marks to displayMarks(). Inside the method use a parameter named score.Print score.
    void displayMarks(int score) {
        System.out.println(score);
    }
}
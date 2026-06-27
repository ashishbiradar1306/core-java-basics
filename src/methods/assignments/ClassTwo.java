package methods.assignments;

public class ClassTwo {
    public static void main(String[] args) {
        int rollNo = 101;
        int num1 = 25;
        int num2 = 35;
        ClassTwo obj1 = new ClassTwo();
        obj1.displayCollegeName();
        obj1.displayRollNumber(rollNo);
        char storeResult = obj1.getSection();
        System.out.println("Character Is :" + storeResult);
        int total = obj1.getTotal(num1,num2);
        System.out.println("Total Is :"+ total);
    }

    // Q1) Create a method displayCollegeName() Print your college name
    void displayCollegeName() {
        System.out.println("Arihant College Of ACS ");
    }


    // Q2) Declare int rollNo = 101 in main() Pass rollNo to displayRollNo() method and print it.
    void displayRollNumber(int rollNO) {
        System.out.println(rollNO);
    }

    // Q3) Create getSection() Return character 'A' Store returned value in a variable and print it.
    char getSection(){
        return 'A';
    }

    // Q4) Declare num1 = 25 and num2 = 35 in main() Pass both values to getTotal() Return the total and store it in result variable.
    int getTotal(int num1 , int num2){
        int storeResult = num1 + num2 ;
        return storeResult;
    }


}


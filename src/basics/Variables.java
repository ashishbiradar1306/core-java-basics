// Syntax For define variable
// DataType VariableName SemiColan
// Syntax For Declaration Of A Variable
// DataType VariableName Value Semicolan

package basics;

public class Variables {

        // int studentCount ;  => Here it is the only declaration of the variable !
        /* student = 50; => Here it is the only initialization of the variable But To perform only initialization
        there is need to define it in a initializer block
        */
        /*
        double salary = 85000.50; => Here It Is The Declaration and Initialization Both we performs
         */

        double salary; // Here We Define The Variable only
        // salary = 85000.50; //  It Is Correct Only If you define inside a Initializer block means define inside curly braces , methods , constructors !

        {
                int age;
                age = 19;
                //  This is the correct syntax to initialization and declaration of the variable
        }

        byte myAge = 50;
        short shrt = 199;
        int studentAge = 16;
        float flt = 500.50f;
        long phoneNo = 8010999899l;
        double mySalary = 85000.50;
        char let = 'A';
        boolean isItGoingTorainToday = true;
}

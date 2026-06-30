package conditionalstatements;

public class If {
    public static void main(String [] args){
        int a = 10;
        if(a >= 0) {
            System.out.println("Number Is Positive");
        }
    }
}

// 1 Valid
/*

if (true)
sout("Hello");

*/

// 2 Valid
/*

if (true);

*/

// 3 InValid
/*
if(true)
int x = 10;

Note - 1) Without a curly Braces we cannot write a declarative statement in a if statement
       2) Only 1 executable statement we can write
       3) The Internal Reason For This Declarative Statement Is
           int x = 10 ; This is declared using a local variable and local variables we cannot declare outside the block , method , constructor
 */

// 4 Valid
/*
if(true)
{
int x = 10;
}
*/
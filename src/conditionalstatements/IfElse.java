package conditionalstatements;

public class IfElse {
    public static void main(String[] args) {
        int num = 18;

        if(num >= 0){
            System.out.println("Number Is Positive");
        }else{
            System.out.println("Number Is Negative");
        }
        switch(num)
        {
            case 1 :
            System.out.println("Hello");
            break;

        }
    }
}

/*
//Note - 1) Without a curly Braces we cannot write a declarative statement in a else block
       2) Only 1 executable statement we can write
       3) The Internal Reason For This Declarative Statement Is
int x = 10 ; This is declared using a local variable and local variables we cannot declare outside the block , method , constructor
 */

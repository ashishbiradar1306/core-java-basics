package conditionalstatements;

public class NestedIfElse {

    public static void main(String[] args) {

        String bike = "SP125";
        boolean trekPlanConfirm = true;

        if (trekPlanConfirm) {

            if (bike == "SP125") {

                System.out.println("A's Bike Selected");
                System.out.println("A will drive the bike");
                System.out.println("The fuel expense is paid by the other person");

            } else {

                System.out.println("B's Bike Selected");
                System.out.println("B will drive the bike");
                System.out.println("The fuel expense will be shared equally (50-50)");

            }

        } else {

            System.out.println("The trek plan is cancelled");

        }
    }
}

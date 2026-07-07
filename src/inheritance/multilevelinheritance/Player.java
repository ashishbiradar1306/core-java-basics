package inheritance.multilevelinheritance;

/*Cricket Tournament System
Create a class Player with the attributes playerName and jerseyNumber. Create a subclass Batsman that adds the attributes runs and ballsFaced
Then create another subclass Captain that adds the attribute matchesWon. Calculate the strike rate using the formula:
Strike Rate = (Runs × 100) / Balls Faced*/


public class Player {
    String playerName = "Vaibhav";
    int jerseyNumber = 10;
}
class Batsman extends Player{
    int runs = 2000;
    int ballFaced = 850;
}
class Captain extends Batsman {
    int matchesWon = 20;
    void calculateStrikeRate(){
        int strikeRate = (runs * 100) / ballFaced;
        System.out.println("Strike Rate Is :"+strikeRate);
    }

    public static void main(String[] args) {
        Captain p1 = new Captain();
        p1.calculateStrikeRate();
    }
}
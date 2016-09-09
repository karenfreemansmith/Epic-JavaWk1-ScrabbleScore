import java.io.Console;
import java.util.ArrayList;
import java.util.List;
public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Enter your scrabble word.");
    String userWord = myConsole.readLine();
    ScrabbleScorer currentGame = new ScrabbleScorer();
    System.out.println("Your scrabble word score is: " + currentGame.calcScore(userWord));
  }
}

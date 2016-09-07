import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console c = System.console();
    Scrabble newGame = new Scrabble();
    System.out.println("Please enter a word ");
    String userWord = c.readLine();
    System.out.println("Your score is " + newGame.calculateWordScore(userWord));
  }
}

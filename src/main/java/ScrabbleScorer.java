import java.util.ArrayList;
import java.util.List;

public class ScrabbleScorer {
  public static int calcScore(String userWord) {
    String possibleLetters = "aeioulnrstdgbcmpfhvwykjxqz";
    Integer[] pointsArray = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 8, 8, 10, 10};

    int userScore = 0;
    for(String currentLetter : userWord.split("")){

      userScore += pointsArray[possibleLetters.indexOf(currentLetter)];
    }
  return userScore;
  }
}

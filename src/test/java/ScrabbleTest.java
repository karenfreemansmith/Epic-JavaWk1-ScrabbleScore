import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest{
  @Test
  public void calculateScore_returnsScoreForSingleLetter_1() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("a"));
  }
  @Test
  public void calculateScore_returnsCorrectScoreForSingleLetter_Int() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("a"));
    expected = 2;
    assertEquals(expected, testScrabble.calculateScore("d"));
    expected = 3;
    assertEquals(expected, testScrabble.calculateScore("c"));
    expected = 4;
    assertEquals(expected, testScrabble.calculateScore("w"));
    expected = 5;
    assertEquals(expected, testScrabble.calculateScore("k"));
    expected = 8;
    assertEquals(expected, testScrabble.calculateScore("x"));
    expected = 10;
    assertEquals(expected, testScrabble.calculateScore("q"));
  }
  @Test
  public void calculateWordScore_returnsScoreForWord_int() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 8;
    assertEquals(expected, testScrabble.calculateWordScore("hello"));
  }
}

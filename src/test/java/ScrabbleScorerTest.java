import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;


public class ScrabbleScorerTest {
  @Test
  public void calculateScore_returnsScoreForSingleLetter_1() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    int expected = 1;
    assertEquals(expected, testScrabble.calcScore("a"));
  }
  @Test
  public void calculateScore_returnsScoreForSinglePoint_2() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    int expected = 10;
    assertEquals(expected, testScrabble.calcScore("aeioulnrst"));
  }
  @Test
  public void calculateScore_returnsScoreForDoublePoint_3() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    int expected = 4;
    assertEquals(expected, testScrabble.calcScore("dg"));
  }
  @Test
  public void calculateScore_returnsScoreForTriplePoint_4() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    int expected = 12;
    assertEquals(expected, testScrabble.calcScore("bcmp"));
  }
  @Test
  public void calculateScore_returnsScoreForQuadPoint_5() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    int expected = 20;
    assertEquals(expected, testScrabble.calcScore("fhvwy"));
  }
  @Test
  public void calculateScore_returnsScoreForFivePoint_6() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    int expected = 5;
    assertEquals(expected, testScrabble.calcScore("k"));
  }
  @Test
  public void calculateScore_returnsScoreForEightPoint_7() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    int expected = 16;
    assertEquals(expected, testScrabble.calcScore("jx"));
  }
  @Test
  public void calculateScore_returnsScoreForTenPoint_8() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    int expected = 20;
    assertEquals(expected, testScrabble.calcScore("qz"));
  }
}

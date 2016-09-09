public class Scrabble {
  public Integer calculateScore(String letter) {
    if((letter.equals("q"))||(letter.equals("z"))) {
      return 10;
    } else if ((letter.equals("j"))||(letter.equals("x"))) {
      return 8;
    } else if (letter.equals("k")) {
      return 5;
    } else if ((letter.equals("f"))||(letter.equals("h"))||(letter.equals("v"))||(letter.equals("w"))||(letter.equals("y"))) {
      return 4;
    } else if ((letter.equals("b"))||(letter.equals("c"))||(letter.equals("m"))||(letter.equals("p"))) {
      return 3;
    } else if ((letter.equals("d"))||(letter.equals("g"))) {
      return 2;
    } else {
      return 1;
    }
  }
  public Integer calculateWordScore(String word) {
    Integer total=0;
    for(int i=0; i<word.length(); i++) {
      total += calculateScore(Character.toString(word.charAt(i)));
    }
    return total;
  }
}

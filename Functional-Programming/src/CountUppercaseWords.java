import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Predicate;

public class CountUppercaseWords {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String[] text = reader.readLine().split(" ");

    Predicate<String> isUpper = l -> Character.isUpperCase(l.charAt(0));

    int counter = 0;

    for (String word : text) {
      if (isUpper.test(word)) {
        counter++;
        System.out.println(word);
      }
    }

    System.out.println(counter);
  }
}

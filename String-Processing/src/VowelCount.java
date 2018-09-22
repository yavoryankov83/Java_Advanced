import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelCount {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String text = scanner.nextLine().toLowerCase();

    int counter = 0;

    Pattern pattern = Pattern.compile("[uioae]");

    Matcher matcher = pattern.matcher(text);

    while (matcher.find()) {
      counter++;
    }

    System.out.printf("Vowels: %d", counter);
  }
}

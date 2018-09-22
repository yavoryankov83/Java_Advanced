import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractTagsRegex {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Pattern pattern = Pattern.compile("<.+?>");
    String tags;

    while (!"END".equals(tags = scanner.nextLine())) {
      Matcher matcher = pattern.matcher(tags);

      while (matcher.find()) {
        System.out.println(matcher.group());
      }
    }
  }
}

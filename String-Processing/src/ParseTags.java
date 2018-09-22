import java.util.Scanner;

public class ParseTags {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String text = scanner.nextLine();

    while (text.contains("<upcase>")) {
      int indexOfFirstTag = text.indexOf("<upcase>");
      int indexOfSecondTag = text.indexOf("</upcase>");
      String replacement = text.substring(indexOfFirstTag + 8, indexOfSecondTag);

      text = text.replaceFirst("<upcase>.+?<\\/upcase>", replacement.toUpperCase());
    }

    System.out.println(text);
  }
}

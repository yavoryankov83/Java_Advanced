import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SplitByWordCasing {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] words = scanner.nextLine().split("[, ; : /. ! ( ) \" ' \\ / [ ] \\s]+");

    List<String> lowers = new ArrayList<>();
    List<String> uppers = new ArrayList<>();
    List<String> mixed = new ArrayList<>();

    for (String word : words) {
      if (!word.matches("[0-9]+")) {
        if (word.equals(word.toLowerCase())) {
          lowers.add(word);
        } else if (word.equals(word.toUpperCase())) {
          uppers.add(word);
        } else {
          mixed.add(word);
        }
      }
    }
    System.out.printf("Lower-case: %s%n", String.join(", ", lowers));
    System.out.printf("Mixed-case: %s%n", String.join(", ", mixed));
    System.out.printf("Upper-case: %s%n", String.join(", ", uppers));
  }
}

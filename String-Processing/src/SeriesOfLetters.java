import java.util.Scanner;

public class SeriesOfLetters {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    StringBuilder builder = new StringBuilder();

    char[] input = scanner.nextLine().toCharArray();

    for (int i = 0; i < input.length - 1; i++) {

      if (input[i] != input[i + 1]) {
        builder.append(input[i]);
      }
    }
    builder.append(input[input.length - 1]);

    System.out.println(builder.toString());
  }
}

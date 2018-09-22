import java.util.Scanner;

public class ParseURL {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] input = scanner.nextLine().split("://");

    if (input.length != 2) {
      System.out.print("Invalid URL");
      return;
    } else {
      String protocol = String.format("Protocol = %s", input[0]);
      int indexOfSeparator = input[1].indexOf('/');
      String server = String.format("Server = %s", input[1].substring(0, indexOfSeparator));
      String resources = String.format("Resources = %s", input[1].substring(indexOfSeparator + 1));

      System.out.println(protocol);
      System.out.println(server);
      System.out.println(resources);
    }
  }
}

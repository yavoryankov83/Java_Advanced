import java.util.Scanner;

public class ReadInput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String firstWord = scanner.next("\\w+");
    String secondtWord = scanner.next("\\w+");

    int firstInt = scanner.nextInt();
    int secondInt = scanner.nextInt();
    int thirdInt = scanner.nextInt();

    scanner.nextLine();
    String lastWord = scanner.nextLine();

    int sum = firstInt + secondInt + thirdInt;

    String result = String.format("%s %s %s %d", firstWord, secondtWord, lastWord, sum);

    System.out.println(result);
  }
}

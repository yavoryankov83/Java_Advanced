import java.util.*;

public class StudentResults {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] input = scanner.nextLine().split("[,\\s-]+");

    String name = input[0];
    double first = Double.parseDouble(input[1]);
    double second = Double.parseDouble(input[2]);
    double third = Double.parseDouble(input[3]);

    double average = (first + second + third) / 3;

    String firstRow = String.format("%-7s|%7s|%7s|%7s|%s|", "Name", "JAdv", "JavaOOP", "AdvOOP", "Average");
    String result = String.format("%-7s|%7.2f|%7.2f|%7.2f|%7.4f|", name, first, second, third, average);

    System.out.println(firstRow);
    System.out.println(result);
  }
}

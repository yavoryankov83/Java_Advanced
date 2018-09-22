import java.util.Scanner;

public class AverageOfThreeNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] nums = scanner.nextLine().split("\\s+");

    double sum = 0;

    for (String num : nums) {
      sum += Double.parseDouble(num);
    }

    System.out.println(String.format("%.2f", sum / nums.length));
  }
}

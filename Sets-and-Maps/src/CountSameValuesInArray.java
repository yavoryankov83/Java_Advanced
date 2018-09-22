import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountSameValuesInArray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] nums = scanner.nextLine().split(" ");

    Map<String, Integer> result = new HashMap<>();

    for (String num : nums) {
      if (!result.containsKey(num)) {
        result.put(num, 0);
      }
      result.put(num, result.get(num) + 1);

    }

    for (Map.Entry<String, Integer> entry : result.entrySet()) {
      System.out.printf("%s - %d times%n", entry.getKey(), entry.getValue());
    }
  }
}

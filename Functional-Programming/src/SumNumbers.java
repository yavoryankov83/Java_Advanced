import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

public class SumNumbers {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String[] nums = reader.readLine().split(", ");

    Function<String[], int[]> parsedArray = arr -> {
      int[] parsed = new int[arr.length];
      for (int i = 0; i < arr.length; i++) {
        parsed[i] = Integer.parseInt(arr[i]);
      }
      return parsed;
    };

    int[] parsed = parsedArray.apply(nums);

    Function<int[], Integer> sumOfNums = s -> {
      int sum = 0;
      for (int num : s) {
        sum += num;
      }

      return sum;
    };

    System.out.printf("Count = %d%n", parsed.length);
    System.out.printf("Sum = %d", sumOfNums.apply(parsed));
  }
}

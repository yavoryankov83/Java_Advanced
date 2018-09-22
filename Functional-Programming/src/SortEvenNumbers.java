import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortEvenNumbers {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    List<Integer> nums = Arrays.stream(reader.readLine()
            .split(", "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

    nums.removeIf(n -> n % 2 != 0);

    System.out.println((nums.toString().replaceAll("[\\[\\]]", "")));

    nums.sort((x, y) -> x.compareTo(y));
    System.out.println((nums.toString().replaceAll("[\\[\\]]", "")));
  }
}

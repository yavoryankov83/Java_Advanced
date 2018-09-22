import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TakeTwo {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String[] input = reader.readLine().split(" ");

    Arrays.stream(input)
            .map(Integer::parseInt)
            .filter(m -> m >= 10 && m <= 20)
            .distinct()
            .limit(2)
            .forEach(x -> System.out.print(x + " "));
  }
}

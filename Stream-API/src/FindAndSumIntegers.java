import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalInt;

public class FindAndSumIntegers {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    OptionalInt input = Arrays.stream(reader.readLine()
            .split("\\s+"))
            .filter(x -> !x.isEmpty())
            .filter(y -> {
              try {
                Integer.parseInt(y);
                return true;
              } catch (Exception e) {
                return false;
              }
            })
            .mapToInt(Integer::parseInt)
            .reduce((a, s) -> a + s);

    System.out.println(input.isPresent() ? input.getAsInt() : "No match");
  }
}

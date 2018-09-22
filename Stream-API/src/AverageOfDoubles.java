import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class AverageOfDoubles {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    OptionalDouble nums = Arrays.stream(reader.readLine()
            .split("\\s+"))
            .filter(x -> !x.isEmpty())
            .mapToDouble(Double::parseDouble)
            .average();

    if (nums.isPresent()) {
      System.out.printf("%.2f", nums.getAsDouble());
    } else {
      System.out.println("No match");
    }
  }
}

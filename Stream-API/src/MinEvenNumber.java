import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalDouble;

public class MinEvenNumber {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    OptionalDouble input = Arrays.stream(reader.readLine()
            .split("\\s+"))
            .filter(x -> !x.isEmpty())
            .mapToDouble(Double::parseDouble)
            .filter(n -> n % 2 == 0)
            .min();

    if (input.isPresent()){
      System.out.println(input.getAsDouble());
    } else {
      System.out.println("No match");
    }
  }
}

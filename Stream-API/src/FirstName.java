import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstName {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    List<String> names = Arrays.stream(reader.readLine()
            .split("\\s+"))
            .sorted()
            .collect(Collectors.toList());

    List<String> letters = Arrays.stream(reader.readLine()
            .split("\\s+"))
            .collect(Collectors.toList());

    Optional<String> first = names.stream()
            .filter(x -> {
              for (String letter : letters) {
                if (String.valueOf(x.charAt(0)).equalsIgnoreCase(letter)) {
                  return true;
                }
              }

              return false;
            }).findFirst();

    System.out.println(first.isPresent() ? first.get() : "No match");
  }
}

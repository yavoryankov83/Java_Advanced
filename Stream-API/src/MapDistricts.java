import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapDistricts {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String[] input = reader.readLine().split("\\s+");
    int minPopulation = Integer.parseInt(reader.readLine());

    Map<String, ArrayList<Integer>> cities = new HashMap<>();

    for (String pairs : input) {
      String[] pair = pairs.split(":");

      String city = pair[0];
      Integer population = Integer.parseInt(pair[1]);

      if (!cities.containsKey(city)) {
        cities.put(city, new ArrayList<>());
      }

      cities.get(city).add(population);
    }

    cities.entrySet()
            .stream()
            .filter(kv -> kv.getValue().stream()
                    .reduce((x, y) -> x + y).get() > minPopulation)
            .sorted((kv1, kv2) -> {
              int kv1Sum = kv1.getValue().stream().reduce((x, y) -> x + y).get();
              int kv2Sum = kv2.getValue().stream().reduce((x, y) -> x + y).get();

              return Integer.compare(kv2Sum, kv1Sum);
            })
            .forEach(kv -> {
              System.out.print(kv.getKey() + ": ");
              kv.getValue().stream().sorted((x, y) -> Integer.compare(y, x))
                      .limit(5)
                      .forEach(p -> System.out.print(p + " "));
              System.out.println();
            });
  }
}

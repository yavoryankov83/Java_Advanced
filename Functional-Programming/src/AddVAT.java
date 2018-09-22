import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Function;

public class AddVAT {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    double[] values = Arrays.stream(reader.readLine()
            .split(", "))
            .mapToDouble(Double::parseDouble)
            .toArray();

    Function<double[], double[]> valuesWithVat = arr -> {
      double[] result = new double[arr.length];
      for (int i = 0; i < arr.length; i++) {
        result[i] = arr[i] * 1.2;
      }
      return result;
    };

    values = valuesWithVat.apply(values);

    System.out.println("Prices with VAT:");

    for (double value : values) {
      System.out.printf("%.2f%n", value);
    }
  }
}

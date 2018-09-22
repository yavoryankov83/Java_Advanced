import java.util.*;

public class AcademyGraduation {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Map<String, double[]> notebook = new TreeMap<>();

    int count = Integer.parseInt(scanner.nextLine());

    for (int i = 0; i < count; i++) {
      String name = scanner.nextLine();
      double[] grades = Arrays.stream(scanner.nextLine()
              .split(" "))
              .mapToDouble(Double::parseDouble)
              .toArray();

      notebook.put(name, grades);
    }

    for (Map.Entry<String, double[]> entry : notebook.entrySet()) {
      double sum = 0;
      for (double value : entry.getValue()) {
        sum += value;
      }
      double avg = sum / entry.getValue().length;

      System.out.printf("%s is graduated with %f%n", entry.getKey(), avg);
    }
  }
}

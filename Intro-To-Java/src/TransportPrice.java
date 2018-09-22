import java.util.Scanner;

public class TransportPrice {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int distance = Integer.parseInt(scanner.nextLine());
    String timeOfDay = scanner.nextLine();

    double price = 1;
    double tripPrice;

    if (distance >= 20 && distance < 100) {
      price = 0.09;
      tripPrice = distance * price;
    } else if (distance >= 100) {
      price = 0.06;
      tripPrice = distance * price;
    } else {
      if (timeOfDay.equals("day")) {
        price = 0.79;
        tripPrice = distance * price + 0.7;
      } else {
        price = 0.9;
        tripPrice = distance * price + 0.7;
      }
    }

    System.out.println(String.format("%.2f", tripPrice));
  }
}

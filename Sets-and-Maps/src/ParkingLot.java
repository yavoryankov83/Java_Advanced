import java.util.HashSet;
import java.util.Scanner;

public class ParkingLot {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String input = scanner.nextLine();

    HashSet<String> register = new HashSet<>();

    while (!(input = scanner.nextLine()).equals("END")) {
      String[] currDirAndCar = input.split(", ");

      String direction = currDirAndCar[0];
      String car = currDirAndCar[1];

      if (direction.equals("IN")) {
        register.add(car);
      } else {
        register.remove(car);
      }

      //optional variant
      //input = scanner.nextLine();
    }

    for (String car : register) {
      System.out.println(car);
    }
  }
}

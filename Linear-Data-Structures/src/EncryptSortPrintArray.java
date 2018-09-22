import java.util.*;
import java.util.stream.Collectors;

public class EncryptSortPrintArray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = Integer.parseInt(scanner.nextLine());

    List<Integer> nums = new ArrayList<>();

    List<Character> vowels = Arrays.asList('a', 'u', 'i', 'o', 'e');

    for (int i = 0; i < n; i++) {
      String name = scanner.nextLine();

      int sum = 0;

      for (int j = 0; j < name.length(); j++) {

        Character symbol = name.charAt(j);
        if (vowels.contains(Character.toLowerCase(symbol))) {
          sum += symbol * name.length();
        } else {
          sum += symbol / name.length();
        }
      }
      nums.add(sum);
    }

    Collections.sort(nums);

    for (Integer num : nums) {
      System.out.println(num);
    }
  }
}

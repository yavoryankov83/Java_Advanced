import java.util.*;
import java.util.stream.Collectors;

public class LinearStructures {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    List<String> names = new ArrayList<>();

    names.add("Pesho");
    names.add("Goshko");

    System.out.println(String.join(", ", names));

    List<String> result = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

    ArrayDeque<Integer> stack = new ArrayDeque<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);

    while (stack.size() > 0) {
      System.out.println(stack.pop());
    }

    ArrayDeque<Integer> queue = new ArrayDeque<>();
    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);

    while (queue.size() > 0) {
      System.out.println(queue.poll());
    }

    String[] nums = scanner.nextLine().split(" ");

    for (int i = 0; i < nums.length; i++) {


    }

    ArrayDeque<String> numbers = new ArrayDeque<>();

    Collections.addAll(numbers, nums);
    System.out.println(numbers.poll());
    System.out.println();

    while (numbers.size() > 0) {
      int first = Integer.parseInt(numbers.poll());
      String op = numbers.poll();
      int second = Integer.parseInt(numbers.poll());

      System.out.println();
    }
  }
}

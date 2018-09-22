import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculatorUsingStack {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //2 + 5 + 10 - 2 - 1
    String[] expression = scanner.nextLine().split(" ");

    ArrayDeque<String> stack = new ArrayDeque();

    for (int i = expression.length - 1; i >= 0; i--) {
      stack.push(expression[i]);
    }

    while (stack.size() > 1) {
      int num1 = Integer.parseInt(stack.pop());
      String sign = stack.pop();
      int num2 = Integer.parseInt(stack.pop());
      if (sign.equals("+")) {
        stack.push(Integer.toString(num1 + num2));
      } else {
        stack.push(Integer.toString(num1 - num2));
      }
    }
    System.out.println(stack.peek());
  }
}

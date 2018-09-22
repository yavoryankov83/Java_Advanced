import java.util.Scanner;

public class SumMatrixElements {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] line = scanner.nextLine().split(", ");

    //reading matrix
    int rows = Integer.parseInt(line[0]);
    int cols = Integer.parseInt(line[1]);

    int[][] matrix = new int[rows][cols];
    int sum = 0;

    //filling matrix
    for (int row = 0; row < matrix.length; row++) {
      String[] currline = scanner.nextLine().split(", ");
      for (int col = 0; col < matrix[row].length; col++) {
        matrix[row][col] = Integer.parseInt(currline[col]);

        sum += matrix[row][col];
      }
    }
    System.out.println(matrix.length);
    System.out.println(cols);
    System.out.println(sum);
  }
}

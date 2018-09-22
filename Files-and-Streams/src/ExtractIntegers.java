import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegers {
  public static void main(String[] args) {
    String folderPath = "/home/yavor/Java/Java Advanced - May 2018/4. Files-and-Streams-Lab-Resources/";
    String fileInputPath = folderPath + "input2.txt";
    String fileOutputPath = folderPath + "output2.txt";

    try (Scanner scanner = new Scanner(new FileInputStream(fileInputPath));
         PrintWriter writer = new PrintWriter(new FileOutputStream(fileOutputPath));
    ) {

      while (scanner.hasNext()) {
        if (scanner.hasNextInt()) {
          writer.println(scanner.nextInt());
        }

        scanner.next();
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
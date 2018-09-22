import java.io.*;

public class WriteEveryThirdLine {
  public static void main(String[] args) {
    String folderPath = "/home/yavor/Java/Java Advanced - May 2018/4. Files-and-Streams-Lab-Resources/";
    String fileInputPath = folderPath + "input3.txt";
    String fileOutputPath = folderPath + "output3.txt";

    try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileInputPath)));
         PrintWriter writer = new PrintWriter(new FileOutputStream(fileOutputPath))) {

      String line = reader.readLine();
      int counter = 1;

      while (line != null && !"".equals(line)) {
        if (counter % 3 == 0) {
          writer.println(line);
        }
        counter++;
        line = reader.readLine();

      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

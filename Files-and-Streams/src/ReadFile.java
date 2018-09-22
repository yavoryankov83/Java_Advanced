import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadFile {
  public static void main(String[] args) {
    String folderPath = "/home/yavor/Java/Java Advanced - May 2018/4. Files-and-Streams-Lab-Resources/";
    String filePath = folderPath + "input.txt";

    try (InputStream streamReader = new FileInputStream(filePath)) {

      int oneByte = streamReader.read();

      while (oneByte >= 0) {
        System.out.printf("%s ", Integer.toBinaryString(oneByte));
        oneByte = streamReader.read();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

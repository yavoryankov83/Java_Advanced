import java.io.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WriteToFile {
  public static void main(String[] args) {
    String folderPath = "/home/yavor/Java/Java Advanced - May 2018/4. Files-and-Streams-Lab-Resources/";
    String fileInputPath = folderPath + "input.txt";
    String fileOutputPath = folderPath + "output.txt";

    Set<Character> punctuation = new HashSet<>();
    Collections.addAll(punctuation, ',', '.', '!', '?');

    try (InputStream streamReader = new FileInputStream(fileInputPath);
         OutputStream streamWriter = new FileOutputStream(fileOutputPath)) {

      int oneByte = streamReader.read();

      while (oneByte >= 0) {
        if (!punctuation.contains((char) oneByte)) {
          streamWriter.write(oneByte);
        }

        oneByte = streamReader.read();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

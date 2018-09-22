import java.io.*;

public class CopyBites {
  public static void main(String[] args) {
    String folderPath = "/home/yavor/Java/Java Advanced - May 2018/4. Files-and-Streams-Lab-Resources/";
    String fileInputPath = folderPath + "input1.txt";
    String fileOutputPath = folderPath + "output1.txt";

    try (InputStream streamReader = new FileInputStream(fileInputPath);
         OutputStream streamWriter = new FileOutputStream(fileOutputPath)) {

      int oneByte = streamReader.read();

      int asciiCodeSpace = 32;
      int asciiCodeNewLine = 10;

      while (oneByte >= 0) {
        if (asciiCodeNewLine == oneByte || asciiCodeSpace == oneByte) {
          streamWriter.write(oneByte);
        } else {
          char[] character = String.valueOf(oneByte).toCharArray();

          for (char chars : character) {
            streamWriter.write(chars);
          }
        }

        oneByte = streamReader.read();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

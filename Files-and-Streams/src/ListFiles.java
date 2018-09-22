import java.io.File;

public class ListFiles {
  public static void main(String[] args) {
    String rootDirectoryPath = "/home/yavor/Java/Java Advanced - May 2018/4. Files-and-Streams-Lab-Resources/Files-and-Streams";

    File rootDir = new File(rootDirectoryPath);

    if (rootDir.exists()) {
      if (rootDir.isDirectory()) {

        File[] files = rootDir.listFiles();

        for (File file : files) {
          if (!file.isDirectory()) {
            System.out.printf("%s: [%s int bytes]%n", file.getName(), file.length());
          }
        }
      }
    }
  }
}

import java.io.File;
import java.util.ArrayDeque;

public class NestedFolders {
  public static void main(String[] args) {

    String rootDirectoryPath = "/home/yavor/Java/Java Advanced - May 2018/4. Files-and-Streams-Lab-Resources/Files-and-Streams";

    File rootDir = new File(rootDirectoryPath);

    ArrayDeque<File> queue = new ArrayDeque<>();
    queue.add(rootDir);

    if (rootDir.exists()) {
      if (rootDir.isDirectory()) {

        System.out.println(rootDir.getName());

        int counter = 1;

        while (!queue.isEmpty()) {
          File currDir = queue.remove();

          File[] currFiles = currDir.listFiles();

          for (File file : currFiles) {
            if (file.isDirectory()) {
              counter++;
              queue.add(file);
              System.out.printf("%s%n", file.getName());
            }
          }
        }
        System.out.printf("[%d] folder count", counter);
      }
    }
  }
}

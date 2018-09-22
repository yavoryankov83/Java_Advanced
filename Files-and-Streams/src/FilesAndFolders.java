import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesAndFolders {
  public static void main(String[] args) {

    Path inputPath = Paths.get("/home/yavor/Java/Java Advanced - May 2018/4. Files-and-Streams-Lab-Resources/input4.txt");
    Path outputPath = Paths.get("/home/yavor/Java/Java Advanced - May 2018/4. Files-and-Streams-Lab-Resources/output4.txt");

    try (BufferedReader reader = Files.newBufferedReader(inputPath)) {
      List<String> lines = Files.readAllLines(inputPath);

      Files.write(outputPath, lines);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class SortLines {
  public static void main(String[] args) {
    Path inputPath = Paths.get("/home/yavor/Java/Java Advanced - May 2018/4. Files-and-Streams-Lab-Resources/input5.txt");
    Path outputPath = Paths.get("/home/yavor/Java/Java Advanced - May 2018/4. Files-and-Streams-Lab-Resources/output5.txt");

    try {
      List<String> lines = Files.readAllLines(inputPath);
      Collections.sort(lines);

      Files.write(outputPath, lines);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

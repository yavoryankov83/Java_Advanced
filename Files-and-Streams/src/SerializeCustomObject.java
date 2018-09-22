import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeCustomObject {
  public static void main(String[] args) {

    String serializableObjectPath = "/home/yavor/Java/Java Advanced - May 2018/" +
            "4. Files-and-Streams-Lab-Resources/object.ser";

    FootballPlayer player = new FootballPlayer("Ivan", 25, "barca", 11454.54);

    try (FileOutputStream writer = new FileOutputStream(serializableObjectPath);
         ObjectOutputStream objWriter = new ObjectOutputStream(writer)) {
      objWriter.writeObject(player);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

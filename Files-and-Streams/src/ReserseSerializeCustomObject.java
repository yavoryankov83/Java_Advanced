import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReserseSerializeCustomObject {
  public static void main(String[] args) {
    String serializableObjectPath = "/home/yavor/Java/Java Advanced - May 2018/" +
            "4. Files-and-Streams-Lab-Resources/object.ser";

    FootballPlayer player = new FootballPlayer("Ivan", 25, "barca", 11454.54);

    try (FileInputStream reader = new FileInputStream(serializableObjectPath);
         ObjectInputStream objReader = new ObjectInputStream(reader)) {

      FootballPlayer palyer = (FootballPlayer) objReader.readObject();

      System.out.println(player);
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}

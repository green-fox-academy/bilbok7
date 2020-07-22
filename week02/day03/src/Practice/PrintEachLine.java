package Practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {
  public static void main(String[] args) {

  }

  public static void printFile() {
    try {
      Path filePath = Paths.get("newfile.txt");
      List<String> lines = Files.readAllLines(filePath);
      for (String line : lines) {
        System.out.println(line);
      }

    } catch (IOException e) {
      System.out.println("Unable to read");


    }
  }
}

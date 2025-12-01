import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;

public class ReadFileExample {
    public static void main(String[] args) {
        Path path = Paths.get("example.txt");

        try (Stream<String> lines = Files.lines(path)) {
            lines.filter(line -> !line.isEmpty())
                 .map(String::toUpperCase)
                 .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

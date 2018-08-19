package lesson18;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Created by Zhenya on 18.08.2018.
 */
public final class InputOutput {

    private InputOutput() {
    }

    public static List<String> input(Path path) {
        List<String> list = null;
        try {
            list = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void writeToFile(List<String> values, Path path) {
        try (Writer writer = new FileWriter(path.toFile())) {
            for (String value : values) {
                writer.write(value);
                writer.write(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
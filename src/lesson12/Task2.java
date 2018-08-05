package lesson12;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Zhenya on 05.08.2018.
 */
public class Task2 {

    public static void main(String[] args) {
        int[] randomArray = getTenRandomInts();
        Path path = Paths.get("src", "lesson12", "random.txt");

        writeToFile(randomArray, path);

        for (int s : sortByValue(path)) {
            System.out.println(s);
        }
    }

    private static int[] getTenRandomInts() {
        int[] array = new int[10];
        final Random random = new Random();
        for (int i = 0; i < array.length; ++i) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    private static void writeToFile(int[] values, Path path) {
        try (Writer writer = new FileWriter(path.toFile())) {
            for (int value : values) {
                String intToString = Integer.toString(value);
                writer.write(intToString);
                writer.write(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int[] sortByValue(Path path) {
        int[] result = new int[0];

        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(path.toFile()))) {
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes);
            String textOfClass = new String(bytes);
            String[] str = textOfClass.trim().split("[,.!?:;\\s]+");
            result = new int[str.length];

            for (int i = 0; i < result.length; i++) {
                result[i] = Integer.parseInt(str[i]);
            }

            Arrays.sort(result);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}


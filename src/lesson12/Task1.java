package lesson12;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zhenya on 05.08.2018.
 */
public class Task1 {

    public static void main(String[] args) {
        Path path = Paths.get("src", "lesson12", "test.txt");
        System.out.println(letterCounter(path));
    }

    private static Map<Character, Integer> letterCounter(Path path) {
        char[] arrayChar = {' '};
        Map<Character, Integer> characterIntegerMap = new HashMap<>();

        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(path.toFile()))) {
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes);
            String textOfFile = new String(bytes);
            arrayChar = textOfFile.toLowerCase().replaceAll("[^а-я^]", "").toCharArray();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (char anI : arrayChar) {
            if (characterIntegerMap.containsKey(anI)) {
                characterIntegerMap.put(anI, characterIntegerMap.get(anI) + 1);
            } else characterIntegerMap.put(anI, 1);
        }
        return characterIntegerMap;
    }
}
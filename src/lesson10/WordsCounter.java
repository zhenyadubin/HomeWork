package lesson10;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Zhenya on 03.08.2018.
 */
public final class WordsCounter {

    private WordsCounter() {
    }

    private static String[] textToString(String text) {
        return text.trim().split("[,.!?:;\\s]+");
    }

    public static Map<String, Integer> allWordsInTextMap(String text) {

        String[] textToStringArray = textToString(text);
        Map<String, Integer> wordsAndTheirNumber = new LinkedHashMap<>();

        for (String arr : textToStringArray) {
            if (wordsAndTheirNumber.containsKey(arr)) {
                wordsAndTheirNumber.put(arr, wordsAndTheirNumber.get(arr) + 1);
            } else {
                wordsAndTheirNumber.put(arr, 1);
            }
        }
        return wordsAndTheirNumber;
    }
}

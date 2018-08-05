package lesson10;

/**
 * Created by Zhenya on 31.07.2018.
 */
public class Task1 {

    public static void main(String[] args) {
        String text = " London, Paris, Moscow, Minsk, minsk, Vitebsk, Porto, York, Paris, london, Moscow, Minsk, Vitebsk ";

        System.out.println(WordsCounter.allWordsInTextMap(text).toString());
    }
}

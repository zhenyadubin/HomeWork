package lesson5;

/**
 * Created by Zhenya on 21.07.2018.
 */
public class Task1 {

    public static void main(String[] args) {
        String word = "GetTeg";
        System.out.println(isPolindrom(word));
    }

    public static boolean isPolindrom(String word) {
        int counter = 0;
        word = word.toLowerCase();
        for (int i = 0, j = word.length() - 1; i < word.length(); i++, j--) {
            if (word.charAt(i) != word.charAt(j)) {
                counter++;
            }
        }
        return (counter == 0);
    }
}

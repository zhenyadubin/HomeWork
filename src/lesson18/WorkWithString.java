package lesson18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Zhenya on 19.08.2018.
 */
public final class WorkWithString {

    private static final int MINUTES_IN_HOUR = 60;

    private WorkWithString() {
    }

    public static String onlyTime(String value) {
        String time = null;
        Pattern pattern = Pattern.compile("\\d{2}:\\d{2}");
        Matcher matcher = pattern.matcher(value);
        while (matcher.find()) {
            time = matcher.group();
        }
        return time;
    }

    public static String onlyAction(String value) {
        String action = "";
        Pattern pattern = Pattern.compile("[а-яА-Я]+[^(Конец)]");
        Matcher matcher = pattern.matcher(value);
        while (matcher.find()) {
            action += matcher.group();
        }
        return action;
    }

    public static String onlyActionWithEnd(String value) {
        String action = "";
        Pattern pattern = Pattern.compile("[а-яА-Я]+");
        Matcher matcher = pattern.matcher(value);
        while (matcher.find()) {
            action += matcher.group();
        }
        return action;
    }

    public static int timeToInt(String value) {
        String hourString = null;
        String minutesString = null;
        Pattern pattern = Pattern.compile("(\\d{2}):(\\d{2})");
        Matcher matcher = pattern.matcher(value);
        while (matcher.find()) {
            hourString = matcher.group(1);
            minutesString = matcher.group(2);
        }
        int hourInt = (Integer.parseInt(hourString)) * MINUTES_IN_HOUR;
        int minutesInt = Integer.parseInt(minutesString);
        return hourInt + minutesInt;
    }
}
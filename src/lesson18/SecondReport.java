package lesson18;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Zhenya on 18.08.2018.
 */
public class SecondReport {

    private Path pathForRead;
    private Path pathForWrite;
    private static final String EXERCISES = "Упражнения";
    private static final String BREAK = "Перерыв";
    private static final String DINNER = "Обеденный перерыв";
    private static final String SOLUTIONS = "Решения";
    private static final String END_OF_THE_DAY = "Конец";

    public SecondReport(Path pathForRead, Path pathForWrite) {
        this.pathForRead = pathForRead;
        this.pathForWrite = pathForWrite;
    }

    private List<Integer> getDurationInMinutes() {
        List<String> text = InputOutput.input(pathForRead);
        List<String> time = new ArrayList<>();
        for (String aText : text) {
            time.add(WorkWithString.onlyTime(aText));
        }
        List<Integer> timeInMinutes = new ArrayList<>();
        for (String aTime : time) {
            if (aTime != null) {
                timeInMinutes.add(WorkWithString.timeToInt(aTime));
            }
        }
        List<Integer> durationInMinutes = new ArrayList<>();
        for (int i = 0; i < timeInMinutes.size() - 1; i++) {
            int duration = (timeInMinutes.get(i + 1)) - (timeInMinutes.get(i));
            if (duration > 0) {
                durationInMinutes.add(duration);
            }
        }
        return durationInMinutes;
    }

    private List<String> getActionWithEnd() {
        List<String> text = InputOutput.input(pathForRead);
        List<String> action = new ArrayList<>();
        for (String aText : text) {
            if (!Objects.equals(WorkWithString.onlyActionWithEnd(aText), "")) {
                action.add(WorkWithString.onlyActionWithEnd(aText));
            }
        }
        return action;
    }

    private List<Integer> getActivities(List<String> action) {
        List<Integer> activities = new ArrayList<>();
        int count = 0;
        for (String act : action) {
            count++;
            if (Objects.equals(act, END_OF_THE_DAY)) {
                activities.add(count - 1);
                count = 0;
            }
        }
        return activities;
    }

    private List<String> getAction() {
        List<String> text = InputOutput.input(pathForRead);
        List<String> action = new ArrayList<>();
        for (String aText : text) {
            if (!Objects.equals(WorkWithString.onlyAction(aText), "")) {
                action.add(WorkWithString.onlyAction(aText));
            }
        }
        return action;
    }

    private List<Integer> getLessonInPercent(List<Integer> activities, List<Integer> durationInMinutes) {
        int allTimeInDay = 0;
        int countForAllTime = 0;
        int countForLessons = 0;
        List<Integer> lessonsInPercent = new ArrayList<>();
        for (Integer activity : activities) {
            for (int i = 0; i < activity; i++) {
                allTimeInDay += durationInMinutes.get(countForAllTime);
                countForAllTime++;
            }
            for (int i = 0; i < activity; i++) {
                lessonsInPercent.add(((durationInMinutes.get(countForLessons) * 100) / allTimeInDay));
                countForLessons++;
            }
            allTimeInDay = 0;
        }
        return lessonsInPercent;
    }

    private List<String> getReport() {
        List<Integer> activities = getActivities(getActionWithEnd());
        List<String> action = getAction();
        List<Integer> durationInMinutes = getDurationInMinutes();
        List<Integer> lessonsInPercent = getLessonInPercent(activities, durationInMinutes);
        int count = 0;
        int allLecturesTime = 0;
        int allLecturesPercent = 0;
        int allExercisesTime = 0;
        int allExercisesPercent = 0;
        int allBreakTime = 0;
        int allBreakPercent = 0;
        int allSolutionsTime = 0;
        int allSolutionsPercent = 0;
        List<String> reportList = new ArrayList<>();
        List<String> lecturesList = new ArrayList<>();
        for (Integer activity : activities) {
            for (int i = 0; i < activity; i++) {
                if (!Objects.equals(action.get(count), EXERCISES) && !Objects.equals(action.get(count), BREAK)
                        && !Objects.equals(action.get(count), SOLUTIONS) && !Objects.equals(action.get(count), DINNER)) {
                    allLecturesTime += durationInMinutes.get(count);
                    allLecturesPercent += lessonsInPercent.get(count);
                    lecturesList.add(action.get(count) + ": " + durationInMinutes.get(count) + " минут "
                            + lessonsInPercent.get(count) + "%");
                } else if (Objects.equals(action.get(count), EXERCISES)) {
                    allExercisesTime += durationInMinutes.get(count);
                    allExercisesPercent += lessonsInPercent.get(count);
                } else if (Objects.equals(action.get(count), BREAK) || Objects.equals(action.get(count), DINNER)) {
                    allBreakTime += durationInMinutes.get(count);
                    allBreakPercent += lessonsInPercent.get(count);
                } else if (Objects.equals(action.get(count), SOLUTIONS)) {
                    allSolutionsTime += durationInMinutes.get(count);
                    allSolutionsPercent += lessonsInPercent.get(count);
                }
                count++;
            }
            reportList.add("Лекции: " + allLecturesTime + " минут " + allLecturesPercent + "%");
            reportList.add("Упражнения: " + allExercisesTime + " минут " + allExercisesPercent + "%");
            reportList.add("Перерывы: " + allBreakTime + " минут " + allBreakPercent + "%");
            reportList.add("Решения: " + allSolutionsTime + " минут " + allSolutionsPercent + "%");
            reportList.add("в т.ч. Лекции: ");
            reportList.addAll(lecturesList);
            reportList.add("");
            lecturesList.clear();
            allLecturesPercent = 0;
            allLecturesTime = 0;
            allExercisesTime = 0;
            allExercisesPercent = 0;
            allBreakTime = 0;
            allBreakPercent = 0;
            allSolutionsPercent = 0;
            allSolutionsTime = 0;
        }
        return reportList;
    }

    public void createReport() {
        InputOutput.writeToFile(getReport(), pathForWrite);
        System.out.println("Второй отчёт составлен");
    }
}
package lesson18;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Zhenya on 18.08.2018.
 */
public class FirstReport {

    private Path pathForRead;
    private Path pathForWrite;

    public FirstReport(Path pathForRead, Path pathForWrite) {
        this.pathForRead = pathForRead;
        this.pathForWrite = pathForWrite;
    }

    private List<String> getReport() {
        List<String> text = InputOutput.input(pathForRead);
        List<String> time = new ArrayList<>();
        List<String> action = new ArrayList<>();
        for (String aText : text) {
            time.add(WorkWithString.onlyTime(aText));
            action.add(WorkWithString.onlyAction(aText));
        }
        List<String> durationOfTime = new ArrayList<>();
        for (int i = 0; i < time.size() - 1; i++) {
            durationOfTime.add(i, time.get(i) + "-" + time.get(i + 1));
        }
        List<String> durationOfTimeAndAction = new ArrayList<>();
        for (int i = 0; i < durationOfTime.size(); i++) {
            if (!Objects.equals(action.get(i), "")) {
                durationOfTimeAndAction.add(durationOfTime.get(i) + "  " + action.get(i));
            } else {
                durationOfTimeAndAction.add("");
            }
        }
        return durationOfTimeAndAction;
    }

    public void createReport() {
        InputOutput.writeToFile(getReport(), pathForWrite);
        System.out.println("Первый отчёт составлен");
    }
}
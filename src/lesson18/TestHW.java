package lesson18;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Zhenya on 17.08.2018.
 */
public class TestHW {

    public static void main(String[] args) {
        Path pathForRead = Paths.get("src", "lesson18", "schedule.txt");
        Path pathForWriteFirstReport = Paths.get("src", "lesson18", "FirstReport.txt");
        Path pathForWriteSecondReport = Paths.get("src", "lesson18", "SecondReport.txt");

        FirstReport firstReport = new FirstReport(pathForRead, pathForWriteFirstReport);
        firstReport.createReport();

        SecondReport secondReport = new SecondReport(pathForRead, pathForWriteSecondReport);
        secondReport.createReport();
    }
}
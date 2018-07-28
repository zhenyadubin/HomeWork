package lesson9;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhenya on 28.07.2018.
 */
public class Task1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("this");
        list.add("is");
        list.add("lots");
        list.add("of");
        list.add("fun");
        list.add("for");
        list.add("every");
        list.add("Java");
        list.add("programmer");

        print(list);
        print(markLength4(list));
    }

    private static void print(List<String> list) {
        for (String aList : list) {
            System.out.print(aList + " ");
        }
        System.out.println();
    }

    private static List<String> markLength4(List<String> list) {
        List<String> listCopy = list;

        for (int i = 0; i < listCopy.size(); i++) {
            if (listCopy.get(i).length() == 4) {
                listCopy.add(i, "****");
                i++;
            }
        }
        return listCopy;
    }
}

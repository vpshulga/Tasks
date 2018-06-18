package by.vpshulga.lesson14;

import by.vpshulga.lesson14.utils.FileUtils;

import java.io.File;
import java.util.ArrayList;

class Task03 {

    static void printWords() {
        File file = new File("src" + File.separator + "by" + File.separator
                + "vpshulga" + File.separator + "lesson14" + File.separator + "Task01_buf.txt");
        ArrayList<String> list = FileUtils.addStringsFromFileToList(file);
        ArrayList<String> wordsList = new ArrayList<>();

        for (String s : list) {
            if (s != null && !s.equals("")) {
                String[] words = s.split(" +");
                for (String word : words) {
                    wordsList.add(word.trim());
                }
            }
        }

        for (int i = 0; i < wordsList.size() - 1; i++) {
            if (wordsList.get(i).charAt(wordsList.get(i).length() - 1) == wordsList.get(i + 1).charAt(0)) {
                System.out.print(wordsList.get(i) + " ");
            }
        }
        System.out.println("");
    }
}

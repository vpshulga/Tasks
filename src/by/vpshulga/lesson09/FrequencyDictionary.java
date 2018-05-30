package by.vpshulga.lesson09;

import java.util.*;

class FrequencyDictionary {
    private String text;

    FrequencyDictionary(String text) {
        this.text = text;
    }

    private String getText() {
        return text;
    }

    void printFrequency() {
        List<String> list = new ArrayList<>();
        String[] words = getText().split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll(",", "");
            words[i] = words[i].replaceAll("\\.", "");
            words[i] = words[i].replaceAll("\\?", "");
            words[i] = words[i].replaceAll("!", "");
            list.add(words[i]);
        }

        for (String word : words) {
            System.out.println(word + " : " + Collections.frequency(list, word));
        }
    }
}

package me.sakigamiyang.exercise.text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CountWordsInAString {
    static int count(String s) {
        Matcher m = Pattern.compile("\\w+").matcher(s);
        int num = 0;
        while (m.find()) {
            ++num;
        }
        return num;
    }
}

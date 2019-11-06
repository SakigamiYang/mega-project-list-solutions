package me.sakigamiyang.exercise.text;

import java.util.Arrays;

class CountVowels {
    static int[] count(String s) {
        int[] result = new int[5];
        Arrays.fill(result, 0);
        for (char c : s.toLowerCase().toCharArray()) {
            switch (c) {
                case 'a':
                    result[0] += 1;
                    break;
                case 'e':
                    result[1] += 1;
                    break;
                case 'i':
                    result[2] += 1;
                    break;
                case 'o':
                    result[3] += 1;
                    break;
                case 'u':
                    result[4] += 1;
                    break;
                default:
                    break;
            }
        }
        return result;
    }
}

package me.sakigamiyang.exercise.text;

class PigLatin {
    static String convertToPigLatin(String s) {
        if (s.length() == 0) {
            return "";
        }

        return s.substring(1) + "-" + s.substring(0, 1) + "ay";
    }
}

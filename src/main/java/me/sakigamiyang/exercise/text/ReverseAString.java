package me.sakigamiyang.exercise.text;

class ReverseAString {
    static String reverse(String s) {
        char[] arr = s.toCharArray();
        int arrLen = arr.length;
        for (int i = 0; i < arrLen / 2; ++i) {
            char temp = arr[i];
            arr[i] = arr[arrLen - 1 - i];
            arr[arrLen - 1 - i] = temp;
        }
        return new String(arr);
    }
}

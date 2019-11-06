package me.sakigamiyang.exercise.text;

class CheckIfPalindrome {
    static boolean check(String s) {
        char[] arr = s.toCharArray();
        int arrLen = arr.length;
        for (int i = 0; i < arrLen / 2; ++i) {
            if (arr[i] != arr[arrLen - i - 1]) {
                return false;
            }
        }

        return true;
    }
}

package me.sakigamiyang.exercise.text;

import java.util.Collections;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

class Ciphers {
    private static final String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static int alphabetsLength = alphabets.length();
    private static final IntPredicate illegalChar = c -> alphabets.indexOf(c) == -1;

    private static char transformCeasar(char c, int n, boolean encrypt) {
        int flag = encrypt ? 1 : -1;
        int index = (alphabets.indexOf(c) + flag * n + alphabetsLength) % alphabetsLength;
        return alphabets.charAt(index);
    }

    static String encryptCeasar(String s, int privateKey) {
        return s.chars()
                .map(c -> illegalChar.test(c) ? (char) c : transformCeasar((char) c, privateKey, true))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    static String descryptCeasar(String s, int privateKey) {
        return s.chars()
                .map(c -> illegalChar.test(c) ? (char) c : transformCeasar((char) c, privateKey, false))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    private static char transformVernam(char c1, char c2, boolean encrypt) {
        int flag = encrypt ? 1 : -1;
        int index = (alphabets.indexOf(c1) + flag * alphabets.indexOf(c2) + alphabetsLength) % alphabetsLength;
        return alphabets.charAt(index);
    }

    static String encryptVernam(String s, String privateKey) {
        if (s.length() != privateKey.length()) {
            throw new IllegalArgumentException("s and privateKey must have the same length.");
        }

        char[] sChars = s.toCharArray();
        char[] privateKeyChars = privateKey.toCharArray();

        return IntStream.range(0, s.length())
                .map(i -> {
                    char c1 = sChars[i];
                    char c2 = privateKeyChars[i];
                    return illegalChar.test(c1) || illegalChar.test(c2) ? c1 : transformVernam(c1, c2, true);
                })
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    static String descryptVernam(String s, String privateKey) {
        if (s.length() != privateKey.length()) {
            throw new IllegalArgumentException("s and privateKey must have the same length.");
        }

        char[] sChars = s.toCharArray();
        char[] privateKeyChars = privateKey.toCharArray();

        return IntStream.range(0, s.length())
                .map(i -> {
                    char c1 = sChars[i];
                    char c2 = privateKeyChars[i];
                    return illegalChar.test(c1) || illegalChar.test(c2) ? c1 : transformVernam(c1, c2, false);
                })
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    static String encryptVigenere(String s, String privateKey) {
        int sLength = s.length();
        int privateKeyLength = privateKey.length();

        if (privateKeyLength == 0) {
            throw new IllegalArgumentException("The length of privateKey must greater than 0.");
        }

        if (sLength == 0) {
            return "";
        }

        String key = String.join("", Collections.nCopies((int) Math.ceil(sLength / privateKeyLength) + 1, privateKey));
        key = key.substring(0, sLength);

        return encryptVernam(s, key);
    }

    static String descryptVigenere(String s, String privateKey) {
        int sLength = s.length();
        int privateKeyLength = privateKey.length();

        if (privateKeyLength == 0) {
            throw new IllegalArgumentException("The length of privateKey must greater than 0.");
        }

        if (sLength == 0) {
            return "";
        }

        String key = String.join("", Collections.nCopies((int) Math.ceil(sLength / privateKeyLength) + 1, privateKey));
        key = key.substring(0, sLength);

        return descryptVernam(s, key);
    }
}

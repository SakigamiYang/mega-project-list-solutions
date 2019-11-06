package me.sakigamiyang.exercise.text;

import org.junit.Assert;
import org.junit.Test;

public class CountVowelsTest {
    @Test
    public void testCount() {
        Assert.assertArrayEquals(new int[]{0, 0, 0, 0, 0}, CountVowels.count(""));
        Assert.assertArrayEquals(new int[]{1, 0, 0, 0, 0}, CountVowels.count("a"));
        Assert.assertArrayEquals(new int[]{0, 1, 0, 0, 0}, CountVowels.count("e"));
        Assert.assertArrayEquals(new int[]{0, 0, 1, 0, 0}, CountVowels.count("i"));
        Assert.assertArrayEquals(new int[]{0, 0, 0, 1, 0}, CountVowels.count("o"));
        Assert.assertArrayEquals(new int[]{0, 0, 0, 0, 1}, CountVowels.count("u"));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, CountVowels.count("axeexiiixooooxuuuuu"));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, CountVowels.count("AXEEXIIIXOOOOXUUUUU"));
        Assert.assertArrayEquals(new int[]{6, 4, 2, 1, 2}, CountVowels.count("I am a student, and I have a wonderful dream."));
    }
}

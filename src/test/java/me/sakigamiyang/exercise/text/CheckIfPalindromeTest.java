package me.sakigamiyang.exercise.text;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfPalindromeTest {
    @Test
    public void testCheck() {
        Assert.assertTrue(CheckIfPalindrome.check(""));
        Assert.assertTrue(CheckIfPalindrome.check("a"));
        Assert.assertTrue(CheckIfPalindrome.check("bb"));
        Assert.assertFalse(CheckIfPalindrome.check("cd"));
        Assert.assertTrue(CheckIfPalindrome.check("aba"));
        Assert.assertFalse(CheckIfPalindrome.check("uab"));
        Assert.assertTrue(CheckIfPalindrome.check("racecar"));
        Assert.assertTrue(CheckIfPalindrome.check("racdcar"));
        Assert.assertFalse(CheckIfPalindrome.check("racedar"));
        Assert.assertFalse(CheckIfPalindrome.check("racecbr"));
        Assert.assertFalse(CheckIfPalindrome.check("racecas"));
    }
}

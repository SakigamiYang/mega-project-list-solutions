package me.sakigamiyang.exercise.text;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfPalindromeTest {
    @Test
    public void testGetFizzBuzz() {
        Assert.assertEquals(true, CheckIfPalindrome.check(""));
        Assert.assertEquals(true, CheckIfPalindrome.check("a"));
        Assert.assertEquals(true, CheckIfPalindrome.check("bb"));
        Assert.assertEquals(false, CheckIfPalindrome.check("cd"));
        Assert.assertEquals(true, CheckIfPalindrome.check("aba"));
        Assert.assertEquals(false, CheckIfPalindrome.check("uab"));
        Assert.assertEquals(true, CheckIfPalindrome.check("racecar"));
        Assert.assertEquals(true, CheckIfPalindrome.check("racdcar"));
        Assert.assertEquals(false, CheckIfPalindrome.check("racedar"));
        Assert.assertEquals(false, CheckIfPalindrome.check("racecbr"));
        Assert.assertEquals(false, CheckIfPalindrome.check("racecas"));
    }
}

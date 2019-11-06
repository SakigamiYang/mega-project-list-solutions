package me.sakigamiyang.exercise.text;

import org.junit.Assert;
import org.junit.Test;

public class CountWordsInAStringTest {
    @Test
    public void testGetFizzBuzz() {
        Assert.assertEquals(0, CountWordsInAString.count(""));
        Assert.assertEquals(1, CountWordsInAString.count("word"));
        Assert.assertEquals(2, CountWordsInAString.count("word1 word2"));
        Assert.assertEquals(3, CountWordsInAString.count("word1 word2 word3"));
        Assert.assertEquals(16, CountWordsInAString.count("I have a dream, to find some job which can give me a LOT of money."));
    }
}

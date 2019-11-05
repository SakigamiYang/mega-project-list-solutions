package me.sakigamiyang.exercise.text;

import org.junit.Assert;
import org.junit.Test;

public class PigLatinTest {
    @Test
    public void testGetFizzBuzz() {
        Assert.assertEquals("", PigLatin.convertToPigLatin(""));
        Assert.assertEquals("-aay", PigLatin.convertToPigLatin("a"));
        Assert.assertEquals("a-bay", PigLatin.convertToPigLatin("ba"));
        Assert.assertEquals("ba-cay", PigLatin.convertToPigLatin("cba"));
    }
}

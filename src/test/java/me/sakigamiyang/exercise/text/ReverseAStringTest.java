package me.sakigamiyang.exercise.text;

import org.junit.Assert;
import org.junit.Test;

public class ReverseAStringTest {
    @Test
    public void testGetFizzBuzz() {
        Assert.assertEquals("", ReverseAString.reverse(""));
        Assert.assertEquals("a", ReverseAString.reverse("a"));
        Assert.assertEquals("ab", ReverseAString.reverse("ba"));
        Assert.assertEquals("abc", ReverseAString.reverse("cba"));
        Assert.assertEquals("abcd", ReverseAString.reverse("dcba"));
        Assert.assertEquals("a2r8e9bvu4bcd", ReverseAString.reverse("dcb4uvb9e8r2a"));
    }
}

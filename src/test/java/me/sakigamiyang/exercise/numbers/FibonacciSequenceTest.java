/*
 * MIT License
 *
 * Copyright (c) 2019 Zhixiao Yang
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package me.sakigamiyang.exercise.numbers;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciSequenceTest {
    @Test
    public void testGenerateUntil() {
        Assert.assertArrayEquals(new Object[]{1, 1}, FibonacciSequence.generateUntil(1).toArray());
        Assert.assertArrayEquals(new Object[]{1, 1, 2}, FibonacciSequence.generateUntil(2).toArray());
        Assert.assertArrayEquals(new Object[]{1, 1, 2, 3, 5, 8}, FibonacciSequence.generateUntil(10).toArray());
    }

    @Test
    public void testGenerateN() {
        Assert.assertArrayEquals(new Object[]{1, 1}, FibonacciSequence.generateN(2).toArray());
        Assert.assertArrayEquals(new Object[]{1, 1, 2}, FibonacciSequence.generateN(3).toArray());
        Assert.assertArrayEquals(new Object[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55}, FibonacciSequence.generateN(10).toArray());
    }
}

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

package me.sakigamiyang.exercise.classalgorithm;

import org.junit.Assert;
import org.junit.Test;

public class SieveOfEratosthenesTest {
    @Test
    public void testGetPrimes() {
        Assert.assertArrayEquals(new int[]{}, SieveOfEratosthenes.getPrimes(0));
        Assert.assertArrayEquals(new int[]{}, SieveOfEratosthenes.getPrimes(1));
        Assert.assertArrayEquals(new int[]{2}, SieveOfEratosthenes.getPrimes(2));
        Assert.assertArrayEquals(new int[]{2, 3}, SieveOfEratosthenes.getPrimes(3));
        Assert.assertArrayEquals(new int[]{2, 3}, SieveOfEratosthenes.getPrimes(4));
        Assert.assertArrayEquals(new int[]{2, 3, 5}, SieveOfEratosthenes.getPrimes(5));
        Assert.assertArrayEquals(new int[]{2, 3, 5}, SieveOfEratosthenes.getPrimes(6));
        Assert.assertArrayEquals(new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29}, SieveOfEratosthenes.getPrimes(30));
    }
}

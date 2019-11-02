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
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;

public class SortingTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testMergeSortWithIllegalArgumentException() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("arr can not be null.");
        Sorting.mergeSort(null);
    }

    @Test
    public void testMergeSort() {
        int[] source, target;

        source = new int[]{};
        target = Arrays.copyOf(source, source.length);
        Arrays.sort(source);
        Sorting.mergeSort(target);
        Assert.assertArrayEquals(source, target);

        source = new int[]{1};
        target = Arrays.copyOf(source, source.length);
        Arrays.sort(source);
        Sorting.mergeSort(target);
        Assert.assertArrayEquals(source, target);

        source = new int[]{3, 3};
        target = Arrays.copyOf(source, source.length);
        Arrays.sort(source);
        Sorting.mergeSort(target);
        Assert.assertArrayEquals(source, target);

        source = new int[]{5, 3};
        target = Arrays.copyOf(source, source.length);
        Arrays.sort(source);
        Sorting.mergeSort(target);
        Assert.assertArrayEquals(source, target);

        source = new int[]{1, 2, 3, 4, 5};
        target = Arrays.copyOf(source, source.length);
        Arrays.sort(source);
        Sorting.mergeSort(target);
        Assert.assertArrayEquals(source, target);

        source = new int[]{5, 4, 3, 2, 1};
        target = Arrays.copyOf(source, source.length);
        Arrays.sort(source);
        Sorting.mergeSort(target);
        Assert.assertArrayEquals(source, target);

        source = new int[]{5, 1, 4, 2, 3};
        target = Arrays.copyOf(source, source.length);
        Arrays.sort(source);
        Sorting.mergeSort(target);
        Assert.assertArrayEquals(source, target);
    }

    @Test
    public void testBubbleSortWithIllegalArgumentException() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("arr can not be null.");
        Sorting.bubbleSort(null);
    }

    @Test
    public void testBubbleSort() {
        int[] source, target;

        source = new int[]{};
        target = Arrays.copyOf(source, source.length);
        Arrays.sort(source);
        Sorting.bubbleSort(target);
        Assert.assertArrayEquals(source, target);

        source = new int[]{1};
        target = Arrays.copyOf(source, source.length);
        Arrays.sort(source);
        Sorting.bubbleSort(target);
        Assert.assertArrayEquals(source, target);

        source = new int[]{3, 3};
        target = Arrays.copyOf(source, source.length);
        Arrays.sort(source);
        Sorting.bubbleSort(target);
        Assert.assertArrayEquals(source, target);

        source = new int[]{5, 3};
        target = Arrays.copyOf(source, source.length);
        Arrays.sort(source);
        Sorting.bubbleSort(target);
        Assert.assertArrayEquals(source, target);

        source = new int[]{1, 2, 3, 4, 5};
        target = Arrays.copyOf(source, source.length);
        Arrays.sort(source);
        Sorting.bubbleSort(target);
        Assert.assertArrayEquals(source, target);

        source = new int[]{5, 4, 3, 2, 1};
        target = Arrays.copyOf(source, source.length);
        Arrays.sort(source);
        Sorting.bubbleSort(target);
        Assert.assertArrayEquals(source, target);

        source = new int[]{5, 1, 4, 2, 3};
        target = Arrays.copyOf(source, source.length);
        Arrays.sort(source);
        Sorting.bubbleSort(target);
        Assert.assertArrayEquals(source, target);
    }
}

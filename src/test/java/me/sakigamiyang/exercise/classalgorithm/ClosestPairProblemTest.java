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

public class ClosestPairProblemTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testGetClosestPairWithIllegalArgumentException01() throws IllegalArgumentException {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("points can not be null.");
        ClosestPairProblem.getClosestPair(null);
    }

    @Test
    public void testGetClosestPairWithIllegalArgumentException02() throws IllegalArgumentException {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("points must contain at least 2 items.");
        ClosestPairProblem.getClosestPair(new Point[]{});
    }

    @Test
    public void testGetClosestPairWithIllegalArgumentException03() throws IllegalArgumentException {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("points must contain at least 2 items.");
        ClosestPairProblem.getClosestPair(new Point[]{new Point(1, 1)});
    }

    @Test
    public void testGetClosestPair() {
        Point[] points;
        points = new Point[]{new Point(1, 1), new Point(2.3, -2.5)};
        Assert.assertArrayEquals(new Point[]{points[0], points[1]}, ClosestPairProblem.getClosestPair(points));

        points = new Point[]{new Point(1, 1), new Point(-1, -1), new Point(-1, 1), new Point(1, -1)};
        Assert.assertArrayEquals(new Point[]{points[0], points[2]}, ClosestPairProblem.getClosestPair(points));

        points = new Point[]{new Point(0.3, 0.4), new Point(-6.5, -0.1), new Point(-1.7, 2.8)};
        Assert.assertArrayEquals(new Point[]{points[0], points[2]}, ClosestPairProblem.getClosestPair(points));
    }
}

/*
 * MIT License
 *
 * Copyright (c) 2020 Zhixiao Yang
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

import junit.framework.TestCase;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ComplexTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testToString() {
        TestCase.assertEquals("0", new Complex(0, 0).toString());
        TestCase.assertEquals("2.0i", new Complex(0, 2).toString());
        TestCase.assertEquals("-3.5i", new Complex(0, -3.5).toString());
        TestCase.assertEquals("4.7", new Complex(4.7, 0).toString());
        TestCase.assertEquals("-1.0", new Complex(-1, 0).toString());
        TestCase.assertEquals("1.0+2.0i", new Complex(1, 2).toString());
        TestCase.assertEquals("-3.0-4.0i", new Complex(-3, -4).toString());
    }

    @Test
    public void testEquals() {
        TestCase.assertEquals(new Complex(-3, -4).toString(), new Complex(-3, -4).toString());
    }

    @Test
    public void testAdd() {
        TestCase.assertEquals(new Complex(7, -6), new Complex(-3, -4).add(new Complex(10, -2)));
    }

    @Test
    public void testSubtract() {
        TestCase.assertEquals(new Complex(-4, 6), new Complex(-3, -4).subtract(new Complex(1, -10)));
    }

    @Test
    public void testMultiply() {
        TestCase.assertEquals(new Complex(14, -5), new Complex(1, -4).multiply(new Complex(2, 3)));
    }

    @Test
    public void testDivide_01() {
        expectedException.expect(ArithmeticException.class);
        expectedException.expectMessage("divide by 0");
        new Complex(1, 2.5).divide(new Complex(0, 0));
    }

    @Test
    public void testDivide_02() {
        TestCase.assertEquals(new Complex(2, 0), new Complex(2, 0).divide(new Complex(1, 0)));
        TestCase.assertEquals(new Complex(3, 0), new Complex(0, -12).divide(new Complex(0, -4)));
        TestCase.assertEquals(new Complex(1, 0), new Complex(1, -4).divide(new Complex(1, -4)));
        TestCase.assertEquals(new Complex(0, -5), new Complex(5, 0).divide(new Complex(0, 1)));
        TestCase.assertEquals(new Complex(11.0 / 25.0, 2.0 / 25.0), new Complex(1, 2).divide(new Complex(3, 4)));
    }
}

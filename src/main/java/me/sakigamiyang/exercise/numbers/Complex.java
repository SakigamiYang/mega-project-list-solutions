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

import java.util.Objects;

class Complex {
    private double r;
    private double i;

    public Complex(double r, double i) {
        this.r = r;
        this.i = i;
    }

    public Complex add(Complex other) {
        return new Complex(this.r + other.r, this.i + other.i);
    }

    public Complex subtract(Complex other) {
        return new Complex(this.r - other.r, this.i - other.i);
    }

    public Complex multiply(Complex other) {
        return new Complex(this.r * other.r - this.i * other.i, this.r * other.i + this.i * other.r);
    }

    public Complex divide(Complex other) {
        if (other.r == 0 && other.i == 0) {
            throw new ArithmeticException("divide by 0");
        }
        double otherR2 = other.r * other.r + other.i * other.i;
        return new Complex((this.r * other.r + this.i * other.i) / otherR2,
                (this.i * other.r - this.r * other.i) / otherR2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return Double.compare(complex.r, r) == 0 &&
                Double.compare(complex.i, i) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r, i);
    }

    @Override
    public String toString() {
        if (r == 0 && i == 0) {
            return "0";
        } else if (r == 0) {
            return String.format("%si", this.i);
        } else if (i == 0) {
            return String.valueOf(this.r);
        } else {
            return String.format("%s%s%si", this.r, (this.i > 0 ? "+" : ""), this.i);
        }
    }
}

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

class ClosestPairProblem {
    static Point[] getClosestPair(Point[] points) {
        if (points == null) {
            throw new IllegalArgumentException("points can not be null.");
        }

        int pointsLen = points.length;

        if (pointsLen <= 1) {
            throw new IllegalArgumentException("points must contain at least 2 items.");
        }

        double minDistance = Double.POSITIVE_INFINITY, tempDistance;
        Point p1 = null, p2 = null;
        for (int i = 0; i < pointsLen; ++i) {
            for (int j = i + 1; j < pointsLen; ++j) {
                tempDistance = points[i].distanceTo(points[j]);
                if (tempDistance < minDistance) {
                    p1 = points[i];
                    p2 = points[j];
                    minDistance = tempDistance;
                }
            }
        }
        return new Point[]{p1, p2};
    }
}

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distanceTo(Point other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    @Override
    public String toString() {
        return String.format("Point(%f, %f)", this.x, this.y);
    }
}

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

class DistanceBetween2Cities {
    // radius of earth (km)
    private static final double R = 6371.0;

    public static double distance(double lat_1, double lng_1, double lat_2, double lng_2) {
        // calculate great circle distance
        lat_1 = lat_1 / 180.0 * Math.PI;
        lng_1 = lng_1 / 180.0 * Math.PI;
        lat_2 = lat_2 / 180.0 * Math.PI;
        lng_2 = lng_2 / 180.0 * Math.PI;
        double deltaLat = lat_1 - lat_2;
        double deltaLng = lng_1 - lng_2;
        double a = Math.pow(Math.sin(deltaLat / 2), 2) +
                Math.cos(lat_1) * Math.cos(lat_2) * Math.pow(Math.sin(deltaLng / 2), 2);
        return R * 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
    }
}

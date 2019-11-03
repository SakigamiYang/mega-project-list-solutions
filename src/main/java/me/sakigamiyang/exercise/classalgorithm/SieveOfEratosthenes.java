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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SieveOfEratosthenes {
    static int[] getPrimes(int n) {
        // Create a boolean array "primeFlags[0..n]" and initialize all entries it as true.
        // A value in primeFlags[i] will finally be false if i is NOT a prime, else true.
        boolean[] primeFlags = new boolean[n + 1];
        Arrays.fill(primeFlags, true);

        for (int p = 2; p * p <= n; ++p) {
            if (primeFlags[p]) {
                for (int i = p * 2; i <= n; i += p) {
                    primeFlags[i] = false;
                }
            }
        }

        // Print all prime numbers
        List<Integer> result = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (primeFlags[i]) {
                result.add(i);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}

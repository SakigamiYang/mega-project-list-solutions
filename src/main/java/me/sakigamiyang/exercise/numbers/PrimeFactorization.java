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

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

class PrimeFactorization {
    private static LongStream internalFactorize(long num, long lastFactor) {
        return LongStream.rangeClosed(lastFactor, (long) Math.sqrt(num))
                .filter(x -> num % x == 0)
                .mapToObj(x -> LongStream.concat(LongStream.of(x), internalFactorize(num / x, x)))
                .findFirst()
                .orElse(LongStream.of(num));
    }

    static List<Long> factorize(long num) {
        return internalFactorize(num, 2).boxed().sorted().collect(Collectors.toList());
    }
}

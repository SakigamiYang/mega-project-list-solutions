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

class Sorting {
    private static void merge(int[] arr, int l, int m, int r) {
        // Find sizes of two sub-arrays to be merged.
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays.
        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy data to temp arrays.
        System.arraycopy(arr, l, left, 0, n1);
        System.arraycopy(arr, m + 1, right, 0, n2);

        /* Merge the temp arrays */
        // Initial indexes of first and second sub-arrays.
        int i = 0, j = 0;
        // Initial index of merged sub-array array.
        int k = l;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left[] if any.
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements of right[] if any.
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    private static void sort(int[] arr, int l, int r) {
        if (l < r) {
            // Find the middle point.
            int m = (l + r) / 2;
            // Sort every half.
            sort(arr, l, m);
            sort(arr, m + 1, r);
            // Merge the sorted halves.
            merge(arr, l, m, r);
        }
    }

    static void mergeSort(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("arr can not be null.");
        }

        int n = arr.length;

        if (n <= 1) {
            return;
        }

        sort(arr, 0, n - 1);
    }

    static void bubbleSort(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("arr can not be null.");
        }

        int n = arr.length;

        if (n <= 1) {
            return;
        }

        int i, j, temp;
        boolean swapped;

        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap ar[j] and arr[j + 1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped by inner loop, then break
            if (!swapped) {
                break;
            }
        }
    }
}

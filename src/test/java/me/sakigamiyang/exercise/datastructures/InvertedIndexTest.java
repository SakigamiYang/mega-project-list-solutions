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

package me.sakigamiyang.exercise.datastructures;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;

public class InvertedIndexTest {
    private static InvertedIndex ii;

    @BeforeClass
    public static void initializeInvertedIndex() {
        List<List<String>> documents = new ArrayList<>();
        List<String> doc1 = Arrays.asList("i be a student , i love play game .".split(" "));
        List<String> doc2 = Arrays.asList("a student who be play the game be me .".split(" "));
        List<String> doc3 = Arrays.asList("to be or not to be , that be a question".split(" "));
        List<String> doc4 = Arrays.asList("game can not answer the question !".split(" "));
        List<String> doc5 = Arrays.asList("what the fxxk !".split(" "));
        documents.add(doc1);
        documents.add(doc2);
        documents.add(doc3);
        documents.add(doc4);
        documents.add(doc5);

        ii = new InvertedIndex();
        ii.addDocuments(documents);
    }

    @Test
    public void testFindWords_01() {
        Set<Integer> result = ii.findWords(Collections.singletonList("xxx"));
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testFindWords_02() {
        Set<Integer> result = ii.findWords(Collections.singletonList("fxxk"));
        Assert.assertEquals(1, result.size());
        Assert.assertTrue(result.contains(4));
    }

    @Test
    public void testFindWords_03() {
        Set<Integer> result = ii.findWords(Collections.singletonList("game"));
        Assert.assertEquals(3, result.size());
        Assert.assertTrue(result.containsAll(Arrays.asList(0, 1, 3)));
    }

    @Test
    public void testFindWords_04() {
        Set<Integer> result = ii.findWords(Arrays.asList("be", "a", "student"));
        Assert.assertEquals(2, result.size());
        Assert.assertTrue(result.containsAll(Arrays.asList(0, 1)));
    }
}

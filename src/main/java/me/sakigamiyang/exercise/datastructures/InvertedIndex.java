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

import java.util.*;

class InvertedIndex {
    private Trie trie;

    InvertedIndex() {
        this.trie = new Trie();
    }

    public void addDocuments(Iterable<? extends Iterable<String>> documents) {
        int documentId = -1;
        for (Iterable<String> document : documents) {
            ++documentId;
            for (String word : document) {
                this.trie.addWord(word, documentId);
            }
        }
    }

    public Set<Integer> findWords(Iterable<String> words) {
        List<Set<Integer>> listOfDocumentIds = new ArrayList<>();
        for (String word : words) {
            TrieNode node = this.trie.findWord(word);
            if (node != null) {
                listOfDocumentIds.add(node.getDocumentIds());
            }
        }
        if (listOfDocumentIds.size() > 0) {
            return listOfDocumentIds.stream()
                    .skip(1)
                    .collect(() -> new TreeSet<>(listOfDocumentIds.get(0)), Set::retainAll, Set::retainAll);
        } else {
            return Collections.emptySet();
        }
    }
}

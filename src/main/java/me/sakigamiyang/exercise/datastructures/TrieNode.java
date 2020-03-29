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

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class TrieNode {
    private boolean isWord;
    private Set<Integer> documentIds;
    private Map<Character, TrieNode> childNodes;

    TrieNode(boolean isWord) {
        this.isWord = isWord;
        this.documentIds = new TreeSet<>();
        this.childNodes = new HashMap<>();
    }

    public boolean isWord() {
        return isWord;
    }

    public Set<Integer> getDocumentIds() {
        return documentIds;
    }

    public TrieNode findChildNode(char ch) {
        return this.childNodes.get(ch);
    }

    public TrieNode findOrCreateChildNode(char ch, boolean isWord) {
        TrieNode result = this.childNodes.get(ch);
        if (result == null) {
            result = new TrieNode(isWord);
            this.childNodes.put(ch, result);
        }
        return result;
    }

    public void addDocumentId(int documentId) {
        this.documentIds.add(documentId);
    }
}

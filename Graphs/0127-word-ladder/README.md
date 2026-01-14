<h2><a href="https://leetcode.com/problems/word-ladder/">127. Word Ladder</a></h2><h3>Hard</h3><hr>

<p>A <strong>transformation sequence</strong> from word <code>beginWord</code> to word <code>endWord</code> using a dictionary <code>wordList</code> is a sequence of words <code>beginWord -> s<sub>1</sub> -> s<sub>2</sub> -> ... -> s<sub>k</sub></code> such that:</p>

<ul>
 <li>Every adjacent pair of words differs by a single letter.</li>
 <li>Every <code>s<sub>i</sub></code> for <code>1 <= i <= k</code> is in <code>wordList</code>.  Note that <code>beginWord</code> doe snot need to be in <code>wordList</code>.</li>
 <li><code>s<sub>k</sub> == endWord</code></li>
</ul>

<p>Given two words, <code>beginWord</code> and <code>endWord</code>, and a dictionary <code>wordList</code>, return <em>the <strong>number of words</strong> in the <strong>shortest transformation sequence</strong> from <code>beginWord</code> to <code>endWord</code>, or <code>0</code> if no such sequence exists.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> beginWord = "hit", endWord = "cog", wordList = ["hot", "dot", "dog", "lot", "log", "cog"]
<strong>Output:</strong> 5
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> beginWord = "hit", endWord = "cog", wordList = ["hot", "dot", "dog", "lot", "log"]
<strong>Output:</strong> 0
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 <= beginWord.length <= 10</code></li>
	<li><code>endWord.length == beginWord.length</code></li>
    <li><code>1 <= wordList.length <= 5000</code></li>
    <li><code>wordList[i].length == beginWord.length</code></li>
    <li><code>beginWord</code>, <code>endWord</code>, and <code>wordList[i]</code> consist of lowercase English letters.</li>
    <li><code>beginWord != endWord</code></li>
    <li>All words in <code>wordList</code> are <strong>unique</strong>.</li>
</ul>
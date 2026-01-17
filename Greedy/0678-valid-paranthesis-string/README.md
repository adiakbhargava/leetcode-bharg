<h2><a href="https://leetcode.com/problems/valid-parenthesis-string/">678. Valid Paranthesis String</a></h2><h3>Medium</h3><hr><p>Given a string <code>s</code> containing only three types of characters: <code>'('</code>, <code>')'</code> and <code>'*'</code>, return <code>true</code> <em>if <code>s</code> is <strong>valid</strong>.</p>

<p>The following rules define a <strong>valid</strong> string:</p>

<ul>
    <li>Any left <code>'('</code> must have a corresponding right paranthesis <code>')'</code>.</li>
    <li>Any right paranthesis <code>')'</code> must have a corresponding left paranthesis <code>'('</code>.</li>
    <li>Left paranthesis <code>'('</code> must go before the corresponding right paranthesis <code>')'</code>.</li>
    <li><code>'*'</code> could be treated as as single right paranthesis <code>')'</code> or a single left paranthesis <code>'('</code> or an empty string <code>""</code>.
<ul>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = "()"
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = "(*)"
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> s = "(*))"
<strong>Output:</strong> true
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 <>= s.length <= 100</code></li>
	<li><code>s[i]</code> is <code>'('</code>, <code>')'</code> or <code>'*'</code>.</li>
</ul>
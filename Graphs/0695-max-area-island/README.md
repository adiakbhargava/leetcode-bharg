<h2><a href="https://leetcode.com/problems/max-area-of-island">695. Max Area of Island</a></h2><h3>Medium</h3><hr><p>You are given an <code>m x n</code> binary matrix <code>grid</code>.  AN island is a group of <code>1's</code> (representing land) connected <strong>4-directionally</strong> (horizontal or vertical.)  You may assume all four edges of the grid are surrounded by water.</p>

<p>The <strong>area</strong> of an island is the number of cells with a value <code>1</code> in the island.</p>

<p>Return <em>the maximum <strong>area</strong> of an island in</em> <code>grid</code>.  If there is no island, return <code>0</code>.

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<img alt="" src="https://assets.leetcode.com/uploads/2021/05/01/maxarea1-grid.jpg" style="width: 1053px; height: 653px;" />

<pre>
<strong>Input:</strong> grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]
<strong>Output:</strong> 6
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> grid = [[0,0,0,0,0,0,0,0]]
<strong>Output:</strong> 0
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>m == grid.length</code></li>
	<li><code>n == grid[i].length</code></li>
    <li><code>1 <= m, n <= 50</code></li>
    <li><code>grid[i][j]</code> is either <code>0</code> or <code>1</code>.</li>
</ul>
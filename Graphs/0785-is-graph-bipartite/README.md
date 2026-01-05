<h2><a href="https://leetcode.com/problems/is-graph-bipartite">785. Is Graph Bipartite?</a></h2><h3>Medium</h3><hr>

<p>There is an <strong>undirected</strong> graph with <code>n</code> nodes, where each node is numbered between <code>0</code> and <code>n - 1</code>. You are given a 2D array <code>graph</code>, where <code>graph[u]</code> is an array of nodes that node <code>u</code> is adjacent to.  More formally, for each <code>v</code> in <code>graph[u]</code>, there is an undirected edge between node <code>u</code> and node <code>v</code>.  The graph has the following properties:</p>

<ul>
    <li>There are no self-edges (<code>graph[u]</code> does not contain <code>u</code>).</li>
    <li>There are no parallel edges (<code>graph[u]</code> does not contain duplicate values).</li>
    <li>If <code>v</code> is in <code>graph[u]</code>, then <code>u</code> is in <code>graph[v]</code> (the  graph is undirected).</li>
    <li>The graph may not be connected, meaning there may be two nodes <code>u</code> and <code>v</code> such that there is no path between them.</li>
</ul>

<p>A graph is <strong>bipartite</strong> if the nodes can be partitioned into two independent sets <code>A</code> and <code>B</code> such that <strong>every</strong> edge in the graph connects a node in set <code>A</code> and a node in set <code>B</code>.</p>

<p>Return <code>true</code> <em>if and only if it is <strong>bipartite</strong>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/10/21/bi1.jpg" style="width: 222px; height: 222px;" />

<pre>
<strong>Input:</strong> grid = [[1,3],[0,2],[1,3],[0,2]]
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/10/21/bi2.jpg" style="width: 222px; height: 222px;" />
<pre>
<strong>Input:</strong> grid = [[1,2,3],[0,2],[0,1,3],[0,2]]
<strong>Output:</strong> false
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>graph.length == n</code></li>
	<li><code>1 <= n <= 100</code></li>
    <li><code>0 <= graph[u].length < n</code></li>
    <li><code>graph[u]</code> does not contain <code>u</code>.</li>
    <li>If <code>graph[u]</code> contains <code>v</code>, then <code>graph[v]</code> contains <code>u</code>.</li>
</ul>
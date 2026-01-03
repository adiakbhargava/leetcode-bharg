<h2><a href="https://leetcode.com/problems/clone-graph/">133. Clone Graph</a></h2><h3>Medium</h3><hr>

<p>Given a reference of a node in a connected undirected graph.</p>

<p>Return a deep copy (clone) of the graph.</p>

<p>Each node in the graph contains a value (<code>int</code>) and a list (<code>List[Node]</code>) of its neighbors.</p>

<p><strong>Test case format:</strong></p>
<p>For simplicity, each node's value is the same as the node's index (1-indexed).  For example, the first node iwth <code>val == 1</code>, the second node with <code>val == 2</code>, and so on.  The graph is represented in teh test case useing an adjacency list.</p>

<p><strong>An adjacency list</strong> is a collection of unordered <strong>lists</strong> used to represent a finite grpah.  Each list describes the set of neighbors of a node in the graph.</p>

<p>The given ndoe will always be the first node with <code>val = 1</code>.  You must return the <strong>copy of the given node</strong> as a reference to the cloned graph.

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2019/11/04/133_clone_graph_question.png" style="width: 2008px; height: 2210px;" />

<pre>
<strong>Input:</strong> adjList = [[2,4],[1,3],[2,4],[1,3]]
<strong>Output:</strong> [[2,4],[1,3],[2,4],[1,3]]
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/01/07/graph.png" style="width: 163px; height: 148px;" />

<pre>
<strong>Input:</strong> adjList = [[]]
<strong>Output:</strong> [[]]
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> adjList = []
<strong>Output:</strong> []
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the graph is in the range <code>[0, 100]</code>.</li>
	<li><code>1 <= Node.val <= 100</code></li>
    <li><code>Node.val</code> is unique for each node.</li>
    <li>There are no repreated edges and no self-loops in the graph.</li>
    <li>The Graph is connected and all ndoes can be visited starting from the given node.</li>
</ul>
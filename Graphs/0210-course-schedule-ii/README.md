<h2><a href="https://leetcode.com/problems/course-schedule-ii/">210. Course Schedule II</a></h2><h3>Medium</h3><hr><p>There are a total of <code>numCourses</code> courses you have to take, labeled from <code>0</code> to <code>numCourses - 1</code>.  You are given an array <code>prerequisities</code> where <code>prequisities[i] = [a<sub>i</sub>, b<sub>i</sub>]</code> indicates that you <strong>must</strong> take course <code>b<sub>i</sub></code> first if you want to take course <code>a<sub>i</sub></code>.</p>

<ul>
    <li>For example, the pair <code>[0,1]</code>, indicates that to take course <code>0</code> you have to first take course <code>1</code>.</li>
</ul>

<p>Return <em>the ordering of courses you should take to finish all courses</em>.  If there are many valid answers, return <strong>any</strong> of them.  If it is impossible to finish all courses, return <strong>an empty array</strong>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> numCourses = 2, prerequisities = [[1,0]]
<strong>Output:</strong> [0,1]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> numCourses = 4, prerequisities = [[1,0],[2,0], [3,1], [3,2]]
<strong>Output:</strong> [0,2,1,3] OR [0,1,2,3]
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> numCourses = 1, prerequisities = []
<strong>Output:</strong> [0]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 <= numCourses <= 2000</code></li>
	<li><code>0 <= prerequisities.length <= numCourses * (numCourses - 1)</code></li>
    <li><code>prerequisities[i].length == 2</code></li>
    <li>0 <= a<sub>i</sub>, b<sub>i</sub> < numCourses</li>
    <li><code>a<sub>i</sub> != b<sub>i</sub></code></li>
    <li>All the pairs <code>[a<sub>i</sub>, b<sub>i</sub>]</code> are <strong>distinct</strong>.
</ul>
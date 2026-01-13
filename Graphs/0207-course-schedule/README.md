<h2><a href="https://leetcode.com/problems/course-schedule/">207. Course Schedule</a></h2><h3>Medium</h3><hr><p>There are a total of <code>numCourses</code> courses you have to take, labeled from <code>0</code> to <code>numCourses - 1</code>.  You are given an array <code>prerequisities</code> where <code>prequisities[i] = [a<sub>i</sub>, b<sub>i</sub>]</code> indicates that you <strong>must</strong> take course <code>b<sub>i</sub></code> first if you want to take course <code>a<sub>i</sub></code>.</p>

<ul>
    <li>For example, the pair <code>[0,1]</code>, indicates that to take course <code>0</code> you have to first take course <code>1</code>.</li>
</ul>

<p>Return <code>true</code> if you can finish all courses. Otherwise, return <code>false</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> numCourses = 2, prerequisities = [[1,0]]
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> numCourses = 2, prerequisities = [[1,0],[0,1]]
<strong>Output:</strong> false
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 <= numCourses <= 2000</code></li>
	<li><code>0 <= prerequisities.length <= 5000</code></li>
    <li><code>prerequisities[i].length == 2</code></li>
    <li>0 <= a<sub>i</sub>, b<sub>i</sub> < numCourses</li>
    <li>All the pairs prerequisities[i] are <strong>unique</strong>.</li>
</ul>
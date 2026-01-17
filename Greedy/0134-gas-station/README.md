<h2><a href="https://leetcode.com/problems/gas-station/">134. Gas Station</a></h2><h3>Medium</h3><hr><p>There are <code>n</code> gas stations along a circular route, where the amount of gas at the <code>i<sup>th</sup></code> station is <code>gas[i]</code>.</p>

<p>You have a car wiht an unlimited gas tank and it costs <code>cost[i]</code> of gas to travel from the <code>i<sup>th</sup></code> station to its next <code>(i + 1)<sup>th</sup></code> station.  You being the journey wiht an empty tank at one of the gas stations.</p>

<p>Given two integers arrays <code>gas</code> and <code>cost</code>, return <em>the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return <code>-1</code>.</em>  If there exists a solution, it is <strong>guaranteed</strong> to be <strong>unique</strong>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> gas = [1,2,3,4,5], cost = [3,4,5,1,2]
<strong>Output:</strong> 3
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> gas = [2,3,4], cost = [3,4,3]
<strong>Output:</strong> -1
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>n == gas.length == cost.length</code></li>
	<li><code>1 <= n <= 10<sup>5</sup></code></li>
    <li><code>0 <= gas[i], cost[i] <= 10<sup>4</sup></code></li>
    <li>The input is generated such that the answer is unique.</li>
</ul>
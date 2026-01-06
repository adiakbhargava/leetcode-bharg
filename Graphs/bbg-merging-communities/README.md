<h2><a href="https://bytebytego.com/exercises/coding-patterns/graphs/merging-communities">Merging Communities</a></h2><h3>Hard</h3><hr>

<p>There are <code>n</code> people numbered from <code>0</code> to <code>n - 1</code>, with each person initially belonging to a separate community.  When two people from different communities connect, their communities merge into a single community.</p>

<p>Your goal is to write two functions:</p>

<ul>
    <li><strong><code>connect(Integer x, Integer y)</code></strong>: Connects person <code>x</code> with person <code>y</code> and merges their communities.</li>
    <li><strong><code>getCommunitySize(Integer x)</code></strong>: Returns the size of the community which person <code>x</code> belongs to.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="example">Example:</strong></p>
<img alt="" src="https://bytebytego.com/images/exercises/coding-patterns/graphs/merging-communities/merging-communities-4AA4FKUZ.svg" style="width: 514px; height: 568px;" />

<pre>
<strong>Input:</strong> n = 5, 
[
    connect(0, 1),
    connect(1, 2),
    getCommunitySize(3),
    getCommunitySize(0),
    connect(3, 4),
    getCommunitySize(4)
]
<strong>Output:</strong> [1, 3, 2]
<h2><a href="https://leetcode.com/problems/accounts-merge/">721. Accounts Merge</a></h2><h3>Medium</h3><hr>

<p>Given a list of <code>accounts</code> where each element <code>accounts[i]</code> is a list of strings, where the first element <code>accounts[i][0]</code> is a name, and the rest of the elements are <strong>emails</strong> representing emails of the account.</p>

<p>Now, we would like to merge these accounts.  Two accounts definitely belong to the same person if there is some common emaiml to both accounts.  Note that even if two accounts have the same name, they may belong to different people as people could have the same name.  A person can have any number of accounts initially, but all of their accounts definitely have the same name.</p>

<p>After merging the accounts, return the accounts in the following format: the first element of each account is the name, and the rest of the elements are emails <strong>in sorted order</strong>.  The accounts themsleves can be reurned in <strong>any order</strong>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> accounts =
[["John","johnsmith@mail.com","john_newyork@mail.com"],
["John","johnsmith@mail.com,"john00@mail.com"],["Mary","mary@mail.com"],["John","johnnybravo@mail.com"]]
<strong>Output:</strong> 
[["John","john00@mail.com","john_newyork
@mail.com","johnsmith@mail.com"],
["Mary","mary@mail.com"],
["John","johnnybravo@mail.com"]]

<p>&nbsp;</p>
<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> accounts =
[["Gabe","Gabe0@m.co","Gabe3@m.co","Gabe
1@m.co"],
["Kevin","Kevin3@m.co,"Kevin5@m.co","Ke
vin0@m.co"],
["Ethan","Ethan5@m.co","Ethan4@m.co","Et
han0@m.co"],
["Hanzo","Hanzo3@m.co","Hanzo1@m.co","Ha
nzo0@m.co"],
["Fern","Fern5@m.co","Fern1@m.co","Fern0
@m.co"]]
<strong>Output:</strong> 
[["Ethan","Ethan0@m.co","Ethan4@m.co","Et
han5@m.co"],
["Gabe","Gabe0@m.co","Gabe1@m.co","Gabe3
@m.co"],
["Hanzo","Hanzo0@m.co","Hanzo1@m.co","Ha
nzo3@m.co"],
["Kevin","Kevin0@m.co,"Kevin3@m.co","Ke
vin5@m.co"],
["Fern","Fern0@m.co","Fern1@m.co","Fern5
@m.co"]]

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 <= accounts.length <= 100</code></li>
	<li><code>2 <= accounts[i].length <= 10</code></li>
    <li><code>1 <= accounts[i][j].length <= 30</code></li>
    <li><code>accounts[i][0]</code> consists of English letters.</li>
    <li><code>accounts[i][j] (for j > 0)</code> is a valid email.</li>
</ul>
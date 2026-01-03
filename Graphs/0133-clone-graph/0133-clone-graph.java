/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution{
    public Node cloneGraph(Node node){
        if(node == null){
            return null;
        }

        return dfs(node, new HashMap<>());
    }

    public Node dfs(Node node, HashMap<Node, Node> cloneMap){
        if(cloneMap.containsKey(node)){
            return cloneMap.get(node);
        }

        Node clone = new Node(node.val);
        cloneMap.put(node, clone);

        for(Node neighbor : node.neighbors){
            Node neighborClone = dfs(neighbor, cloneMap);
            clone.neighbors.add(neighborClone);
        }

        return clone;
    }
}
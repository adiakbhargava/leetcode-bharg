class Solution {
    public boolean isGraphBipartite(int[][] graph){
        int[] nodeColors = new int[graph.length];

        for(int i = 0; i < graph.length; i++){
            if(nodeColors[i] == 0 && !dfs(i, 1, graph, nodeColors)){
                return false;
            }
        }

        return true;
    }

    public boolean dfs(int node, int color, int[][] graph, int[] colors){
        colors[node] = color;
        for(int neighbor : graph[node]){
            if(colors[neighbor] == color){
                return false;
            }

            if(colors[neighbor] == 0 && !dfs(neighbor, -1*color, graph, colors)){
                return false;
            }
        }

        return true;
    }
}
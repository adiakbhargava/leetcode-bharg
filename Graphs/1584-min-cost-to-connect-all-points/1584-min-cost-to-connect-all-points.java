class Solution{
    public int minCostConnectPoints(int[][] points){
        PriorityQueue<int[]> pq = new PriorityQueue<>();
        pq.offer(new int[]{0,0});

        int minCost = 0;
        Set<Integer> visited = new HashSet<>();

        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int currCost = curr[0];
            int currIndex = curr[1];

            if(visited.contains(currIndex)){
                continue;
            }

            visited.add(currIndex);
            minCost += currCost;

            if(visited.size() == points.length){
                break;
            }

            for(int i = 0; i < points.length; i++){
                if(!visited.contains(i)){
                    int dist = manhattanDistance(points[currIndex], points[i]);
                    pq.offer(new int[]{dist, i});
                }
            }
        }

        return minCost;
    }

    private int manhattanDistance(int[] p1, int[] p2){
        return Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1]);
    }
}   